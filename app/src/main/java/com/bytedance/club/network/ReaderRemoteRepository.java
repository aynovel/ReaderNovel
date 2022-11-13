package com.bytedance.club.network;




import com.bytedance.club.PlotRead;
import com.bytedance.club.amodel.packges.BookAutoPayTaskPackage;
import com.bytedance.club.amodel.packges.BookBuyMultiPackage;
import com.bytedance.club.amodel.packges.BookBuySinglePackage;
import com.bytedance.club.amodel.packges.BookChapterContentResult;
import com.bytedance.club.amodel.packges.BookChapterPackage;
import com.bytedance.club.amodel.packges.BookCommentListPackge;
import com.bytedance.club.amodel.packges.BookDetailInfoPackge;
import com.bytedance.club.amodel.packges.BookFreeCachePackage;
import com.bytedance.club.amodel.packges.BookModifyInfoPackage;
import com.bytedance.club.amodel.packges.BookMoreBuyInfoPackage;
import com.bytedance.club.amodel.packges.BookRecommendListPackage;
import com.bytedance.club.amodel.packges.UserAllTasksPackage;
import com.bytedance.club.amodel.packges.UserDiscountTaskRewardPackage;
import com.bytedance.club.amodel.packges.UserReadingTimeTaskRewardPackage;
import com.bytedance.club.amodel.packges.UserRecevieTaskRewardPackage;
import com.bytedance.club.api.API;
import com.bytedance.club.publics.Constant;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

public class ReaderRemoteRepository {


    private static ReaderRemoteRepository sInstance;
    private Retrofit mRetrofit;
    private ReaderApi mReaderApi;
    private ReaderApi mTestApi;
    private ReaderApi mOssApi;


    private ReaderRemoteRepository(){
        mRetrofit = ReaderRemoteHelper.getInstance()
                .getRetrofit();

        mReaderApi = mRetrofit.create(ReaderApi.class);

        mTestApi = ReaderRemoteHelper.getInstance().getTestRetrofit().create(ReaderApi.class);

        mOssApi = ReaderRemoteHelper.getInstance().getOssRetrofit().create(ReaderApi.class);
    }

    public static ReaderRemoteRepository getInstance(){
        if (sInstance == null){
            synchronized (ReaderRemoteRepository.class){
                if (sInstance == null){
                    sInstance = new ReaderRemoteRepository();
                }
            }
        }
        return sInstance;
    }

    public Single<BookDetailInfoPackge>  ReaderBookInfo(String bookId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.WORK_INFO,paramsObject,true);

