package com.bytedance.club.linstener;

import static com.bytedance.club.activtiy.HomeActivity.INDEX_BOOK_DISCOVER;
import static com.bytedance.club.activtiy.HomeActivity.INDEX_BOOK_SHELF;
import static com.bytedance.club.activtiy.Cods.EXTRA_COLL_BOOK;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.bytedance.club.activtiy.PlotRead;
import com.bytedance.club.entry.Work;
import com.bytedance.club.entry.CollBookBean;
import com.bytedance.club.activtiy.WorkDetailActivity;
import com.bytedance.club.activtiy.TopUpActivity;
import com.bytedance.club.activtiy.HomeActivity;
import com.bytedance.club.adapter.person.landing.LoginActivity;
import com.bytedance.club.publics.Hil;
import com.bytedance.club.publics.tool.GooglePayUtil;
import com.bytedance.club.publics.tool.MyActivityManager;
import com.bytedance.club.activtiy.ReadActivity;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;


public class InAppMessagingClickListener implements FirebaseInAppMessagingClickListener {

    Activity mActivity = MyActivityManager.getInstance().getCurrentActivity();
    @Override
    public void messageClicked(InAppMessage inAppMessage, Action action) {
        // Determine which URL the user clicked

        String url = action.getActionUrl();
        if (url.contains("Readerin://Reader.top/")){
            getInAppMessageData(url);
        }

    }

    private void getInAppMessageData(String UriString){
         mActivity = MyActivityManager.getInstance().getCurrentActivity();
        if (!TextUtils.isEmpty(UriString)){
            String urls = UriString.replace("Readerin://Reader.top/", "");
            String[] urlFormat = urls.split("\\?");
            if(null!=urlFormat[0]) {
                if("novelDetail".equals(urlFormat[0])) {
                    String[] param = urlFormat[1].split("&");
                    String[] novelId = param[0].split("=");
                    if(null != novelId[0] && "novelId".equals(novelId[0])) {
                        Intent mIntent = new Intent();
                        if (null != mActivity){
                            mIntent.setClass(mActivity, WorkDetailActivity.class);
                            mIntent.putExtra("wid",Integer.parseInt(novelId[1].trim()) );
                            mIntent.putExtra("recid", 0);
                            mIntent.putExtra("push", true);
                            mIntent.setAction(Intent.ACTION_DEFAULT);
                            mActivity.startActivity(mIntent);
                        }

                    }
                }
                if("readChapter".equals(urlFormat[0])) {
                    String[] param = urlFormat[1].split("&");
                    String[] novelId = param[0].split("=");
                    String[] chapterOrder = param[1].split("=");
                    if(null != novelId[0] && "novelId".equals(novelId[0]) &&
                            null != chapterOrder[0] && "index".equals(chapterOrder[0])) {

                        Work work = new Work();
                        work.wid = Integer.parseInt(novelId[1].trim());
                        int indexChapter = Integer.parseInt(chapterOrder[1].trim());
                        if (indexChapter<=0){
                            indexChapter = 0;
                        }else{
                            indexChapter =  indexChapter - 1;
                        }
                        work.lastChapterOrder = indexChapter;
                        if (null != mActivity) {
                            Intent mIntent = new Intent();
                            work.toReadType = 2;
                            mIntent.setClass(mActivity, ReadActivity.class);
                            mIntent.putExtra("work", work);


                            CollBookBean mCollBook  = new CollBookBean();
                            mCollBook.setTitle(work.title);
                            mCollBook.set_id(work.wid+"");
                            mIntent.putExtra(EXTRA_COLL_BOOK, mCollBook);

                            mIntent.setAction(Intent.ACTION_DEFAULT);
                            mActivity.startActivity(mIntent);
                        }

                    }
                }
                if("browser".equals(urlFormat[0])) {
                    String[] param = urlFormat[1].split("&");
                    String[] url = param[0].split("=");
                    if(null != url[0] && "url".equals(url[0])) {
                        Intent mIntent = new Intent();
                        if (null != mActivity){
                            mIntent.setAction(Intent.ACTION_VIEW);
                            mIntent.setData(Uri.parse(url[1]));
                            mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                            mActivity.startActivity(mIntent);
                        }

                    }
                }

                if("promotion".equals(urlFormat[0])) {
                    String[] param = urlFormat[1].split("&");
                    String[] url = param[0].split("=");
                    if(null != url[0] && "url".equals(url[0])) {
                        Intent mIntent = new Intent();
                        if (null != mActivity){
                            mIntent.setClass(mActivity, Hil.class);

                            mIntent.putExtra("path", url[1]);
                            mActivity.startActivity(mIntent);
                        }

                    }
                }


                if("recharge".equals(urlFormat[0])) {
                    Intent mIntent = new Intent();
                    mIntent.setClass(mActivity, TopUpActivity.class);
                    mActivity.startActivity(mIntent);
                }
                if("library".equals(urlFormat[0])) {
                    if(mActivity.getClass().getName().contains("HomeActivity")){
                        mActivity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ((HomeActivity)mActivity).openMune(INDEX_BOOK_SHELF);
                            }
                        });
//
                    }else{
                        Intent mIntent = new Intent();
                        mIntent.getIntExtra("INDEX",INDEX_BOOK_SHELF);
                        mIntent.setClass(mActivity, HomeActivity.class);
                        mActivity.startActivity(mIntent);
                    }
                }
                if("discover".equals(urlFormat[0])) {


                    if(mActivity.getClass().getName().contains("HomeActivity")){
                        mActivity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ((HomeActivity)mActivity).openMune(INDEX_BOOK_DISCOVER);
                            }
                        });

                    }else{
                        Intent mIntent = new Intent();
                        mIntent.getIntExtra("INDEX",INDEX_BOOK_DISCOVER);
                        mIntent.setClass(mActivity, HomeActivity.class);
                        mActivity.startActivity(mIntent);
                    }
//                    openMune(1);
                }

                if("pay".equals(urlFormat[0])) {

                    if (PlotRead.getAppUser().login()) {

                        if("pay".equals(urlFormat[0])) {
                            String[] param = urlFormat[1].split("&");
                            String[] goodsId = param[0].split("=");
                            String[] goodsAmount = param[1].split("=");
                            String[] ruleId = param[2].split("=");
                            String[] rmb = param[3].split("=");
                            if(null != goodsId[0] && "goodsId".equals(goodsId[0])
                                    && null != goodsAmount[0] && "goodsAmount".equals(goodsAmount[0])
                                    && null != ruleId[0] && "ruleId".equals(ruleId[0])
                                    && !TextUtils.isEmpty(ruleId[1])&& "rmb".equals(rmb[0])
                                    && !TextUtils.isEmpty(rmb[1])) {

                                new GooglePayUtil(mActivity,goodsId[1],goodsAmount[1],ruleId[1],rmb[1]);

                            }
                        }
                    } else {
                        Intent mIntent = new Intent();
                        mIntent.setClass(mActivity, LoginActivity.class);
                        mActivity.startActivity(mIntent);
                    }
                }
            }
        }
    }
}
