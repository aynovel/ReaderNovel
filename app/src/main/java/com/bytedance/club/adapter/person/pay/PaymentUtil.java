package com.bytedance.club.adapter.person.pay;

import com.bytedance.club.entry.PayInfo;
import com.bytedance.club.publics.Constant;
import com.bytedance.club.sql.PaymentSQLiteHelper;
import com.bytedance.club.sql.SQLiteManager;

import java.util.List;


public class PaymentUtil implements Constant {



    public static List<PayInfo> queryPayLists() {
        PaymentSQLiteHelper helper = (PaymentSQLiteHelper) SQLiteManager.getHelper(SQLiteManager.PAY_HELPER);
        return helper.query();
    }

    public static void updatePay(PayInfo payInfo) {
        PaymentSQLiteHelper helper = (PaymentSQLiteHelper) SQLiteManager.getHelper(SQLiteManager.PAY_HELPER);
        helper.update(payInfo);
    }



    public static void insertRecord(PayInfo mPayInfo) {
        PaymentSQLiteHelper helper = (PaymentSQLiteHelper) SQLiteManager.getHelper(SQLiteManager.PAY_HELPER);
        helper.insertRecord(mPayInfo);
    }

    public static void deletePayInfo(String pay_id) {
        PaymentSQLiteHelper helper = (PaymentSQLiteHelper) SQLiteManager.getHelper(SQLiteManager.PAY_HELPER);
        helper.delete(pay_id);
    }
}
