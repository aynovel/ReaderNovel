package com.bytedance.club.publics.weight.viewtext;

import android.view.View;



public interface ITouchableSpan {

    void setPressed(boolean pressed);

    void onClick(View widget);
}
