package com.bytedance.club.entry;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Message;

import com.bytedance.club.activtiy.PlotRead;
import com.bytedance.club.R;
import com.bytedance.club.internet.NetRequest;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.publics.net.OkHttpResult;
import com.bytedance.club.publics.tool.JSONUtil;
import com.bytedance.club.publics.tool.LOG;
import com.bytedance.club.publics.tool.SharedPreferencesUtil;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public class AppUser implements Constant {

    private static AppUser instance;

    public static AppUser get(int id) {
        if (instance == null) {
            synchronized (AppUser.class) {
                if (instance == null) {
                    instance = new AppUser(id);
                }
            }
        }
        return instance;
    }

    private AppUser(int uid) {
        this.uid = uid;
        config = SharedPreferencesUtil.getSharedPreferences(USER + uid);
        token = SharedPreferencesUtil.getString(config, KEY_TOKEN);
        tokenTime = SharedPreferencesUtil.getInt(config, KEY_TOKEN_TIME);
        head = SharedPreferencesUtil.getString(config, KEY_HEAD);
        nickName = SharedPreferencesUtil.getString(config, KEY_NICKNAME);
        sex = SharedPreferencesUtil.getInt(config, KEY_SEX);
        level = SharedPreferencesUtil.getInt(config, KEY_LEVEL);
//        authorId = SharedPreferencesUtil.getString(config, KEY_AUTHOR_ID);
        vip = SharedPreferencesUtil.getInt(config, KEY_VIP);
        signDays = SharedPreferencesUtil.getInt(config, KEY_SIGN_DAYS);
        signDate = SharedPreferencesUtil.getString(config, KEY_SIGN_DATE);
        money = SharedPreferencesUtil.getInt(config, KEY_MONEY);
        voucher = SharedPreferencesUtil.getInt(config, KEY_VOUCHER);
        monthVip = SharedPreferencesUtil.getBoolean(config, KEY_MONTH_VIP);
        monthDate = SharedPreferencesUtil.getInt(config, KEY_MONTH_DATE);
        order_discount = SharedPreferencesUtil.getString(config, KEY_DISCOUNT);
        messageTag = SharedPreferencesUtil.getBoolean(config, KEY_MESSAGE_TAG);
        messageTotal = SharedPreferencesUtil.getInt(config, KEY_MESSAGE_TOTAL);
        author_message= SharedPreferencesUtil.getString(config, KEY_AUTHOR_MESSAGE);
        if (login() && !config.contains(KEY_IS_VISITOR)) {
            isVisitor = FALSE;
        } else {
            isVisitor = config.getBoolean(KEY_IS_VISITOR, uid != ZERO);
        }
    }

    public boolean login() {
        return uid != ZERO;
    }

    /**
     * ?????????????????????????????????????????????????????????id???token
     */
    public void notifyWhenLogin() {
        uid = SharedPreferencesUtil.getInt(APP, LAST_ID);
        config = SharedPreferencesUtil.getSharedPreferences(USER + uid);
        token = SharedPreferencesUtil.getString(config, KEY_TOKEN);
        tokenTime = SharedPreferencesUtil.getInt(config, KEY_TOKEN_TIME);
        isVisitor = config.getBoolean(KEY_IS_VISITOR, uid != ZERO);
    }

    /**
     * ??????????????????
     */
    public void fetchUserInfo(Activity mActivity) {
        NetRequest.getUserInfo(new OkHttpResult() {

            @Override
            public void onSuccess(JSONObject data) {
                String serverNo = JSONUtil.getString(data, "ServerNo");
                if (SN000.equals(serverNo)) {
                    JSONObject result = JSONUtil.getJSONObject(data, "ResultData");
                    int status = JSONUtil.getInt(result, "status");
                    String order = JSONUtil.getString(result, "order_discount");
                    if (status == ONE) {
                        // ??????????????????
                        BeanParser.parseUserInfo(result);
                        // ????????????????????????
                        if (isVisitor) {
                            AppUser user = PlotRead.getAppUser();
                            user.nickName = application.getString(R.string.tourists) + user.uid;
                            user.head = BLANK;
                            user.sex = ZERO;
                            user.level = ZERO;
                            user.vip = ZERO;
                        }
                        // ????????????
                        SharedPreferencesUtil.putString(config, KEY_HEAD, head);
                        SharedPreferencesUtil.putString(config, KEY_NICKNAME, nickName);
                        SharedPreferencesUtil.putInt(config, KEY_SEX, sex);
                        SharedPreferencesUtil.putInt(config, KEY_LEVEL, level);
//                        SharedPreferencesUtil.putString(config, Constant.KEY_AUTHOR_ID, authorId+"");
                        SharedPreferencesUtil.putInt(config, KEY_VIP, vip);
                        SharedPreferencesUtil.putInt(config, KEY_SIGN_DAYS, signDays);
                        SharedPreferencesUtil.putString(config, KEY_SIGN_DATE, signDate);
                        SharedPreferencesUtil.putInt(config, KEY_MONEY, money);
                        SharedPreferencesUtil.putInt(config, KEY_VOUCHER, voucher);
                        SharedPreferencesUtil.putInt(config, KEY_MONTH_DATE, monthDate);
                        SharedPreferencesUtil.putBoolean(config, KEY_MONTH_VIP, monthVip);
                        SharedPreferencesUtil.putBoolean(config, KEY_MESSAGE_TAG, messageTag);
                        SharedPreferencesUtil.putInt(config, KEY_MESSAGE_TOTAL, messageTotal);
                        SharedPreferencesUtil.putString(config, KEY_BIRTHDAY, birthday);
                        SharedPreferencesUtil.putString(config, KEY_SIGNATURE, signature);
                        SharedPreferencesUtil.putString(config, KEY_DISCOUNT, order_discount);
                        SharedPreferencesUtil.putString(config, KEY_AUTHOR_MESSAGE, author_message);
                        // ????????????????????????
                        SharedPreferencesUtil.putInt(PlotRead.getConfig(), SEX, sex);
                        // ????????????????????????????????????
                        Message message = Message.obtain();
                        message.what = BUS_USER_INFO_SUCCESS;
                        EventBus.getDefault().post(message);
                    } else {
                        // ????????????????????????????????????
                        Message message = Message.obtain();
                        message.what = BUS_USER_INFO_FAILURE;
                        EventBus.getDefault().post(message);
//                        String msg = JSONUtil.getString(result, "msg");
//                        PlotRead.toast(PlotRead.INFO, getString(R.string.no_internet));
                    }
                } else {
                    // ????????????????????????????????????
                    Message message = Message.obtain();
                    message.what = BUS_USER_INFO_FAILURE;
                    EventBus.getDefault().post(message);
                    NetRequest.error(mActivity, serverNo);
                }
            }

            @Override
            public void onFailure(String error) {
                // ????????????????????????????????????
                Message message = Message.obtain();
                message.what = BUS_USER_INFO_FAILURE;
                EventBus.getDefault().post(message);
                PlotRead.toast(PlotRead.FAIL, mActivity.getString(R.string.no_internet));
            }
        });
    }



    /**
     * ??????????????????
     */
    public void fetchUserMoney() {
        NetRequest.getUserMoney(new OkHttpResult() {

            @Override
            public void onSuccess(JSONObject data) {
                String serverNo = JSONUtil.getString(data, "ServerNo");
                if (SN000.equals(serverNo)) {
                    JSONObject result = JSONUtil.getJSONObject(data, "ResultData");
                    int status = JSONUtil.getInt(result, "status");
                    if (status == ONE) {
                        // ??????????????????
                        money = JSONUtil.getInt(result, "money");
                        voucher = JSONUtil.getInt(result, "voucher");
                        // ????????????
                        SharedPreferencesUtil.putInt(config, KEY_MONEY, money);
                        SharedPreferencesUtil.putInt(config, KEY_VOUCHER, voucher);
                        // ????????????????????????
                        Message message = Message.obtain();
                        message.what = BUS_MONEY_CHANGE;
                        EventBus.getDefault().post(message);
                    } else {
                        String msg = JSONUtil.getString(result, "msg");
                        LOG.e(getClass().getSimpleName(), msg);
                    }
                }
            }

            @Override
            public void onFailure(String error) {

            }
        });
    }

    public int uid;
    public String token;
    public int tokenTime;
    public SharedPreferences config;

    public String head;
    public String nickName;
    public int sex;
    public int level;
    public int vip;
    public String is_author_user;
    public int signDays;
    public String signDate;
    public int money;
    public int voucher;
    public boolean monthVip;
    public int monthDate;
    public boolean messageTag;
    public int messageTotal;
    public String birthday;
    public String signature;
    public String order_discount;
    public String author_message;
    public boolean isVisitor;


    /**
     * ??????????????????
     */
    public void fetchUserInfoNOHide(Activity mActivity) {
        NetRequest.getUserInfo(new OkHttpResult() {

            @Override
            public void onSuccess(JSONObject data) {
                String serverNo = JSONUtil.getString(data, "ServerNo");
                if (SN000.equals(serverNo)) {
                    JSONObject result = JSONUtil.getJSONObject(data, "ResultData");
                    int status = JSONUtil.getInt(result, "status");
                    String order = JSONUtil.getString(result, "order_discount");
                    if (status == ONE) {
                        // ??????????????????
                        BeanParser.parseUserInfo(result);
                        // ????????????????????????
                        if (isVisitor) {
                            AppUser user = PlotRead.getAppUser();
                            user.nickName = application.getString(R.string.tourists) + user.uid;
                            user.head = BLANK;
                            user.sex = ZERO;
                            user.level = ZERO;
                            user.vip = ZERO;
                        }
                        // ????????????
                        SharedPreferencesUtil.putString(config, KEY_HEAD, head);
                        SharedPreferencesUtil.putString(config, KEY_NICKNAME, nickName);
                        SharedPreferencesUtil.putInt(config, KEY_SEX, sex);
                        SharedPreferencesUtil.putInt(config, KEY_LEVEL, level);
//                        SharedPreferencesUtil.putString(config, Constant.KEY_AUTHOR_ID, authorId+"");
                        SharedPreferencesUtil.putInt(config, KEY_VIP, vip);
                        SharedPreferencesUtil.putInt(config, KEY_SIGN_DAYS, signDays);
                        SharedPreferencesUtil.putString(config, KEY_SIGN_DATE, signDate);
                        SharedPreferencesUtil.putInt(config, KEY_MONEY, money);
                        SharedPreferencesUtil.putInt(config, KEY_VOUCHER, voucher);
                        SharedPreferencesUtil.putInt(config, KEY_MONTH_DATE, monthDate);
                        SharedPreferencesUtil.putBoolean(config, KEY_MONTH_VIP, monthVip);
                        SharedPreferencesUtil.putBoolean(config, KEY_MESSAGE_TAG, messageTag);
                        SharedPreferencesUtil.putInt(config, KEY_MESSAGE_TOTAL, messageTotal);
                        SharedPreferencesUtil.putString(config, KEY_BIRTHDAY, birthday);
                        SharedPreferencesUtil.putString(config, KEY_SIGNATURE, signature);
                        SharedPreferencesUtil.putString(config, KEY_DISCOUNT, order_discount);
                        SharedPreferencesUtil.putString(config, KEY_AUTHOR_MESSAGE, author_message);
                        // ????????????????????????
                        SharedPreferencesUtil.putInt(PlotRead.getConfig(), SEX, sex);
                        // ????????????????????????????????????
                        Message message = Message.obtain();
                        message.what = BUS_USER_INFO_SUCCESS;
                        EventBus.getDefault().post(message);
                    } else {

                    }
                } else {

                }
            }

            @Override
            public void onFailure(String error) {

            }
        });
    }

}
