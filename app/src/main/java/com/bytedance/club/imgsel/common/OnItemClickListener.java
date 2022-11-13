package com.bytedance.club.imgsel.common;


import com.bytedance.club.imgsel.bean.Image;

public interface OnItemClickListener {

    int onCheckedClick(int position, Image image);

    void onImageClick(int position, Image image);
}
