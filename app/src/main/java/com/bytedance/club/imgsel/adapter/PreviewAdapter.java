package com.bytedance.club.imgsel.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

import com.bytedance.club.R;
import com.bytedance.club.imgsel.ISNav;
import com.bytedance.club.imgsel.bean.Image;
import com.bytedance.club.imgsel.common.Constant;
import com.bytedance.club.imgsel.common.OnItemClickListener;
import com.bytedance.club.imgsel.config.ISListConfig;

import java.util.List;


public class PreviewAdapter extends PagerAdapter {

    private final Activity activity;
    private final List<Image> images;
    private final ISListConfig config;
    private OnItemClickListener listener;

    public PreviewAdapter(Activity activity, List<Image> images, ISListConfig config) {
        this.activity = activity;
        this.images = images;
        this.config = config;
    }

    @Override
    public int getCount() {
        if (config.needCamera)
            return images.size() - 1;
        else
            return images.size();
    }

    @Override
    public View instantiateItem(ViewGroup container, final int position) {
        View root = View.inflate(activity, R.layout.item_pager_img_sel, null);
        final ImageView photoView = root.findViewById(R.id.ivImage);
        final ImageView ivChecked = root.findViewById(R.id.ivPhotoCheaked);

        if (config.multiSelect) {

            ivChecked.setVisibility(View.VISIBLE);
            final Image image = images.get(config.needCamera ? position + 1 : position);
            if (Constant.imageList.contains(image.path)) {
                ivChecked.setImageResource(R.drawable.ic_checked);
            } else {
                ivChecked.setImageResource(R.drawable.ic_uncheck);
            }

            ivChecked.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int ret = listener.onCheckedClick(position, image);
                        if (ret == 1) { // 局部刷新
                            if (Constant.imageList.contains(image.path)) {
                                ivChecked.setImageResource(R.drawable.ic_checked);
                            } else {
                                ivChecked.setImageResource(R.drawable.ic_uncheck);
                            }
                        }
                    }
                }
            });

            photoView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onImageClick(position, images.get(position));
                    }
                }
            });
        } else {
            ivChecked.setVisibility(View.GONE);
        }

        container.addView(root, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        displayImage(photoView, images.get(config.needCamera ? position + 1 : position).path);

        return root;
    }

    private void displayImage(ImageView photoView, String path) {
        ISNav.getInstance().displayImage(activity, path, photoView);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
