package com.bytedance.club.publics.tool;

import android.util.Log;

import com.bytedance.club.activtiy.PlotRead;


public class LOG {

    public static void i(String tag, String msg) {
        if (PlotRead.isTest) {
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (PlotRead.isTest) {
            Log.e(tag, msg);
        }
    }

}
