package com.bytedance.club.magicindicator.buildins.commonnavigator.abs;


import com.bytedance.club.magicindicator.buildins.commonnavigator.model.PositionData;

import java.util.List;


public interface IPagerIndicator {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);

    void onPositionDataProvide(List<PositionData> dataList);
}
