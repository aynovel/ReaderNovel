package com.bytedance.club.sql;

import android.database.sqlite.SQLiteDatabase;

import com.bytedance.club.activtiy.PlotRead;
import com.bytedance.club.entry.bean.DaoMaster;
import com.bytedance.club.entry.bean.DaoSession;


public class DaoDbHelper {

    private static final String DB_NAME = "PlotRead_DB";

    private static volatile DaoDbHelper sInstance;
    private SQLiteDatabase mDb;
    private DaoMaster mDaoMaster;
    private DaoSession mSession;

    private DaoDbHelper(){

        DaoMaster.OpenHelper openHelper = new MyOpenHelper(PlotRead.getContext(),DB_NAME,null);
        mDb = openHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(mDb);
        mSession = mDaoMaster.newSession();
    }


    public static DaoDbHelper getInstance(){
        if (sInstance == null){
            synchronized (DaoDbHelper.class){
                if (sInstance == null){
                    sInstance = new DaoDbHelper();
                }
            }
        }
        return sInstance;
    }

    public DaoSession getSession(){
        return mSession;
    }

    public SQLiteDatabase getDatabase(){
        return mDb;
    }

    public DaoSession getNewSession(){
        return mDaoMaster.newSession();
    }
}
