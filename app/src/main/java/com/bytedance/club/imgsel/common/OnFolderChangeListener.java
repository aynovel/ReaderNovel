package com.bytedance.club.imgsel.common;


import com.bytedance.club.imgsel.bean.Folder;


public interface OnFolderChangeListener {

    void onChange(int position, Folder folder);
}
