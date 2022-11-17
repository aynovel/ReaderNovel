package com.bytedance.club.publics.banner;

import androidx.viewpager.widget.ViewPager.PageTransformer;

import com.bytedance.club.publics.banner.transformer.DepthPageTransformer;
import com.bytedance.club.publics.banner.transformer.ScaleTransformer;
import com.bytedance.club.publics.banner.transformer.TabletTransformer;


public class Transformer {


    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> Scale = ScaleTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;

}
