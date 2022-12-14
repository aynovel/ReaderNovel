package com.bytedance.club.publics.weight.viewweb;

import static com.bytedance.club.activtiy.Cods.EXTRA_COLL_BOOK;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.webkit.JavascriptInterface;

import com.bytedance.club.activtiy.PlotRead;
import com.bytedance.club.activtiy.WerActivity;
import com.bytedance.club.entry.Work;
import com.bytedance.club.entry.CollBookBean;
import com.bytedance.club.interfaces.InterFace;
import com.bytedance.club.activtiy.WorkDetailActivity;
import com.bytedance.club.activtiy.TopUpActivity;
import com.bytedance.club.activtiy.ClassifyDetailActivity;
import com.bytedance.club.adapter.person.landing.LoginActivity;
import com.bytedance.club.adapter.person.pay.RechargeCallback;
import com.bytedance.club.adapter.person.readinglevel.SignAndWelfareActivity;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.publics.tool.DisplayUtil;
import com.bytedance.club.publics.tool.JSONUtil;
import com.bytedance.club.publics.tool.LOG;
import com.bytedance.club.activtiy.ReadActivity;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class JsAndroid {

    public static final String NAME = "JsAndroid";
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Activity activity;
    private final Kill webView;
    private HtmlReceiver htmlReceiver;
    private final int[] banner = new int[2];

    private RechargeCallback rechargeCallback;

    /**
     * Html接收器
     *
     * @author Haojie.Dai
     */
    public interface HtmlReceiver {

        /**
         * 处理html内容
         *
         * @param html
         */
        void onReceive(String html);
    }

    public JsAndroid(Activity activity, Kill webView) {
        this.activity = activity;
        this.webView = webView;
    }

    /**
     * 友盟统计 v1.0.2
     *
     * @param param
     */
    @JavascriptInterface
    public void getMobclickAgent(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        String eventId = JSONUtil.getString(object, "key");
        JSONObject info = JSONUtil.getJSONObject(object, "info");
        if (info != null) {
            Map<String, String> map = new HashMap<>();
            Iterator<String> keys = info.keys();
            while (keys != null && keys.hasNext()) {
                String key = keys.next();
                map.put(key, JSONUtil.getString(info, key));
                LOG.i(NAME, "key = " + key);
            }
//            MobclickAgent.onEvent(activity, eventId, map);
        }
    }

    /**
     * 刷新余额
     */
    @JavascriptInterface
    public void refreshAccount() {
        if (PlotRead.getAppUser().login()) {
            PlotRead.getAppUser().fetchUserMoney();
        }
    }

    /**
     * 支付宝支付结果回调
     *
     * @param param
     */
    @JavascriptInterface
    public void getPayResult(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        int status = JSONUtil.getInt(object, "status"); // 1:成功 0:失败
        Message message = Message.obtain();
        message.what = Constant.BUS_ALI_PAY_RESULT;
        message.obj = status;
        EventBus.getDefault().post(message);
    }

    @JavascriptInterface
    public void getTaskUrl() {
        Intent intent = new Intent(activity, SignAndWelfareActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /**
     * 充值
     *
     * @param param
     */
    @JavascriptInterface
    public void getRecharge(String param) {
        Intent intent = new Intent(activity, TopUpActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /**
     * 分享
     *
     * @param param
     */
    @JavascriptInterface
    public void getShareUrl(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        String index = JSONUtil.getString(object, "url");
        String path = JSONUtil.getString(object, "path");
        final int shareType = JSONUtil.getInt(object, "type");
        final int sharefresh = JSONUtil.getInt(object, "sharefresh");
        String shareUrl = JSONUtil.getString(object, "shareurl");
        String title = JSONUtil.getString(object, "title");
        String desc = JSONUtil.getString(object, "desc");
        String image = JSONUtil.getString(object, "image");
//        final UMWeb umWeb = new UMWeb(shareUrl);
//        umWeb.setTitle(title);
//        umWeb.setDescription(desc);
//        umWeb.setThumb(new UMImage(activity, image));

        mHandler.post(new Runnable() {

            @Override
            public void run() {
//                SharePopup sharePopup = new SharePopup(activity, shareType, Constant.ZERO, umWeb);
//                sharePopup.setOnSuccessShareListener(new SharePopup.OnSuccessShareListener() {
//
//                    @Override
//                    public void onSuccess() {
//                        if (sharefresh == Constant.ONE) {
//                            webView.reload();
//                        }
//                    }
//                });
//                sharePopup.show(webView);
            }
        });

    }

    /**
     * 登录
     *
     * @param param
     */
    @JavascriptInterface
    public void getLoginUrl(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        Intent intent = new Intent(activity, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void getPayInfo(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        final int channel = JSONUtil.getInt(object, "channel");
        final int channel_child = JSONUtil.getInt(object, "channel_child");
        final String iapid = JSONUtil.getString(object, "iapid");
        final int ruleId = JSONUtil.getInt(object, "rule_id");
        final double cash = JSONUtil.getDouble(object, "money");
        final JSONObject custom = JSONUtil.getJSONObject(object, "custom");
        mHandler.post(new Runnable() {

            @Override
            public void run() {
                rechargeCallback.onResult(channel, channel_child,ruleId,iapid, cash, Constant.ZERO, custom);
            }
        });
    }

    @JavascriptInterface
    public void getMonthlyPayInfo(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        final int channel = JSONUtil.getInt(object, "channel");
        final int channel_child = JSONUtil.getInt(object, "channel_child");
        final int ruleId = JSONUtil.getInt(object, "rule_id");
        final String iapid = JSONUtil.getString(object, "iapid");
        final double cash = JSONUtil.getDouble(object, "rmb");
        final int counts = JSONUtil.getInt(object, "counts");
        final JSONObject custom = JSONUtil.getJSONObject(object, "custom");
        mHandler.post(new Runnable() {

            @Override
            public void run() {
                rechargeCallback.onResult(channel,channel_child, ruleId,iapid, cash, counts, custom);
            }
        });
    }

    @JavascriptInterface
    public void getMonthlyCostInfo(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        final int channel = JSONUtil.getInt(object, "channel_type");
        final int channel_child = JSONUtil.getInt(object, "channel_child");
        final int ruleId = JSONUtil.getInt(object, "rule_id");
        final String iapid = JSONUtil.getString(object, "iapid");
        final double cash = JSONUtil.getDouble(object, "money");
        final int counts = JSONUtil.getInt(object, "counts");
        final JSONObject custom = JSONUtil.getJSONObject(object, "custom");
        mHandler.post(new Runnable() {

            @Override
            public void run() {
                rechargeCallback.onResult(channel,channel_child, ruleId, iapid,cash, counts, custom);
            }
        });
    }

    @JavascriptInterface
    public void getOrderRespond(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        Message message = Message.obtain();
        message.what = Constant.BUS_START_MULTI_BUY;
        message.obj = object;
        EventBus.getDefault().post(message);
    }

    @JavascriptInterface
    public void getPageUrl(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        String index = JSONUtil.getString(object, "url");
        String path = JSONUtil.getString(object, "path");
        int pagefresh = JSONUtil.getInt(object, "pagefresh");
        int share = JSONUtil.getInt(object, "share");
        int sharefresh = JSONUtil.getInt(object, "sharefresh");
        int shareType = JSONUtil.getInt(object, "type");
        String title = JSONUtil.getString(object, "title");
        String desc = JSONUtil.getString(object, "desc");
        String img = JSONUtil.getString(object, "image");
        String shareurl = JSONUtil.getString(object, "shareurl");

        Intent intent = new Intent();
        if (InterFace.H5_RECHARGE_MONTH_VIP.equals(path)) {
//            intent.setClass(activity, MonthVipTopUpActivity.class);
        } else {
            intent.setClass(activity, WerActivity.class);
            intent.putExtra("index", index);
            intent.putExtra("path", path);
            intent.putExtra("pagefresh", pagefresh == 0);
            intent.putExtra("share", share == 1);
            intent.putExtra("sharefresh", sharefresh == 1);
            intent.putExtra("shareType", shareType);
            intent.putExtra("shareTitle", title);
            intent.putExtra("shareDesc", desc);
            intent.putExtra("shareImg", img);
            intent.putExtra("shareUrl", shareurl);
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void getAdUrl(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        String url = JSONUtil.getString(object, "url");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void getArticleInfo(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        int wid = JSONUtil.getInt(object, "wid");
        int recid = JSONUtil.getInt(object, "recid");
        int readflag = JSONUtil.getInt(object, "readflag");
        LOG.i(NAME, "readflag = " + readflag);

        Intent intent = new Intent();
        if (readflag == 0) {
            intent.setClass(activity, WorkDetailActivity.class);
            intent.putExtra("wid", wid);
            intent.putExtra("recid", recid);
        } else {
            Work work = new Work();
            work.wid = wid;
            work.recId = recid;
            int order = JSONUtil.getInt(object, "cid_index");
            work.lastChapterOrder = order > 0 ? order - 1 : 0;
            work.toReadType = 2;
            intent.setClass(activity, ReadActivity.class);
            intent.putExtra("work", work);
            CollBookBean mCollBook  = new CollBookBean();
            mCollBook.setTitle(work.title);
            mCollBook.set_id(work.wid+"");
            intent.putExtra(EXTRA_COLL_BOOK, mCollBook);

//            intent.putExtra("type", ReadActivity.NOT_FROM_SHELF);
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /**
     * 获取排行榜信息
     *
     * @param param
     */
    @JavascriptInterface
    public void getRankInfo(String param) {
//        param = new String(Base64.decode(param, Base64.DEFAULT));
//        LOG.i(NAME, param);
//        JSONObject object = JSONUtil.newJSONObject(param);
//        int page_type = JSONUtil.getInt(object, "page_type");
//        int rank_type = JSONUtil.getInt(object, "rank_type");
//        int cycle_type = JSONUtil.getInt(object, "cycle_type");
//        Intent intent = new Intent(activity, RankingListFragment.class);
//        intent.putExtra("page_type", page_type); // 1 男频 2 女频 3 出版 4 漫画
//        intent.putExtra("rank_type", rank_type);
//        intent.putExtra("cycle_type", cycle_type); // 1 日榜 2 周榜 3 月榜 4 总榜
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        activity.startActivity(intent);
    }

    /**
     * 书库跳转到分类详情
     *
     * @param param
     */
    @JavascriptInterface
    public void getLibraryInfo(String param) {
        param = new String(Base64.decode(param, Base64.DEFAULT));
        LOG.i(NAME, param);
        JSONObject object = JSONUtil.newJSONObject(param);
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> keys = object.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            map.put(key, JSONUtil.get(object, key));
        }
        Intent intent = new Intent(activity, ClassifyDetailActivity.class);
        intent.putExtra("map", map);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    /**
     * 设置充值点击回调
     *
     * @param rechargeCallback
     */
    public void setRechargeCallback(RechargeCallback rechargeCallback) {
        this.rechargeCallback = rechargeCallback;
    }

    /**
     * 设置Html接收器
     *
     * @param htmlReceiver
     */
    public void setHtmlReceiver(HtmlReceiver htmlReceiver) {
        this.htmlReceiver = htmlReceiver;
    }

    /**
     * 获取Banner栏信息
     *
     * @return
     */
    int[] getBanner() {
        return banner;
    }

    @JavascriptInterface
    public void html(final String html) {
        if (htmlReceiver != null) {
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    htmlReceiver.onReceive(html);
                }
            });
        }
    }

    @JavascriptInterface
    public void getH5BannerInfo(int scrollY, int topY, int height) {
        banner[0] = DisplayUtil.dp2px(activity, topY);
        banner[1] = DisplayUtil.dp2px(activity, height);
    }

}
