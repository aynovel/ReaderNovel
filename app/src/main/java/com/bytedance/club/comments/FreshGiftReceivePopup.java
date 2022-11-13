package com.bytedance.club.comments;

import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.bytedance.club.PlotRead;
import com.bytedance.club.R;
import com.bytedance.club.api.NetRequest;
import com.bytedance.club.homepage.HomeActivity;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.publics.net.OkHttpResult;
import com.bytedance.club.publics.tool.ComYou;
import com.bytedance.club.publics.tool.JSONUtil;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FreshGiftReceivePopup extends PopupWindow implements Constant {

    private final HomeActivity activity;
    private final OnReceiveSuccess onReceiveSuccess;
    private final View parent;

    @BindView(R.id.voucher)
    TextView mVoucher;

    public FreshGiftReceivePopup(View parent, HomeActivity activity, int voucher, OnReceiveSuccess onReceiveSuccess) {
        this.parent = parent;
        this.activity = activity;
        this.onReceiveSuccess = onReceiveSuccess;
        View root = LayoutInflater.from(activity).inflate(R.layout.layout_fresh_gift_receive_popup, null, FALSE);
        setContentView(root);
        ButterKnife.bind(this, root);
        setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        setAnimationStyle(R.style.popup_scale_alpha_style);
        setOutsideTouchable(FALSE);
        setFocusable(TRUE);
        setBackgroundDrawable(new ColorDrawable());
        mVoucher.setText(voucher + activity.getString(R.string.bean));
    }

    public void show() {
        ComYou.setWindowAlpha(activity, DOT_FIVE);
        showAtLocation(parent, Gravity.CENTER, ZERO, ZERO);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        ComYou.setWindowAlpha(activity, ONE);
    }

    @OnClick(R.id.receive)
    void onReceiveClick() {
        dismiss();
        receive();
    }

    private void receive() {
        activity.showLoading(activity.getString(R.string.get_in));
        NetRequest.receiveFreshGift(new OkHttpResult() {

            @Override
            public void onSuccess(JSONObject data) {
                activity.dismissLoading();
                String serverNo = JSONUtil.getString(data, "ServerNo");
                if (SN000.equals(serverNo)) {
                    if (onReceiveSuccess != null) {
                        onReceiveSuccess.onSuccess();
                    }
                    JSONObject result = JSONUtil.getJSONObject(data, "ResultData");
                    int status = JSONUtil.getInt(result, "status");
                    String msg = JSONUtil.getString(result, "msg");
                    if (status == ONE) {
                        PlotRead.getAppUser().fetchUserMoney();
                        new FreshGiftReceiveSuccessPopup(activity, msg).show(parent);
                    } else {
                        PlotRead.toast(PlotRead.INFO, activity.getString(R.string.no_internet));
                    }
                }
            }

            @Override
            public void onFailure(String error) {
                activity.dismissLoading();
                PlotRead.toast(PlotRead.FAIL, activity.getString(R.string.no_internet));
            }
        });
    }

    public interface OnReceiveSuccess {

        void onSuccess();
    }
}
