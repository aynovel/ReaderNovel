package com.bytedance.club.entry;


import com.bytedance.club.entry.ChapterItemBean;

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
