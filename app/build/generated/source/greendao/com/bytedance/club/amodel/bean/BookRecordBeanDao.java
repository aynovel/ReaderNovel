package com.bytedance.club.amodel.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_RECORD_BEAN".
*/
public class BookRecordBeanDao extends AbstractDao<BookRecordBean, String> {

    public static final String TABLENAME = "BOOK_RECORD_BEAN";

    /**
     * Properties of entity BookRecordBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Wid = new Property(0, String.class, "wid", true, "WID");
        public final static Property ChapterCount = new Property(1, int.class, "chapterCount", false, "CHAPTER_COUNT");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Rec_id = new Property(4, String.class, "rec_id", false, "REC_ID");
        public final static Property H_url = new Property(5, String.class, "h_url", false, "H_URL");
        public final static Property Cp_name = new Property(6, String.class, "cp_name", false, "CP_NAME");
        public final static Property Is_finish = new Property(7, int.class, "is_finish", false, "IS_FINISH");
        public final static Property Counts = new Property(8, int.class, "counts", false, "COUNTS");
        public final static Property Updatetime = new Property(9, int.class, "updatetime", false, "UPDATETIME");
        public final static Property Addtime = new Property(10, int.class, "addtime", false, "ADDTIME");
        public final static Property Readtime = new Property(11, int.class, "readtime", false, "READTIME");
        public final static Property Status = new Property(12, int.class, "status", false, "STATUS");
        public final static Property ChapterIndex = new Property(13, int.class, "chapterIndex", false, "CHAPTER_INDEX");
        public final static Property ChapterCharIndex = new Property(14, int.class, "chapterCharIndex", false, "CHAPTER_CHAR_INDEX");
        public final static Property ChapterID = new Property(15, String.class, "chapterID", false, "CHAPTER_ID");
        public final static Property ChapterName = new Property(16, String.class, "chapterName", false, "CHAPTER_NAME");
        public final static Property TimeStamp = new Property(17, int.class, "timeStamp", false, "TIME_STAMP");
    }


    public BookRecordBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookRecordBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_RECORD_BEAN\" (" + //
                "\"WID\" TEXT PRIMARY KEY NOT NULL ," + // 0: wid
                "\"CHAPTER_COUNT\" INTEGER NOT NULL ," + // 1: chapterCount
                "\"TITLE\" TEXT," + // 2: title
                "\"AUTHOR\" TEXT," + // 3: author
                "\"REC_ID\" TEXT," + // 4: rec_id
                "\"H_URL\" TEXT," + // 5: h_url
                "\"CP_NAME\" TEXT," + // 6: cp_name
                "\"IS_FINISH\" INTEGER NOT NULL ," + // 7: is_finish
                "\"COUNTS\" INTEGER NOT NULL ," + // 8: counts
                "\"UPDATETIME\" INTEGER NOT NULL ," + // 9: updatetime
                "\"ADDTIME\" INTEGER NOT NULL ," + // 10: addtime
                "\"READTIME\" INTEGER NOT NULL ," + // 11: readtime
                "\"STATUS\" INTEGER NOT NULL ," + // 12: status
                "\"CHAPTER_INDEX\" INTEGER NOT NULL ," + // 13: chapterIndex
                "\"CHAPTER_CHAR_INDEX\" INTEGER NOT NULL ," + // 14: chapterCharIndex
                "\"CHAPTER_ID\" TEXT," + // 15: chapterID
                "\"CHAPTER_NAME\" TEXT," + // 16: chapterName
                "\"TIME_STAMP\" INTEGER NOT NULL );"); // 17: timeStamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_RECORD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookRecordBean entity) {
        stmt.clearBindings();
 
        String wid = entity.getWid();
        if (wid != null) {
            stmt.bindString(1, wid);
        }
        stmt.bindLong(2, entity.getChapterCount());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String rec_id = entity.getRec_id();
        if (rec_id != null) {
            stmt.bindString(5, rec_id);
        }
 
        String h_url = entity.getH_url();
        if (h_url != null) {
            stmt.bindString(6, h_url);
        }
 
        String cp_name = entity.getCp_name();
        if (cp_name != null) {
            stmt.bindString(7, cp_name);
        }
        stmt.bindLong(8, entity.getIs_finish());
        stmt.bindLong(9, entity.getCounts());
        stmt.bindLong(10, entity.getUpdatetime());
        stmt.bindLong(11, entity.getAddtime());
        stmt.bindLong(12, entity.getReadtime());
        stmt.bindLong(13, entity.getStatus());
        stmt.bindLong(14, entity.getChapterIndex());
        stmt.bindLong(15, entity.getChapterCharIndex());
 
        String chapterID = entity.getChapterID();
        if (chapterID != null) {
            stmt.bindString(16, chapterID);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(17, chapterName);
        }
        stmt.bindLong(18, entity.getTimeStamp());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookRecordBean entity) {
        stmt.clearBindings();
 
        String wid = entity.getWid();
        if (wid != null) {
            stmt.bindString(1, wid);
        }
        stmt.bindLong(2, entity.getChapterCount());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String rec_id = entity.getRec_id();
        if (rec_id != null) {
            stmt.bindString(5, rec_id);
        }
 
        String h_url = entity.getH_url();
        if (h_url != null) {
            stmt.bindString(6, h_url);
        }
 
        String cp_name = entity.getCp_name();
        if (cp_name != null) {
            stmt.bindString(7, cp_name);
        }
        stmt.bindLong(8, entity.getIs_finish());
        stmt.bindLong(9, entity.getCounts());
        stmt.bindLong(10, entity.getUpdatetime());
        stmt.bindLong(11, entity.getAddtime());
        stmt.bindLong(12, entity.getReadtime());
        stmt.bindLong(13, entity.getStatus());
        stmt.bindLong(14, entity.getChapterIndex());
        stmt.bindLong(15, entity.getChapterCharIndex());
 
        String chapterID = entity.getChapterID();
        if (chapterID != null) {
            stmt.bindString(16, chapterID);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(17, chapterName);
        }
        stmt.bindLong(18, entity.getTimeStamp());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookRecordBean readEntity(Cursor cursor, int offset) {
        BookRecordBean entity = new BookRecordBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // wid
            cursor.getInt(offset + 1), // chapterCount
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // rec_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // h_url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cp_name
            cursor.getInt(offset + 7), // is_finish
            cursor.getInt(offset + 8), // counts
            cursor.getInt(offset + 9), // updatetime
            cursor.getInt(offset + 10), // addtime
            cursor.getInt(offset + 11), // readtime
            cursor.getInt(offset + 12), // status
            cursor.getInt(offset + 13), // chapterIndex
            cursor.getInt(offset + 14), // chapterCharIndex
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // chapterID
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // chapterName
            cursor.getInt(offset + 17) // timeStamp
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookRecordBean entity, int offset) {
        entity.setWid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setChapterCount(cursor.getInt(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRec_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setH_url(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCp_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIs_finish(cursor.getInt(offset + 7));
        entity.setCounts(cursor.getInt(offset + 8));
        entity.setUpdatetime(cursor.getInt(offset + 9));
        entity.setAddtime(cursor.getInt(offset + 10));
        entity.setReadtime(cursor.getInt(offset + 11));
        entity.setStatus(cursor.getInt(offset + 12));
        entity.setChapterIndex(cursor.getInt(offset + 13));
        entity.setChapterCharIndex(cursor.getInt(offset + 14));
        entity.setChapterID(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setChapterName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setTimeStamp(cursor.getInt(offset + 17));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookRecordBean entity, long rowId) {
        return entity.getWid();
    }
    
    @Override
    public String getKey(BookRecordBean entity) {
        if(entity != null) {
            return entity.getWid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookRecordBean entity) {
        return entity.getWid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
