package com.bytedance.club.adapter.person.personcenter;

import android.text.TextUtils;

import com.bytedance.club.entry.AutoBuy;
import com.bytedance.club.sql.AutoBuySQLiteHelper;
import com.bytedance.club.sql.SQLiteManager;
import com.bytedance.club.publics.Constant;

import java.util.List;


public class AutoBuyUtil implements Constant {

    public static boolean exist(int wid) {
        AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
        return helper.exist(wid);
    }

    public static boolean check(int wid) {
        AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
        AutoBuy autoBuy = helper.query(wid);
        return autoBuy.check == ONE;
    }

    public static void insert(AutoBuy autoBuy) {
        if (TextUtils.isEmpty(autoBuy.cover)){
            return;
        }else{
            AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
            helper.insert(autoBuy);
        }

    }

    public static void insert(List<AutoBuy> autoBuys) {
        AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
        helper.insert(autoBuys);
    }

    public static List<AutoBuy> query() {
        AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
        return helper.query();
    }

    public static AutoBuy query(int wid) {
        AutoBuySQLiteHelper helper = (AutoBuySQLiteHelper) SQLiteManager.getHelper(SQLiteManager.AUTO_BUY_HELPER);
        return helper.query(wid);
    }

}
