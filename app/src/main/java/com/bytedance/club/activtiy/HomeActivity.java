package com.bytedance.club.activtiy;


import static com.bytedance.club.activtiy.Cods.EXTRA_COLL_BOOK;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bytedance.club.R;
import com.bytedance.club.entry.ADBean;
import com.bytedance.club.entry.AppUser;
import com.bytedance.club.entry.OverLimmitBook;
import com.bytedance.club.entry.TopUpListBean;
import com.bytedance.club.entry.Work;
import com.bytedance.club.entry.CollBookBean;
import com.bytedance.club.fragment.BookShelfFragment;
import com.bytedance.club.fragment.FeaturedFragment;
import com.bytedance.club.internet.NetRequest;
import com.bytedance.club.bookcase.ShelfUtil;
import com.bytedance.club.linstener.InAppMessagingClickListener;
import com.bytedance.club.adapter.person.UserInfoModifyActivity;
import com.bytedance.club.adapter.person.landing.LoginActivity;
import com.bytedance.club.adapter.person.personcenter.AboutUsActivity;
import com.bytedance.club.adapter.person.personcenter.SettingActivity;
import com.bytedance.club.adapter.person.personcenter.UserHelpActivity;
import com.bytedance.club.publics.BaseFragment;
import com.bytedance.club.publics.BaseFragmentActivity;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.publics.net.OkHttpResult;
import com.bytedance.club.publics.tool.AndroidManifestUtil;
import com.bytedance.club.publics.tool.ComYou;
import com.bytedance.club.publics.tool.DeepLinkUtil;
import com.bytedance.club.publics.tool.DisplayUtil;
import com.bytedance.club.publics.tool.GlideUtil;
import com.bytedance.club.publics.tool.JSONUtil;
import com.bytedance.club.publics.tool.ObjectSaveUtils;
import com.bytedance.club.publics.tool.SharedPreferencesUtil;
import com.bytedance.club.publics.weight.RadiusImageView;
import com.bytedance.club.publics.weight.poputil.ForceUpdateAlertDialog;
import com.bytedance.club.publics.weight.poputil.NormalUpdateAlertDialog;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends BaseFragmentActivity {


    @BindView(R.id.ll_bookShelf)
    LinearLayout ll_bookShelf;
    @BindView(R.id.iv_bookShelf)
    ImageView iv_bookShelf;
    @BindView(R.id.tv_bookShelf)
    TextView tv_bookShelf;

    @BindView(R.id.ll_discover)
    LinearLayout ll_discover;
    @BindView(R.id.iv_discover)
    ImageView iv_discover;
    @BindView(R.id.tv_discover)
    TextView tv_discover;

    @BindView(R.id.ll_profile)
    LinearLayout ll_profile;
    @BindView(R.id.iv_profile)
    ImageView iv_profile;
    @BindView(R.id.tv_profile)
    TextView tv_profile;
    @BindView(R.id.profile_reddot)
    View profile_reddot;

    @BindView(R.id.rl_mine)
    RelativeLayout rl_mine;
    @BindView(R.id.iv_mine)
    ImageView iv_mine;
    @BindView(R.id.tv_mine)
    TextView tv_mine;
    @BindView(R.id.view_reddot)
    View view_reddot;

    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    public static final int  INDEX_BOOK_DISCOVER= ZERO;
    public static final int INDEX_BOOK_SHELF = ONE;

    public static boolean isMessageAlert;

    public boolean isMessageAuther = false;
    FragmentManager fragmentManager;
    BaseFragment[] fragments = new BaseFragment[TWO];
    private int index = 0;
    private int recardHomeIcon = 0;

    long lastBackPressedTime;

    private Toast mExitTipToast;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    @BindView(R.id.img_view)
    ImageView mADHead;
    View headview;
    public SharedPreferences config;
    private final Intent intent = new Intent();
    private TextView mName, mUid, mTvCoins, mTvCoupons, mTvAddRatio;
    private RadiusImageView mHead;
    private LinearLayout mLayoutInfo, mLayoutLogin, mLayoutRight;
    private TextView mBtnTop;
    private TextView mLimitOver;

    private ADBean.ResultData mADData;
    private ADBean.ResultData.CenterList.Rec_list mBean;
    private List<ADBean.ResultData.Rec_list> mRecList;
    public static List<TopUpListBean.ResultData.Info.Order_data> contactList = new ArrayList<>();

    public static int version_status = ZERO;
    //3??????????????????????????????
    public boolean isOverTime = false;
    private ObjectAnimator toLeftObjectAnimator;
    private ObjectAnimator toRightObjectAnimator;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void initializeView() {
        mTitleBar.setVisibility(View.GONE);
        mLoadingLayout.setVisibility(View.GONE);
        mContentLayout.setVisibility(View.VISIBLE);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        //???????????????????????????
        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        initNavView();

        //???
        SharedPreferences preferences = getSharedPreferences("ADClick", MODE_PRIVATE);
        String ADClickState = preferences.getString("ADClickState", "no");
        if (ADClickState != null) {
            if ("yes".equals(ADClickState)) {
                intent();
            }
        }
    }

    @Override
    protected void initializeData() {
        getVersionUpdate();
        setProfileReddot();
        EventBus.getDefault().register(this);
        fragmentManager = getSupportFragmentManager();
        fragments[INDEX_BOOK_SHELF] = new BookShelfFragment();
        fragments[INDEX_BOOK_DISCOVER] = new FeaturedFragment();
        mViewPager.setOffscreenPageLimit(fragments.length - 1);
        mViewPager.setAdapter(new HomePagerAdapter(getSupportFragmentManager()));
        showHint(PlotRead.getAppUser());
        checkDiscover();
        SharedPreferencesUtil.putBoolean(PlotRead.getConfig(), FIRST_ACCESS, FALSE);
        topuplist();
        requestOverLimitBooks();
    }

    private void checkBookShelf() {
        index = 1;
        changeTabel(iv_bookShelf, tv_bookShelf);
          mViewPager.setCurrentItem(INDEX_BOOK_SHELF, FALSE);
    }

    private void checkDiscover() {
        index = 1;
        changeTabel(iv_discover, tv_discover);
          mViewPager.setCurrentItem(INDEX_BOOK_DISCOVER, FALSE);
    }




    public void openMune(int index) {
        switch (index) {
            case INDEX_BOOK_SHELF:
                checkBookShelf();
                break;
            case INDEX_BOOK_DISCOVER:
                checkDiscover();
                break;

        }
    }

    private void initNavView() {
        //????????????????????????
        mADData = (ADBean.ResultData) ObjectSaveUtils.getObject(HomeActivity.this, "ns_ad");   //??????????????????
        mRecList = (List<ADBean.ResultData.Rec_list>) ObjectSaveUtils.getObject(this, "ns_ad_intent");
        if (mADData != null && mADData.centerList.rec_list.size() > 0) {
            mBean = mADData.centerList.rec_list.get(0);
        }
        if (mADData != null && mADData.rec_list.size() > 0) {
            mRecList = mADData.rec_list;
        }

        NavigationView mNavigationView = findViewById(R.id.nav_view);
        headview = mNavigationView.getHeaderView(0);
        mLayoutInfo = headview.findViewById(R.id.view_my_info);
        mLayoutLogin = headview.findViewById(R.id.view_login);
        mLayoutRight = headview.findViewById(R.id.layout_right);
        mName = headview.findViewById(R.id.tv_name);
        mUid = headview.findViewById(R.id.tv_uid);
        mHead = headview.findViewById(R.id.head);
        mTvCoins = headview.findViewById(R.id.tv_coins);
        mTvCoupons = headview.findViewById(R.id.tv_coupons);
        mTvAddRatio = headview.findViewById(R.id.tv_add_ratio);
        mBtnTop = headview.findViewById(R.id.btn_top);
        mLimitOver = headview.findViewById(R.id.tvLimitBonus);
        if (mADData != null && mADData.centerList.rec_list.size() > 0) {
            mADHead.setVisibility(View.VISIBLE);
            GlideUtil.picCache(this, mBean.recimg,mBean.id,R.drawable.default_info_cover, mADHead);

        } else {
            mADHead.setVisibility(View.GONE);
        }

        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            mLayoutInfo.setVisibility(View.VISIBLE);
            mLayoutRight.setVisibility(View.VISIBLE);
            mLayoutLogin.setVisibility(View.GONE);
            mBtnTop.setVisibility(View.VISIBLE);
            fillView();
        } else {
            mLayoutInfo.setVisibility(View.GONE);
            mLayoutRight.setVisibility(View.GONE);
            mLayoutLogin.setVisibility(View.VISIBLE);
            mTvCoins.setText("0");
            mTvCoupons.setText("0");
            mTvAddRatio.setText(getString(R.string.mine_top_sign));
            mBtnTop.setVisibility(View.GONE);
        }

    }


    private void setProfileReddot() {
        if (TextUtils.isEmpty(PlotRead.getAppUser().author_message) || PlotRead.getAppUser().author_message.equals("0")) {
            profile_reddot.setVisibility(View.GONE);
        } else {
            if (!isMessageAuther) {
                profile_reddot.setVisibility(View.VISIBLE);
            }

        }
    }

    private void intent() {

        if (mRecList != null && mRecList.size() > 0) {
            Intent mIntent = getIntent();
            ADBean.ResultData.Rec_list bean = mRecList.get(0);
            String advertise_type = bean.advertise_type;
            if ("1".equals(advertise_type)) {
                String readflag = bean.advertise_data.readflag;
                int wids = Integer.parseInt(bean.advertise_data.wid);
                if ("1".equals(readflag)) {
                    Work work = new Work();
                    work.wid = wids;
                    mIntent.setClass(this, ReadActivity.class);
                    mIntent.putExtra("work", work);

                    CollBookBean mCollBook  = new CollBookBean();
                    mCollBook.setTitle(work.title);
                    mCollBook.set_id(work.wid+"");
                    mIntent.putExtra(EXTRA_COLL_BOOK, mCollBook);
                    startActivity(intent);
                } else {
                    mIntent.setClass(this, WorkDetailActivity.class);
                    mIntent.putExtra("wid", wids);
                    mIntent.putExtra("recid", 0);
                }
                startActivity(mIntent);
            } else if ("2".equals(advertise_type)) {
                String ht = bean.advertise_data.ht;
                String path = bean.advertise_data.path;
                String ps = bean.advertise_data.ps;
                String is = bean.advertise_data.is;
                String su = bean.advertise_data.su;
                String st = bean.advertise_data.st;
                String ifreash = bean.advertise_data.ifreash;
                mIntent.setClass(this, WerActivity.class);
                mIntent.putExtra("index", ht);
                mIntent.putExtra("path", path);
                mIntent.putExtra("pagefresh", ps);
                mIntent.putExtra("share", is);
                mIntent.putExtra("shareUrl", su);
                mIntent.putExtra("shareType", st);
                mIntent.putExtra("sharefresh", ifreash);
                startActivity(mIntent);
            } else if ("3".equals(advertise_type)) {
                String url = bean.advertise_data.url;
                mIntent.setAction(Intent.ACTION_VIEW);
                mIntent.setData(Uri.parse(url));
                mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(mIntent);
            }
        }
    }

    @OnClick({R.id.ll_bookShelf})
    public void onRadioBookShelfCheck() {
        checkBookShelf();
        ShelfUtil.firstRecommend(HomeActivity.this);
        ShelfUtil.workUpdate(HomeActivity.this,false);
//        Message message = Message.obtain();
//        message.what = BOOKSHELFTAB;
//        EventBus.getDefault().post(message);
    }

    @OnClick({R.id.ll_discover})
    public void onRadioDiscover() {
        /*Message messages = new Message();
        messages.what = DISCOVERREFRESH;
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        messages.setData(bundle);
        EventBus.getDefault().post(messages);*/
        FeaturedFragment.Refresh(index);
        checkDiscover();
    }


    public void changeTabel(ImageView mImageview, TextView mTextView) {

        iv_bookShelf.setImageResource(R.drawable.nav_book_shelf_uncheck);
        tv_bookShelf.setTextColor(GRAY_2);
        iv_discover.setImageResource(R.drawable.nav_recommend_uncheck);
        tv_discover.setTextColor(GRAY_2);
        tv_discover.setText(getString(R.string.home_activity_recommend));
        iv_profile.setImageResource(R.drawable.nav_profile_uncheck);
        tv_profile.setTextColor(GRAY_2);
        iv_mine.setImageResource(R.drawable.nav_mine_uncheck);
        tv_mine.setTextColor(GRAY_2);

        switch (index) {
            case 1:
                mImageview.setImageResource(R.drawable.nav_book_shelft_checked);
                break;
            case 0:
                if (recardHomeIcon == 0){
                    mImageview.setImageResource(R.drawable.nav_recommend_checked);
                }else{
                    DiscoversLogo();
                }

                break;
            case 2:
                mImageview.setImageResource(R.drawable.nav_profile_checked);
                break;
            case 3:
                mImageview.setImageResource(R.drawable.nav_mine_checked);
                break;
        }
        mTextView.setTextColor(THEME_COLOR);
    }


    //??????????????????
    @SuppressLint({"RtlHardcoded", "WrongConstant"})
    public void openDrawer() {
        DeepLinkUtil.addPermanent(HomeActivity.this, "event_user_tab", "????????????", "????????????", "", "", "", "", "", "");
        drawer.openDrawer(Gravity.START);
        limitOverAnimator();
        if (isOverTime){
//            isOverTime = false;
            if(SharedPreferencesUtil.getInt(Constant.APP,"Breathing") == 1){
                ((BookShelfFragment)fragments[INDEX_BOOK_SHELF]).clearBreathingAnimation();
                ((FeaturedFragment)fragments[INDEX_BOOK_DISCOVER]).clearBreathingAnimation();
                SharedPreferencesUtil.putInt(Constant.APP,"Breathing",0);
            }
        }
        if (mADData != null && mADData.centerList.rec_list.size() > 0) {

            GlideUtil.picCache(this, mBean.recimg,mBean.id + "adhome",R.drawable.default_info_cover, mADHead);

        }
    }

    //??????????????????
    @SuppressLint("RtlHardcoded")
    public void closeDrawer() {
        drawer.closeDrawers();
    }

    //??????????????????
    public void DiscoversLogo() {
//        iv_discover.setImageResource(R.drawable.nav_recommend_checked_plane);
//        tv_discover.setText(getString(R.string.top));
//        recardHomeIcon = 1;
    }

    public void TheDiscoversLogo() {
//        iv_discover.setImageResource(R.drawable.nav_recommend_checked);
//        tv_discover.setText(getString(R.string.home_activity_recommend));
//        recardHomeIcon = 0;
    }

    public void Discover() {
//        iv_discover.setImageResource(R.drawable.nav_recommend_uncheck);
//        tv_discover.setText(getString(R.string.home_activity_recommend));
    }

    //AD
    public void LayoutADClick(View view) {
        if (mADData != null && mADData.centerList.rec_list.size() > 0) {
            Intent intent = new Intent();
            /*
             * advertise_type: ???????????? 1????????? 2??????????????? 3???????????????
             * readflag: 0??????????????? 1?????????
             */
            String advertise_type = mBean.advertise_type;
            if ("1".equals(advertise_type)) {
                String readflag = mBean.advertise_data.readflag;
                int wids = Integer.parseInt(mBean.advertise_data.wid);
                if ("1".equals(readflag)) {
                    Work work = new Work();
                    work.wid = wids;

                    intent.setClass(this, ReadActivity.class);
                    intent.putExtra("work", work);
                    CollBookBean mCollBook  = new CollBookBean();
                    mCollBook.setTitle(work.title);
                    mCollBook.set_id(work.wid+"");
                    intent.putExtra(EXTRA_COLL_BOOK, mCollBook);
                } else {
                    intent.setClass(HomeActivity.this, WorkDetailActivity.class);
                    intent.putExtra("wid", wids);
                    intent.putExtra("recid", 0);
                }
                startActivity(intent);
            } else if ("2".equals(advertise_type)) {
                String ht = mBean.advertise_data.ht;
                String path = mBean.advertise_data.path;
                String ps = mBean.advertise_data.ps;
                String is = mBean.advertise_data.is;
                String su = mBean.advertise_data.su;
                String st = mBean.advertise_data.st;
                String ifreash = mBean.advertise_data.ifreash;
                intent.setClass(HomeActivity.this, WerActivity.class);

                intent.putExtra("index", ht);
                intent.putExtra("path", path);
                intent.putExtra("pagefresh", ps);
                intent.putExtra("share", is);
                intent.putExtra("shareUrl", su);
                intent.putExtra("shareType", st);
                intent.putExtra("sharefresh", ifreash);
                startActivity(intent);
            } else if ("3".equals(advertise_type)) {
                String url = mBean.advertise_data.url;
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }else if ("4".equals(advertise_type)) {
                //??????????????????????????????
                if (PlotRead.getAppUser().login()){
                    intent.setClass(context, TaskCenterActivity.class);
                }else {
                    intent.setClass(context, LoginActivity.class);
                }
                startActivity(intent);
            }
        }
    }

    //????????????
    public void LayoutUserInfoClick(View view) {
        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            /*closeDrawer();*/
            intent.setClass(context, UserInfoModifyActivity.class);
        } else {
            intent.setClass(context, LoginActivity.class);
        }
        startActivity(intent);
    }

    //??????
    public void LayoutWalletClick(View view) {
        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            intent.setClass(context, WalletActivity.class);
        } else {
            intent.setClass(context, LoginActivity.class);
        }
        startActivity(intent);
    }

    //?????????
    public void LayoutTopUpClick(View view) {
        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            closeDrawer();
            DeepLinkUtil.addPermanent(context, "event_user_topup", "????????????", "??????", "", "", "", "", "", "");
            intent.setClass(context, TopUpActivity.class);
            startActivityForResult(intent, PAY_SUCCESS);
        } else {
            intent.setClass(context, LoginActivity.class);
            startActivity(intent);
        }

    }

    //????????????
    public void LayoutBillingClick(View view) {
        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            intent.setClass(context, BillDetailsActivity.class);
        } else {
            intent.setClass(context, LoginActivity.class);
        }
        startActivity(intent);
    }

    //????????????
    public void LayoutViewedClick(View view) {
        DeepLinkUtil.addPermanent(context, "event_user_viewed", "????????????", "??????????????????", "", "", "", "", "", "");
        Intent intent = new Intent();
        if (PlotRead.getAppUser().login()) {
            intent.setClass(context, ReadHistoryActivity.class);
        } else {
            intent.setClass(context, LoginActivity.class);
        }
        startActivity(intent);
    }

    //??????
    public void LayoutFeedBackClick(View view) {
        intent.setClass(context, UserHelpActivity.class);
        startActivity(intent);
    }

    //????????????
    public void LayoutAboutClick(View view) {
        Intent intent = new Intent(context, AboutUsActivity.class);
        startActivity(intent);
    }

    //??????
    public void LayoutSettingsClick(View view) {
        Intent intent = new Intent(context, SettingActivity.class);
        startActivity(intent);
    }

    //??????
    public void LayoutLogoutClick(View view) {
        if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor) {
            showLoading(getString(R.string.loading_off));
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(2000);//??????3???
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // ????????????
                    ShelfUtil.shelfUpload(HomeActivity.this);
                    AppUser user = PlotRead.getAppUser();
                    user.nickName = getString(R.string.tourists) + user.uid;
                    user.head = BLANK;
                    user.sex = ZERO;
                    user.level = ZERO;
                    user.vip = ZERO;
                    // ????????????
                    SharedPreferencesUtil.putBoolean(user.config, KEY_IS_VISITOR, TRUE);
                    SharedPreferences configData = SharedPreferencesUtil.getSharedPreferences(USER + PlotRead.getAppUser().uid);
                    SharedPreferencesUtil.remove(configData, KEY_AUTHOR);
                    // ????????????????????????
                    user.notifyWhenLogin();
                    // ??????????????????????????????
                    Message msg = Message.obtain();
                    msg.what = BUS_LOG_OUT;
                    EventBus.getDefault().post(msg);
                    //????????????
                    /*deviceLogin();*/
                    int uid = 0;
                    SharedPreferencesUtil.putInt(APP, LAST_ID, uid);
                    SharedPreferencesUtil.putInt(USER + uid, KEY_TOKEN_TIME, SharedPreferencesUtil.getInt(USER + uid, KEY_TOKEN_TIME) - 1);
                    // ??????????????????
                    SharedPreferencesUtil.putInt(APP, Constant.LAST_LOGIN_WAY, ZERO);
                    // ??????????????????token
                    PlotRead.getAppUser().notifyWhenLogin();
                    dismissLoading();
                }

            }.start();

        }
    }

    /**
     * ????????????
     */
    private void fillView() {
        fillBaseInfo();
        AppUser user = PlotRead.getAppUser();
        mUid.setText(String.format(Locale.getDefault(), MINE_STRING_USER_ID, user.uid));
        mUid.setVisibility(user.isVisitor ? View.GONE : View.VISIBLE);
    }

    /**
     * ??????????????????(???????????????)
     */
    @SuppressLint("SetTextI18n")
    private void fillBaseInfo() {
        AppUser user = PlotRead.getAppUser();
        GlideUtil.load(context, user.head, R.drawable.logo_default_user, mHead);
        mName.setText(user.nickName);
        mTvCoins.setText(user.money + "");
        mTvCoupons.setText(user.voucher + "");
        if (!TextUtils.isEmpty(user.order_discount)) {
            mTvAddRatio.setVisibility(View.VISIBLE);
            mTvAddRatio.setText(user.order_discount);
        }
        showHint(user);

    }

    /**
     * ?????????????????????
     */
    private void reset() {
        mHead.setImageResource(R.drawable.default_user_logo);
        mName.setText(MINE_STRING_CLICK_TO_LOGIN);
        mUid.setText(String.format(Locale.getDefault(), MINE_STRING_USER_ID, ZERO));
    }

    /**
     * ???????????????
     */
    private void showHint(AppUser user) {
        if (user.messageTotal > 0 || isMessageAlert) {
            view_reddot.setVisibility(View.VISIBLE);
        } else {
            view_reddot.setVisibility(View.GONE);
        }
    }

    private class HomePagerAdapter extends FragmentPagerAdapter {
        HomePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // ??????????????????
        String todayTime = df.format(new Date()); // ?????????????????????
        saveExitTime(todayTime);
        EventBus.getDefault().unregister(this);
    }

    /*
     * ???????????????????????????
     * @param extiLoginTime
     */
    private void saveExitTime(String extiLoginTime) {
        SharedPreferences.Editor editor = getSharedPreferences("NSLastTime", MODE_PRIVATE).edit();
        editor.putString("NSExitTime", extiLoginTime);
        //?????????apply()????????????commit()?????????apply()???????????????????????????????????????????????????????????????????????????
        //???commit()?????????????????????????????????
        //apply()?????????????????????????????????,???????????????????????????????????????
        editor.apply();
    }

    @SuppressLint({"RtlHardcoded", "WrongConstant"})
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(Gravity.START)) {
            closeDrawer();
        } else {
            long now = System.currentTimeMillis();
            if (now - lastBackPressedTime > TWO_THOUSAND) {
                lastBackPressedTime = now;
                mExitTipToast = PlotRead.toast(PlotRead.NORMAL, HOME_CLICK_ONCE_MORE_TO_EXIT);
            } else {
                if (mExitTipToast != null) {
                    mExitTipToast.cancel();
                }
                ShelfUtil.shelfUpload(HomeActivity.this);
                @SuppressLint("SimpleDateFormat")
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // ??????????????????
                String todayTime = df.format(new Date()); // ?????????????????????
                saveExitTime(todayTime);
                super.onBackPressed();
            }
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        InAppMessagingClickListener listener = new InAppMessagingClickListener();
        FirebaseInAppMessaging.getInstance().addClickListener(listener);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventBus(Message message) {
        switch (message.what) {
            case DISCOVERTABC:
                //?????????????????????
                if (ComYou.netWorkCheck(HomeActivity.this)){
                    DiscoversLogo();
                }
                if (PlotRead.getAppUser().login() && !PlotRead.getAppUser().isVisitor ) {
                    Discover();
                }
                break;
            case DISCOVERTABN:
                TheDiscoversLogo();
                break;
            case BUS_RECHARGE_SUCCESS:
            case BUS_REWARD_SUCCESS:
            case BUS_CHAPTER_BUY_SUCCESS:
            case BUS_MULTI_BUY_SUCCESS:
            case ADD_BOUNS_SUCCESS:

                PlotRead.getAppUser().fetchUserInfo(this);
                fillBaseInfo();
                break;
            case BUS_LOG_IN:
                ShelfUtil.initBookShelf();
                break;
            case BUS_USER_INFO_SUCCESS:
                mLayoutInfo.setVisibility(View.VISIBLE);
                mLayoutRight.setVisibility(View.VISIBLE);
                mLayoutLogin.setVisibility(View.GONE);
                setProfileReddot();
                mBtnTop.setVisibility(View.VISIBLE);
                /*mTvLoginHint.setVisibility(View.GONE);*/
                fillView();
                InAppMessagingClickListener listener = new InAppMessagingClickListener();
                FirebaseInAppMessaging.getInstance().addClickListener(listener);
                break;
            case BUS_MODIFY_INFO_SUCCESS:
                mLayoutInfo.setVisibility(View.VISIBLE);
                mLayoutRight.setVisibility(View.VISIBLE);
                mLayoutLogin.setVisibility(View.GONE);
                /*mLayoutMoney.setVisibility(View.VISIBLE);*/
                mBtnTop.setVisibility(View.VISIBLE);
                /*mTvLoginHint.setVisibility(View.GONE);*/
                PlotRead.getAppUser().fetchUserInfo(this);
                fillBaseInfo();
                break;
            case BUS_LOG_OUT:
                PlotRead.toast(PlotRead.SUCCESS, "log out");
                mLayoutInfo.setVisibility(View.GONE);
                mLayoutRight.setVisibility(View.GONE);
                mLayoutLogin.setVisibility(View.VISIBLE);
                /*mLayoutMoney.setVisibility(View.GONE);*/
                mTvCoins.setText("0");
                mTvCoupons.setText("0");
                mBtnTop.setVisibility(View.GONE);
                /*mTvLoginHint.setVisibility(View.VISIBLE);*/
                mTvAddRatio.setText(getString(R.string.mine_top_sign));
                reset();
                break;
        }
    }


    public void setCurrentItem(int index) {
        if (index == INDEX_BOOK_SHELF) {
            checkBookShelf();
        } else if (index == INDEX_BOOK_DISCOVER) {
            checkDiscover();
        }
    }

    /**
     * ???????????????????????????????????????
     */
    private void getVersionUpdate() {
//        NetRequest.versionUpdate(new OkHttpResult() {
//
//            @Override
//            public void onSuccess(JSONObject data) {
//                String serverNo = JSONUtil.getString(data, "ServerNo");
//                if (SN000.equals(serverNo)) {
//                    JSONObject result = JSONUtil.getJSONObject(data, "ResultData");
//                    int status = JSONUtil.getInt(result, "status");
//                    if (status == ONE) {
//                        JSONObject versionInfo = JSONUtil.getJSONObject(result, "version");
//                        String version = JSONUtil.getString(versionInfo, "version");
//                        String link = JSONUtil.getString(versionInfo, "link");
//                        String introduction = JSONUtil.getString(versionInfo, "introduction");
//                        int is_force = JSONUtil.getInt(versionInfo, "is_force");
//                        /*if (needUpdate(version) && PlotRead.getConfig().getBoolean(version, TRUE)) {*/
//                        if (needUpdate(version)) {
//                            if (is_force == ZERO) { // ?????????
//                                NormalUpdateAlertDialog.show(HomeActivity.this, version, introduction, link);
//                            } else {
//                                ForceUpdateAlertDialog.show(HomeActivity.this, version, introduction, link);
//                            }
//                        }
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(String error) {
//
//            }
//        });
    }


    /**
     * ????????????????????????
     */
    private void topuplist() {
        NetRequest.topupList(new OkHttpResult() {
            @Override
            public void onSuccess(JSONObject data) {
                String serverNo = JSONUtil.getString(data, "ServerNo");
                if (SN000.equals(serverNo)) {
                    try {
                        JSONObject jsonObject = new JSONObject(String.valueOf(data));
                        String resultString = jsonObject.getString("ResultData");

                        JSONObject jsonOders = new JSONObject(resultString);
                        String strOrders = jsonOders.getString("info");

                        JSONObject json = new JSONObject(strOrders);
                        version_status = json.getInt("version_status");
                        String strResult = json.getString("order_data");
                        contactList.clear();
                        Type listType = new TypeToken<List<TopUpListBean.ResultData.Info.Order_data>>() {
                        }.getType();
                        Gson gson = new Gson();
                        contactList = gson.fromJson(strResult, listType);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }

            @Override
            public void onFailure(String error) {
                PlotRead.toast(PlotRead.FAIL, "Request failed,Please try again later???");
            }
        });
    }


    private boolean needUpdate(String newVersion) {
        String currentVersion = AndroidManifestUtil.getVersionName();
        String[] news = newVersion.split("\\.");
        String[] currents = currentVersion.split("\\.");
        if (Integer.parseInt(news[ZERO]) > Integer.parseInt(currents[ZERO])) {
            return TRUE;
        }
        if (Integer.parseInt(news[ONE]) > Integer.parseInt(currents[ONE])) {
            return TRUE;
        }
        return Integer.parseInt(news[TWO]) > Integer.parseInt(currents[TWO]);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PAY_SUCCESS) {
            if (null != data && data.getBooleanExtra(SUCCESS, false)) {
                PlotRead.getAppUser().fetchUserInfo(this);
                fillBaseInfo();
            }
        }
    }


    /**
     * ???????????????????????????????????????????????????????????????->???????????????
     */
    private void requestOverLimitBooks(){
        NetRequest.getOverTimeBook(new OkHttpResult() {
            @Override
            public void onSuccess(JSONObject data) {

                String ServerNo = JSONUtil.getString(data,"ServerNo");

                if (ServerNo.equals(SN000)){
                    JSONObject resultObject = JSONUtil.getJSONObject(data,"ResultData");
                    int status =  JSONUtil.getInt(resultObject,"status");

                    if (status == 1){

                        String dataString =  JSONUtil.getString(resultObject,"data");
                        OverLimmitBook overLimmitBook = new Gson().fromJson(dataString,OverLimmitBook.class);

                        if (overLimmitBook.list != null && overLimmitBook.list.size() > 0){
                            //?????????
                            isOverTime = true;
                            Message message = Message.obtain();
                            message.what = BONUS_OVER_LIMIT;
                            EventBus.getDefault().post(message);

                            if (SharedPreferencesUtil.getInt(Constant.APP,"Breathing") == 1){
                                ((BookShelfFragment)fragments[INDEX_BOOK_SHELF]).doBreathinglamp();
                                ((FeaturedFragment)fragments[INDEX_BOOK_DISCOVER]).doBreathinglamp();
                            }

                        }else {
                            isOverTime = false;
                        }

                    } else {


                    }
                }

            }

            @Override
            public void onFailure(String error) {



            }
        });

    }

    /**
     * ?????????????????????
     */
    private void limitOverAnimator(){

        if(isOverTime && PlotRead.getAppUser().login()){
            mLimitOver.clearAnimation();
            if (toLeftObjectAnimator != null ){
                toLeftObjectAnimator.cancel();
            }

            if (toRightObjectAnimator != null){
                toRightObjectAnimator.cancel();
            }
            //?????????????????????
            mLimitOver.animate().translationX(0).setDuration(60).start();

            int remove1 = mLimitOver.getWidth();
            int removeX = DisplayUtil.dp2px(context,122);
            mLimitOver.setVisibility(View.VISIBLE);
            toLeftObjectAnimator = ObjectAnimator.ofFloat(mLimitOver,"translationX",0,-removeX);
            toLeftObjectAnimator.setDuration(1000);
            toLeftObjectAnimator.setStartDelay(500);
            toLeftObjectAnimator.setRepeatCount(0);
            toLeftObjectAnimator.start();

            toRightObjectAnimator = ObjectAnimator.ofFloat(mLimitOver,"translationX",-removeX,0);
            toRightObjectAnimator.setDuration(1000);
            toRightObjectAnimator.setStartDelay(6000);
            toRightObjectAnimator.start();

        }
    }

}
