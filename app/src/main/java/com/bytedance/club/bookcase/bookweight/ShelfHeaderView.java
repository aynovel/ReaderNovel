package com.bytedance.club.bookcase.bookweight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.weight.BaseHeaderView;

public class ShelfHeaderView extends BaseHeaderView {

    public ShelfHeaderView(Context context) {
        this(context, null);
    }

    public ShelfHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShelfHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(getContext()).inflate(R.layout.view_shelf_header, this, true);
    }

    @Override
    public float getSpanHeight() {
        return getHeight();
    }

    @Override
    protected void onStateChange(int state) {
    }
}
