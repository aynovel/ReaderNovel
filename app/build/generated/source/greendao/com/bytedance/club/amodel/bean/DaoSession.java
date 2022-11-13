package com.bytedance.club.amodel.bean;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.bytedance.club.amodel.bean.AutoPayBookBean;
import com.bytedance.club.amodel.bean.BookBean;
import com.bytedance.club.amodel.bean.BookMultiDownConfigBean;
import com.bytedance.club.amodel.bean.BookRecordBean;
import com.bytedance.club.amodel.bean.BookUpdateTimeInfoBean;
import com.bytedance.club.amodel.bean.ChapterItemBean;

import com.bytedance.club.amodel.bean.AutoPayBookBeanDao;
import com.bytedance.club.amodel.bean.BookBeanDao;
import com.bytedance.club.amodel.bean.BookMultiDownConfigBeanDao;
import com.bytedance.club.amodel.bean.BookRecordBeanDao;
import com.bytedance.club.amodel.bean.BookUpdateTimeInfoBeanDao;
import com.bytedance.club.amodel.bean.ChapterItemBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig autoPayBookBeanDaoConfig;
    private final DaoConfig bookBeanDaoConfig;
    private final DaoConfig bookMultiDownConfigBeanDaoConfig;
    private final DaoConfig bookRecordBeanDaoConfig;
    private final DaoConfig bookUpdateTimeInfoBeanDaoConfig;
    private final DaoConfig chapterItemBeanDaoConfig;

    private final AutoPayBookBeanDao autoPayBookBeanDao;
    private final BookBeanDao bookBeanDao;
    private final BookMultiDownConfigBeanDao bookMultiDownConfigBeanDao;
    private final BookRecordBeanDao bookRecordBeanDao;
    private final BookUpdateTimeInfoBeanDao bookUpdateTimeInfoBeanDao;
    private final ChapterItemBeanDao chapterItemBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        autoPayBookBeanDaoConfig = daoConfigMap.get(AutoPayBookBeanDao.class).clone();
        autoPayBookBeanDaoConfig.initIdentityScope(type);

        bookBeanDaoConfig = daoConfigMap.get(BookBeanDao.class).clone();
        bookBeanDaoConfig.initIdentityScope(type);

        bookMultiDownConfigBeanDaoConfig = daoConfigMap.get(BookMultiDownConfigBeanDao.class).clone();
        bookMultiDownConfigBeanDaoConfig.initIdentityScope(type);

        bookRecordBeanDaoConfig = daoConfigMap.get(BookRecordBeanDao.class).clone();
        bookRecordBeanDaoConfig.initIdentityScope(type);

        bookUpdateTimeInfoBeanDaoConfig = daoConfigMap.get(BookUpdateTimeInfoBeanDao.class).clone();
        bookUpdateTimeInfoBeanDaoConfig.initIdentityScope(type);

        chapterItemBeanDaoConfig = daoConfigMap.get(ChapterItemBeanDao.class).clone();
        chapterItemBeanDaoConfig.initIdentityScope(type);

        autoPayBookBeanDao = new AutoPayBookBeanDao(autoPayBookBeanDaoConfig, this);
        bookBeanDao = new BookBeanDao(bookBeanDaoConfig, this);
        bookMultiDownConfigBeanDao = new BookMultiDownConfigBeanDao(bookMultiDownConfigBeanDaoConfig, this);
        bookRecordBeanDao = new BookRecordBeanDao(bookRecordBeanDaoConfig, this);
        bookUpdateTimeInfoBeanDao = new BookUpdateTimeInfoBeanDao(bookUpdateTimeInfoBeanDaoConfig, this);
        chapterItemBeanDao = new ChapterItemBeanDao(chapterItemBeanDaoConfig, this);

        registerDao(AutoPayBookBean.class, autoPayBookBeanDao);
        registerDao(BookBean.class, bookBeanDao);
        registerDao(BookMultiDownConfigBean.class, bookMultiDownConfigBeanDao);
        registerDao(BookRecordBean.class, bookRecordBeanDao);
        registerDao(BookUpdateTimeInfoBean.class, bookUpdateTimeInfoBeanDao);
        registerDao(ChapterItemBean.class, chapterItemBeanDao);
    }
    
    public void clear() {
        autoPayBookBeanDaoConfig.clearIdentityScope();
        bookBeanDaoConfig.clearIdentityScope();
        bookMultiDownConfigBeanDaoConfig.clearIdentityScope();
        bookRecordBeanDaoConfig.clearIdentityScope();
        bookUpdateTimeInfoBeanDaoConfig.clearIdentityScope();
        chapterItemBeanDaoConfig.clearIdentityScope();
    }

    public AutoPayBookBeanDao getAutoPayBookBeanDao() {
        return autoPayBookBeanDao;
    }

    public BookBeanDao getBookBeanDao() {
        return bookBeanDao;
    }

    public BookMultiDownConfigBeanDao getBookMultiDownConfigBeanDao() {
        return bookMultiDownConfigBeanDao;
    }

    public BookRecordBeanDao getBookRecordBeanDao() {
        return bookRecordBeanDao;
    }

    public BookUpdateTimeInfoBeanDao getBookUpdateTimeInfoBeanDao() {
        return bookUpdateTimeInfoBeanDao;
    }

    public ChapterItemBeanDao getChapterItemBeanDao() {
        return chapterItemBeanDao;
    }

}
