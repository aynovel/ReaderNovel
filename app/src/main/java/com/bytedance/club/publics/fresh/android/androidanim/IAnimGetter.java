package com.bytedance.club.publics.fresh.android.androidanim;

import android.view.animation.Interpolator;

import com.nineoldandroids.animation.Animator;



public interface IAnimGetter {
    Animator createMoveToAnim(int offstart, int duration, Interpolator interpolator, AnimListener animListener, float... p);
}
