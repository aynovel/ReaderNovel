// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.homepage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.magicindicator.MagicIndicator;
import com.bytedance.club.publics.weight.RadiusImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeaturedFragment_ViewBinding implements Unbinder {
  private FeaturedFragment target;

  private View view7f080933;

  private View view7f0801a5;

  private View view7f08065d;

  private View view7f08064c;

  @UiThread
  public FeaturedFragment_ViewBinding(final FeaturedFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_search, "field 'mTvSearch' and method 'setmTvSearch'");
    target.mTvSearch = Utils.castView(view, R.id.tv_search, "field 'mTvSearch'", TextView.class);
    view7f080933 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setmTvSearch();
      }
    });
    view = Utils.findRequiredView(source, R.id.head, "field 'mRadiusImageView' and method 'setmLeftSide'");
    target.mRadiusImageView = Utils.castView(view, R.id.head, "field 'mRadiusImageView'", RadiusImageView.class);
    view7f0801a5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setmLeftSide();
      }
    });
    target.mImgSearch = Utils.findRequiredViewAsType(source, R.id.img_search, "field 'mImgSearch'", ImageView.class);
    target.mImgSign = Utils.findRequiredViewAsType(source, R.id.img_sign, "field 'mImgSign'", ImageView.class);
    target.mMagicIndicator = Utils.findRequiredViewAsType(source, R.id.magicIndicator, "field 'mMagicIndicator'", MagicIndicator.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
    target.rl_cqs_bg = Utils.findRequiredViewAsType(source, R.id.rl_cqs_bg, "field 'rl_cqs_bg'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.layout_read_history, "field 'mLayoutReadHistory' and method 'Reading'");
    target.mLayoutReadHistory = Utils.castView(view, R.id.layout_read_history, "field 'mLayoutReadHistory'", RelativeLayout.class);
    view7f08065d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Reading();
      }
    });
    target.mLayoutHistory = Utils.findRequiredViewAsType(source, R.id.layout_history, "field 'mLayoutHistory'", LinearLayout.class);
    target.mImgCover = Utils.findRequiredViewAsType(source, R.id.img_cover, "field 'mImgCover'", ImageView.class);
    target.mTvBookName = Utils.findRequiredViewAsType(source, R.id.tv_book_name, "field 'mTvBookName'", TextView.class);
    target.mTvBookInfo = Utils.findRequiredViewAsType(source, R.id.tv_book_info, "field 'mTvBookInfo'", TextView.class);
    target.mImgBr1 = Utils.findRequiredViewAsType(source, R.id.imgBr1, "field 'mImgBr1'", ImageView.class);
    target.mImgBr2 = Utils.findRequiredViewAsType(source, R.id.imgBr2, "field 'mImgBr2'", ImageView.class);
    target.mImgBr3 = Utils.findRequiredViewAsType(source, R.id.imgBr3, "field 'mImgBr3'", ImageView.class);
    target.mImgBr4 = Utils.findRequiredViewAsType(source, R.id.imgBr4, "field 'mImgBr4'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.layout_close, "method 'CloseHistory'");
    view7f08064c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.CloseHistory();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FeaturedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvSearch = null;
    target.mRadiusImageView = null;
    target.mImgSearch = null;
    target.mImgSign = null;
    target.mMagicIndicator = null;
    target.mViewPager = null;
    target.rl_cqs_bg = null;
    target.mLayoutReadHistory = null;
    target.mLayoutHistory = null;
    target.mImgCover = null;
    target.mTvBookName = null;
    target.mTvBookInfo = null;
    target.mImgBr1 = null;
    target.mImgBr2 = null;
    target.mImgBr3 = null;
    target.mImgBr4 = null;

    view7f080933.setOnClickListener(null);
    view7f080933 = null;
    view7f0801a5.setOnClickListener(null);
    view7f0801a5 = null;
    view7f08065d.setOnClickListener(null);
    view7f08065d = null;
    view7f08064c.setOnClickListener(null);
    view7f08064c = null;
  }
}