        return mReaderApi.ReaderBookInfo(paramasMap)
                .map(bean -> bean);
    }

    public Single<BookModifyInfoPackage> ReaderBookModifyInfo(String bookId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.WORK_MODIFY_INFO,paramsObject,true);

        return mReaderApi.ReaderModifyBookInfo(paramasMap)
                .map(bean -> bean);
    }


    public Single<BookRecommendListPackage>  ReaderBookRecommendList() {

        JSONObject paramsObject = new JSONObject();
//        try {
//            paramsObject.put("wid",bookId);
//            paramsObject.put("page",page);
//            paramsObject.put("size",Constant.TWENTY);
//            paramsObject.put("order",order);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.READ_RECOMMEND,paramsObject,true);

        return mReaderApi.ReaderBookRecommendList(paramasMap)
                .map(bean -> bean);
    }



    public Single<BookCommentListPackge>  ReaderBookCommentList(String bookId,int page, int order) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("page",page);
            paramsObject.put("size",Constant.TWENTY);
            paramsObject.put("order",order);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.WORK_COMMENT_LIST,paramsObject,true);

        return mReaderApi.ReaderBookCommentList(paramasMap)
                .map(bean -> bean);
    }



    public Single<BookChapterPackage>  ReaderCatalog(String bookId, int startIndex, int count) {
        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("index",startIndex);
            paramsObject.put("num",count);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.WORK_CATALOG,paramsObject,true);

        return mReaderApi.ReaderCatalog(paramasMap)
                .map(bean -> bean);
    }

    public Single<BookChapterContentResult>  ReaderChapterContent(String bookId, String chapterId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("cid",chapterId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.WORK_CONTENT,paramsObject,true);

        return mReaderApi.ReaderContent(paramasMap)
                .map(bean -> bean);
    }


    public Single<BookBuySinglePackage>  ReaderBuySingleContent(String bookId, String chapterId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("cid",chapterId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.SUBCRIPTION_SINGLE_CHAPTER,paramsObject,true);

        return mReaderApi.ReaderBuySingleContent(paramasMap)
                .map(bean -> bean);
    }

    public Single<BookMoreBuyInfoPackage>  ReaderMoreBuyInfo(String bookId, String chapterId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("cid",chapterId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.PAY_MULTI_PAGE,paramsObject,true);

        return mReaderApi.ReaderMoreBuyInfo(paramasMap)
                .map(bean -> bean);
    }


    public Single<BookBuyMultiPackage>  ReaderBuyMultiContent(String bookId, String chapterId,int count) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("cid",chapterId);
            paramsObject.put("count",count);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.SUBCRIPTION_MULTI_CHAPTER,paramsObject,true);

        return mReaderApi.ReaderBuyMultiContent(paramasMap)
                .map(bean -> bean);
    }




    public Single<BookFreeCachePackage>  ReaderFreeCacheContent(String bookId, String chapterId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.FREE_DOWNLOAD_IDS,paramsObject,true);

        return mReaderApi.ReaderFreeCacheContent(paramasMap)
                .map(bean -> bean);
    }


    /**
     */
    public Single<ResponseBody> ReaderOssContent(String ossUrl){

        return mOssApi.ReaderOssContent(ossUrl)
                .map(bean -> bean);
    }


    /**************   任务相关     ******************/
    public Single<BookAutoPayTaskPackage>  ReaderBookAutoTaskInfo(String bookId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.AUTO_TASk,paramsObject,true);

        return mReaderApi.ReaderBookAutoTaskInfo(paramasMap)
                .map(bean -> bean);
    }


    public Single<UserDiscountTaskRewardPackage>  ReaderDiscountTaskReward(String taskID) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("task_id",taskID);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.GET_DISCOUNT,paramsObject,true);

        return mReaderApi.ReaderDiscountTaskReward(paramasMap)
                .map(bean -> bean);
    }

    public Single<UserAllTasksPackage>  ReaderUserAllTasks() {

        JSONObject paramsObject = new JSONObject();

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.GET_TASK,paramsObject,true);

        return mReaderApi.ReaderUserAllTasks(paramasMap)
                .map(bean -> bean);
    }


    public Single<UserRecevieTaskRewardPackage>  ReaderUserRecevieTaskRewad(String taskID) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("task_id",taskID);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.GET_TASK_REWARD,paramsObject,true);

        return mReaderApi.ReaderUserRecevieTaskRewad(paramasMap)
                .map(bean -> bean);
    }

    public Single<UserReadingTimeTaskRewardPackage>  ReaderUploadReadTimeTaskReward(String date,int minute) {

        JSONObject paramsObject = new JSONObject();
        try {
            int uid = PlotRead.getAppUser().uid;
            paramsObject.put("uid",uid);
            paramsObject.put("date",date);
            paramsObject.put("minute",minute);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.UPLOAD_READ_TIME,paramsObject,true);

        return mReaderApi.ReaderUploadReadTimeTaskReward(paramasMap)
                .map(bean -> bean);
    }




    public Single<ResponseBody>  ReaderTestSign(String bookId, String chapterId) {

        JSONObject paramsObject = new JSONObject();
        try {
            paramsObject.put("wid",bookId);
            paramsObject.put("cid",chapterId);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HashMap<String,String>  paramasMap = ReaderApiParamsHelper.getParamsMap(API.TEST_APP_SIGN,paramsObject,true);

        return mTestApi.ReaderTestSign(paramasMap)
                .map(bean -> bean);
    }


}
