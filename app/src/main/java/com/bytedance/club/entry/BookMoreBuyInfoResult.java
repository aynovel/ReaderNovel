package com.bytedance.club.entry;

import com.bytedance.club.entry.MoreBuy;
import com.bytedance.club.entry.BuyFinaceBean;
import com.bytedance.club.entry.ChapterItemBean;

import java.util.List;

public class BookMoreBuyInfoResult {

//    @JsonAdapter(ListTypeAdapterFactory.class)
    public List<MoreBuy> list;

    public BuyFinaceBean finance;

    public ChapterItemBean chapter_info;
}
