package com.bytedance.club.interfaces;


import com.bytedance.club.entry.Image;

public interface OnItemClickListener {

    int onCheckedClick(int position, Image image);

    void onImageClick(int position, Image image);
}
