package com.bytedance.club.publics.fresh.android.androidanim;


public interface AnimListener {
    void onUpdate(float value);

    void onAnimEnd();

    void onAnimCancel();
}
