package com.bytedance.club.amodel.packges;


import com.bytedance.club.amodel.bean.ChapterItemBean;

import java.util.List;

public class BookCatalogResult {
    private List<ChapterItemBean> catalog;
    public int update_time;
    public int count;
    public String msg;

    public List<ChapterItemBean> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<ChapterItemBean> catalog) {
        this.catalog = catalog;
    }
}
