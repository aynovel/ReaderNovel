package com.bytedance.club.interfaces;


import com.bytedance.club.entry.Folder;


public interface OnFolderChangeListener {

    void onChange(int position, Folder folder);
}
