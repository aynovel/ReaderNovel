package com.bytedance.club.entry;

import com.bytedance.club.adapter.NumTypeAdapter;
import com.google.gson.annotations.JsonAdapter;


public class AdvertiseData {


    public int wid;

    public String readflag;

    @JsonAdapter(NumTypeAdapter.class)
    public int cid;

    public int rec_id;


    public String url;

    public String path;

    public String is;

    public int ifreash;


    public String su;

    public String st;

    public String ht;

    public String ps;

}
