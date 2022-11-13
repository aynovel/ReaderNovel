package com.bytedance.club.amodel.packges;

import com.bytedance.club.amodel.MoreBuy;
import com.bytedance.club.amodel.bean.BuyFinaceBean;
import com.bytedance.club.amodel.bean.ChapterItemBean;

import java.util.List;

public class BookMoreBuyInfoResult {

//    @JsonAdapter(ListTypeAdapterFactory.class)
    public List<MoreBuy> list;

    public BuyFinaceBean finance;

    public ChapterItemBean chapter_info;
}
