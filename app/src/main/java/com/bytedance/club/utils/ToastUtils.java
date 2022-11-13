package com.bytedance.club.utils;

import android.widget.Toast;

import com.bytedance.club.PlotRead;




public class ToastUtils {

    public static void show(String msg){
        Toast.makeText(PlotRead.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
