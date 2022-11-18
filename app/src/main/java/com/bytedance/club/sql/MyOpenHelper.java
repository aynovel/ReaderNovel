package com.bytedance.club.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.bytedance.club.entry.DaoMaster;

import org.greenrobot.greendao.database.Database;

public class MyOpenHelper extends DaoMaster.OpenHelper {
    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {

        switch (oldVersion){
            case 1:
            default:
                break;
        }
    }
}
