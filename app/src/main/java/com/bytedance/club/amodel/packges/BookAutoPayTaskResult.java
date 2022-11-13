package com.bytedance.club.amodel.packges;

import com.bytedance.club.amodel.bean.BookAutoPayConfigBean;
import com.bytedance.club.amodel.typeadapter.BoolTypeAdapter;
import com.google.gson.annotations.JsonAdapter;

public class BookAutoPayTaskResult{
    public int status;
    public String coupon;

    @JsonAdapter(BoolTypeAdapter.class)
    public boolean isReceive;

    public String msg;
    public String task_id;

    public BookAutoPayConfigBean config;
}
