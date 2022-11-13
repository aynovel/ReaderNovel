package com.bytedance.club;

import static com.bytedance.club.utils.Cods.EXTRA_COLL_BOOK;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.bytedance.club.amodel.ADBean;
import com.bytedance.club.amodel.InboxBean;
import com.bytedance.club.amodel.PayInfo;
import com.bytedance.club.amodel.Work;
import com.bytedance.club.amodel.bean.CollBookBean;
import com.bytedance.club.api.NetRequest;
import com.bytedance.club.bookcase.ShelfUtil;
import com.bytedance.club.bookdetail.WorkDetailActivity;
import com.bytedance.club.homepage.HomeActivity;
import com.bytedance.club.person.pay.PaymentUtil;
import com.bytedance.club.publics.BaseActivity;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.publics.net.OkHttpResult;
import com.bytedance.club.publics.tool.ComYou;
import com.bytedance.club.publics.tool.DeepLinkUtil;
import com.bytedance.club.publics.tool.JSONUtil;
import com.bytedance.club.publics.tool.BDeepLinkUtil;
import com.bytedance.club.publics.tool.ObjectSaveUtils;
import com.bytedance.club.publics.tool.SharedPreferencesUtil;
import com.bytedance.club.taskcenter.TaskCenterActivity;
import com.bytedance.club.ui.read.ReadActivity;
import com.facebook.applinks.AppLinkData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kc.openset.OSETListener;
import com.kc.openset.OSETSplash;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 欢迎页
 *
 * @author haojie
 */
public class SplashActivity extends BaseActivity  {

//    @BindView(R.id.adLayout)
//    FrameLayout mAdLayout;
//    @BindView(R.id.layout_root)
//    View mRootView;
    @BindView(R.id.fl)
    FrameLayout fl;
//    @BindView(R.id.seconds)
//    TextView mSeconds;
    public SharedPreferences config;
    private List<InboxBean.ResultData.Lists.Rec_list> mProjectList = new ArrayList<>();
    private List<InboxBean.ResultData.Lists.Rec_list> mReCordProjectList = new ArrayList<>();
    boolean isConnect = false;
    private final static int START_ACTIVITY = ZERO;
    private final static int COUNT_DOWN = ONE;
    private final static int ADSTART_ACTIVITY = TWO;
    Intent intent = new Intent();
    private int during = ZERO;
    /**
     * 支付信息
     */
    private PayInfo mPayInfo;
    /**
     * google pay
     */
    private BillingClient billingClient;

    private ADBean.ResultData mADData;
    private boolean isOnPause = false;//判断是否跳转了广告落地页
    private boolean isClick = false;//是否进行了点击
    private String mRecId;

    @SuppressLint("MissingPermission")
    @Override
    protected void initializeView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            mRootLayout.setFitsSystemWindows(FALSE);
        }
        mTitleBar.setVisibility(View.GONE);
        mLoadingLayout.setVisibility(View.GONE);
        mContentLayout.setVisibility(View.VISIBLE);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

    }


    @Override
    protected void initializeData() {

        PlotRead.getAppUser().fetchUserInfoNOHide(this);
        SharedPreferencesUtil.putInt(Constant.APP,"Breathing",1);
        OSETSplash.getInstance().show(this, fl, "B9C9FD7C0AD8BD6E2E199CE895572B65", new OSETListener() {
            @Override
            public void onShow() {
                Log.e("openseterror", "onShow");
            }

            @Override
            public void onError(String s, String s1) {
                Log.e("openseterror", "onError——————code:" + s + "----message:" + s1);
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }

            @Override
            public void onClick() {
                isClick = true;
                Log.e("openseterror", "onClick");
            }

            @Override
            public void onClose() {
                Log.e("aaaaaaa", "onclose");
                if (!isOnPause) {//如果已经调用了onPause说明已经跳转了广告落地页
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
                }
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (isOnPause) {//判断是否点击，并且跳转了落地页，如果是，就相当于走了onclose
            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
            finish();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isClick) {
            isOnPause = true;
        }
    }

    @Override
    protected void onDestroy() {
        OSETSplash.getInstance().destroy();
        super.onDestroy();
    }





}
