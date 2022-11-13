package com.bytedance.club.publics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

import com.bytedance.club.PlotRead;
import com.bytedance.club.publics.weight.poputil.LoadingAlertDialog;


public class CommonUtil {

    public static AlertDialog loadingDialog;

    public static void showLoading(Context context, String tip) {
        dismissLoading();
        loadingDialog = LoadingAlertDialog.show(context, tip);
    }

    public static void dismissLoading() {
        LoadingAlertDialog.dismiss(loadingDialog);
    }





    @SuppressLint("ObsoleteSdkInt")
    public static boolean isDestroy(Activity mActivity) {
        return mActivity == null || mActivity.isFinishing() || (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && mActivity.isDestroyed());
    }


}
