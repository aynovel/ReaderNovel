package com.bytedance.club.activtiy;

import static com.bytedance.club.publics.Constant.ADD_BOUNS_SUCCESS;

import android.app.Activity;
import android.os.Message;

import com.bytedance.club.entry.TaskReword;
import com.bytedance.club.entry.TaskDetailBean;
import com.bytedance.club.entry.TaskItemBean;
import com.bytedance.club.entry.UserAllTasksPackage;
import com.bytedance.club.entry.UserDiscountTaskRewardPackage;
import com.bytedance.club.entry.UserDiscountTaskRewardResult;
import com.bytedance.club.entry.UserReadingTimeTaskRewardPackage;
import com.bytedance.club.entry.UserRecevieTaskRewardPackage;
import com.bytedance.club.entry.UserRecevieTaskRewardResult;
import com.bytedance.club.internet.ReaderRemoteRepository;
import com.bytedance.club.publics.tool.TaskCompleteDialog;
import com.bytedance.club.publics.tool.TimeUtil;
import com.bytedance.club.interfaces.ReceviedRewardCallBack;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserTaskReceiveManager {
    private static volatile UserTaskReceiveManager sInstance;

    private CompositeDisposable mTaskDisposable;

    private boolean autoReceiveCompele = true;

    private TaskDetailBean mAutoReceiveBean = null;

    private Activity mShowPopActivity;

    public UserTaskReceiveManager() {
        if (this.mTaskDisposable == null) {
            this.mTaskDisposable = new CompositeDisposable();
        }
    }

    private void addDisposable(Disposable disposable) {
        if (mTaskDisposable != null) {
            mTaskDisposable.add(disposable);
        }
    }


    public static UserTaskReceiveManager getInstance() {
        if (sInstance == null) {
            synchronized (UserTaskReceiveManager.class) {
                if (sInstance == null) {
                    sInstance = new UserTaskReceiveManager();
                }
            }
        }
        return sInstance;
    }

    public void getAutoBuyTaskRecevice(String taskID, ReceviedRewardCallBack callBack) {
        if (!PlotRead.getAppUser().login()) {
            return;
        }

        Disposable disposable = ReaderRemoteRepository.getInstance()
                .ReaderDiscountTaskReward(taskID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (UserDiscountTaskRewardPackage discountTaskRewardPackage) -> {

                            if (discountTaskRewardPackage != null && discountTaskRewardPackage.getResult() != null) {

                                UserDiscountTaskRewardResult result = discountTaskRewardPackage.getResult();
                                if(callBack != null)
                                {
                                    callBack.getReceviedRewardResult(result.status != 0);
                                }

                            }
                        },
                        (e) -> {
                            LogUtils.e("??????????????????  ??????====== " + e);
                        }
                );

        addDisposable(disposable);

    }


    public void freashAllAutoReceiveTasks(Activity showActivity, int taskType) {

        if (!PlotRead.getAppUser().login()) {
            return;
        }

        if(autoReceiveCompele  == false)
        {
            return;
        }

        mShowPopActivity = showActivity;

        autoReceiveCompele = false;
        Disposable disposable = ReaderRemoteRepository.getInstance()
                .ReaderUserAllTasks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (UserAllTasksPackage allTasksPackage) -> {

                            if (allTasksPackage != null && allTasksPackage.getResult() != null) {

                                mAutoReceiveBean = allTasksPackage.getResult().lists;
                                freashAutoReceiveTask(taskType);
                            }else{
                                autoReceiveCompele = true;
                            }
                        },
                        (e) -> {
                            LogUtils.e("??????????????????  ??????====== " + e);
                            autoReceiveCompele = true;
                        }
                );

        addDisposable(disposable);

    }

    private void freashAutoReceiveTask(int taskType)
    {
        if(mAutoReceiveBean != null)
        {
            boolean receiveFlag = false;
            if(mAutoReceiveBean.first_list.size()>0)
            {
                receiveFlag = checkTaskGetReward(mAutoReceiveBean.first_list,taskType);
            }

            if(receiveFlag == false)
            {
                if(mAutoReceiveBean.daily_list.size()>0)
                {
                    receiveFlag = checkTaskGetReward(mAutoReceiveBean.daily_list,taskType);
                }
            }

            if(receiveFlag == false)
            {
                if(mAutoReceiveBean.read_list.size()>0)
                {
                    receiveFlag = checkTaskGetReward(mAutoReceiveBean.read_list,taskType);
                }
            }

            if(receiveFlag)
            {
                return;
            }

        }

        autoReceiveCompele = true;
    }

    /**
     * ????????????????????????????????????
     * @param dataList
     */
    private boolean checkTaskGetReward(List<TaskItemBean> dataList, int taskType){
        boolean hasAutoFlag = false;
        for (TaskItemBean itemBean : dataList){
            //??????
            if (Integer.parseInt(itemBean.task_type) == taskType){
                //?????????
                if (itemBean.status == 1){
                    //??????
                    if (itemBean.auto.equals("1")){
                        //??????
                        hasAutoFlag = true;
                        autoReceviceTask(itemBean,taskType);
                    }
                }
            }
        }
        return hasAutoFlag;
    }



    public void autoReceviceTask(TaskItemBean itemBean,int taskType) {

        if (!PlotRead.getAppUser().login()) {
            return;
        }


        Disposable disposable = ReaderRemoteRepository.getInstance()
                .ReaderUserRecevieTaskRewad(itemBean.id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (UserRecevieTaskRewardPackage recevieTaskRewardPackage) -> {

                            if (recevieTaskRewardPackage != null && recevieTaskRewardPackage.getResult() != null) {
                                UserRecevieTaskRewardResult result = recevieTaskRewardPackage.getResult();
                                if(result.task != null)
                                {

                                    if(mShowPopActivity != null && !mShowPopActivity.isFinishing())
                                    {
                                        //????????????  ??????????????????dialog
                                        TaskCompleteDialog mTaskCompleteDialog =  new TaskCompleteDialog(mShowPopActivity, result.task, new ReceviedRewardCallBack() {
                                            @Override
                                            public void getReceviedRewardResult(boolean isReceived) {
                                                freashAutoReceiveTask(taskType);
                                            }
                                        });
                                        mTaskCompleteDialog.show();
                                    }


                                    //??????????????????????????????
                                    Message message = Message.obtain();
                                    message.what = ADD_BOUNS_SUCCESS;
                                    EventBus.getDefault().post(message);
                                }

                            }
                        },
                        (e) -> {
                            LogUtils.e("????????????????????????  ??????====== " + e);
                        }
                );
        addDisposable(disposable);
    }

    public void autoReceviceRewordTask(TaskReword itemBean) {

        if (!PlotRead.getAppUser().login()) {
            return;
        }


        Disposable disposable = ReaderRemoteRepository.getInstance()
                .ReaderUserRecevieTaskRewad(itemBean.task_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (UserRecevieTaskRewardPackage recevieTaskRewardPackage) -> {

                            if (recevieTaskRewardPackage != null && recevieTaskRewardPackage.getResult() != null) {
                                UserRecevieTaskRewardResult result = recevieTaskRewardPackage.getResult();
                                if(result.task != null)
                                {
                                    if(mShowPopActivity != null && !mShowPopActivity.isFinishing())
                                    {
                                        //????????????  ??????????????????dialog
                                        TaskCompleteDialog mTaskCompleteDialog =  new TaskCompleteDialog(mShowPopActivity, result.task, new ReceviedRewardCallBack() {
                                            @Override
                                            public void getReceviedRewardResult(boolean isReceived) {
                                            }
                                        });
                                        mTaskCompleteDialog.show();
                                    }


                                    //??????????????????????????????
                                    Message message = Message.obtain();
                                    message.what = ADD_BOUNS_SUCCESS;
                                    EventBus.getDefault().post(message);
                                }

                            }
                        },
                        (e) -> {
                            LogUtils.e("????????????????????????  ??????====== " + e);
                        }
                );
        addDisposable(disposable);
    }

    /**
     * ??????????????????
     * @param readTime ??????
     */
    public void updateUserReadTimeAndGetTaskRecevice(Activity showActivity, int readTime) {

        if (!PlotRead.getAppUser().login()) {
            return;
        }

        mShowPopActivity = showActivity;

        Disposable disposable = ReaderRemoteRepository.getInstance()
                .ReaderUploadReadTimeTaskReward(TimeUtil.currentYMDDate(),readTime)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (UserReadingTimeTaskRewardPackage timeTaskRewardPackage) -> {

                            if (timeTaskRewardPackage != null && timeTaskRewardPackage.getResult() != null) {

                                if(timeTaskRewardPackage.getResult().task != null)
                                {
                                    if (timeTaskRewardPackage.getResult().task != null){
                                        if (timeTaskRewardPackage.getResult().task.auto.equals("1")){
                                            autoReceviceRewordTask(timeTaskRewardPackage.getResult().task);
                                        }
                                    }
                                }
                            }
                        },
                        (e) -> {
                            LogUtils.e("????????????????????????  ??????====== " + e);
                        }
                );

        addDisposable(disposable);
    }

}
