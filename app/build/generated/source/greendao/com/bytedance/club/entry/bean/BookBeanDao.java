package life.forever.cf.entry.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import life.forever.cf.entry.BookBean;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_BEAN".
*/
public class BookBeanDao extends AbstractDao<BookBean, String> {

    public static final String TABLENAME = "BOOK_BEAN";

    /**
     * Properties of entity BookBean.<br/>
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
        public final static Property Update_t = new Property(8, int.class, "update_t", false, "UPDATE_T");
        public final static Property Addtime = new Property(9, int.class, "addtime", false, "ADDTIME");
        public final static Property Readtime = new Property(10, int.class, "readtime", false, "READTIME");
        public final static Property Status = new Property(11, int.class, "status", false, "STATUS");
        public final static Property Cp = new Property(12, int.class, "cp", false, "CP");
        public final static Property Is_delete = new Property(13, boolean.class, "is_delete", false, "IS_DELETE");
        public final static Property Is_update = new Property(14, boolean.class, "is_update", false, "IS_UPDATE");
        public final static Property Is_recommend = new Property(15, boolean.class, "is_recommend", false, "IS_RECOMMEND");
        public final static Property Chapterindex = new Property(16, int.class, "chapterindex", false, "CHAPTERINDEX");
        public final static Property Lastchapterpos = new Property(17, int.class, "lastchapterpos", false, "LASTCHAPTERPOS");
        public final static Property Chapterid = new Property(18, String.class, "chapterid", false, "CHAPTERID");
    }


    public BookBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_BEAN\" (" + //
                "\"WID\" TEXT PRIMARY KEY NOT NULL ," + // 0: wid
                "\"CHAPTER_COUNT\" INTEGER NOT NULL ," + // 1: chapterCount
                "\"TITLE\" TEXT," + // 2: title
                "\"AUTHOR\" TEXT," + // 3: author
                "\"REC_ID\" TEXT," + // 4: rec_id
                "\"H_URL\" TEXT," + // 5: h_url
                "\"CP_NAME\" TEXT," + // 6: cp_name
                "\"IS_FINISH\" INTEGER NOT NULL ," + // 7: is_finish
                "\"UPDATE_T\" INTEGER NOT NULL ," + // 8: update_t
                "\"ADDTIME\" INTEGER NOT NULL ," + // 9: addtime
                "\"READTIME\" INTEGER NOT NULL ," + // 10: readtime
                "\"STATUS\" INTEGER NOT NULL ," + // 11: status
                "\"CP\" INTEGER NOT NULL ," + // 12: cp
                "\"IS_DELETE\" INTEGER NOT NULL ," + // 13: is_delete
                "\"IS_UPDATE\" INTEGER NOT NULL ," + // 14: is_update
                "\"IS_RECOMMEND\" INTEGER NOT NULL ," + // 15: is_recommend
                "\"CHAPTERINDEX\" INTEGER NOT NULL ," + // 16: chapterindex
                "\"LASTCHAPTERPOS\" INTEGER NOT NULL ," + // 17: lastchapterpos
                "\"CHAPTERID\" TEXT);"); // 18: chapterid
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_BOOK_BEAN_WID ON \"BOOK_BEAN\"" +
                " (\"WID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookBean entity) {
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
        stmt.bindLong(9, entity.getUpdate_t());
        stmt.bindLong(10, entity.getAddtime());
        stmt.bindLong(11, entity.getReadtime());
        stmt.bindLong(12, entity.getStatus());
        stmt.bindLong(13, entity.getCp());
        stmt.bindLong(14, entity.getIs_delete() ? 1L: 0L);
        stmt.bindLong(15, entity.getIs_update() ? 1L: 0L);
        stmt.bindLong(16, entity.getIs_recommend() ? 1L: 0L);
        stmt.bindLong(17, entity.getChapterindex());
        stmt.bindLong(18, entity.getLastchapterpos());
 
        String chapterid = entity.getChapterid();
        if (chapterid != null) {
            stmt.bindString(19, chapterid);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookBean entity) {
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
        stmt.bindLong(9, entity.getUpdate_t());
        stmt.bindLong(10, entity.getAddtime());
        stmt.bindLong(11, entity.getReadtime());
        stmt.bindLong(12, entity.getStatus());
        stmt.bindLong(13, entity.getCp());
        stmt.bindLong(14, entity.getIs_delete() ? 1L: 0L);
        stmt.bindLong(15, entity.getIs_update() ? 1L: 0L);
        stmt.bindLong(16, entity.getIs_recommend() ? 1L: 0L);
        stmt.bindLong(17, entity.getChapterindex());
        stmt.bindLong(18, entity.getLastchapterpos());
 
        String chapterid = entity.getChapterid();
        if (chapterid != null) {
            stmt.bindString(19, chapterid);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookBean readEntity(Cursor cursor, int offset) {
        BookBean entity = new BookBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // wid
            cursor.getInt(offset + 1), // chapterCount
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // rec_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // h_url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cp_name
            cursor.getInt(offset + 7), // is_finish
            cursor.getInt(offset + 8), // update_t
            cursor.getInt(offset + 9), // addtime
            cursor.getInt(offset + 10), // readtime
            cursor.getInt(offset + 11), // status
            cursor.getInt(offset + 12), // cp
            cursor.getShort(offset + 13) != 0, // is_delete
            cursor.getShort(offset + 14) != 0, // is_update
            cursor.getShort(offset + 15) != 0, // is_recommend
            cursor.getInt(offset + 16), // chapterindex
            cursor.getInt(offset + 17), // lastchapterpos
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18) // chapterid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookBean entity, int offset) {
        entity.setWid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setChapterCount(cursor.getInt(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRec_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setH_url(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCp_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIs_finish(cursor.getInt(offset + 7));
        entity.setUpdate_t(cursor.getInt(offset + 8));
        entity.setAddtime(cursor.getInt(offset + 9));
        entity.setReadtime(cursor.getInt(offset + 10));
        entity.setStatus(cursor.getInt(offset + 11));
        entity.setCp(cursor.getInt(offset + 12));
        entity.setIs_delete(cursor.getShort(offset + 13) != 0);
        entity.setIs_update(cursor.getShort(offset + 14) != 0);
        entity.setIs_recommend(cursor.getShort(offset + 15) != 0);
        entity.setChapterindex(cursor.getInt(offset + 16));
        entity.setLastchapterpos(cursor.getInt(offset + 17));
        entity.setChapterid(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookBean entity, long rowId) {
        return entity.getWid();
    }
    
    @Override
    public String getKey(BookBean entity) {
        if(entity != null) {
            return entity.getWid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookBean entity) {
        return entity.getWid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
