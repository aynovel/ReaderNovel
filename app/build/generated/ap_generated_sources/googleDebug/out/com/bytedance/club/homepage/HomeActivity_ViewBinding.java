// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.homepage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  private View view7f08068f;

  private View view7f0806a0;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(final HomeActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ll_bookShelf, "field 'll_bookShelf' and method 'onRadioBookShelfCheck'");
    target.ll_bookShelf = Utils.castView(view, R.id.ll_bookShelf, "field 'll_bookShelf'", LinearLayout.class);
    view7f08068f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRadioBookShelfCheck();
      }
    });
    target.iv_bookShelf = Utils.findRequiredViewAsType(source, R.id.iv_bookShelf, "field 'iv_bookShelf'", ImageView.class);
    target.tv_bookShelf = Utils.findRequiredViewAsType(source, R.id.tv_bookShelf, "field 'tv_bookShelf'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_discover, "field 'll_discover' and method 'onRadioDiscover'");
    target.ll_discover = Utils.castView(view, R.id.ll_discover, "field 'll_discover'", LinearLayout.class);
    view7f0806a0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRadioDiscover();
      }
    });
    target.iv_discover = Utils.findRequiredViewAsType(source, R.id.iv_discover, "field 'iv_discover'", ImageView.class);
    target.tv_discover = Utils.findRequiredViewAsType(source, R.id.tv_discover, "field 'tv_discover'", TextView.class);
    target.ll_profile = Utils.findRequiredViewAsType(source, R.id.ll_profile, "field 'll_profile'", LinearLayout.class);
    target.iv_profile = Utils.findRequiredViewAsType(source, R.id.iv_profile, "field 'iv_profile'", ImageView.class);
    target.tv_profile = Utils.findRequiredViewAsType(source, R.id.tv_profile, "field 'tv_profile'", TextView.class);
    target.profile_reddot = Utils.findRequiredView(source, R.id.profile_reddot, "field 'profile_reddot'");
    target.rl_mine = Utils.findRequiredViewAsType(source, R.id.rl_mine, "field 'rl_mine'", RelativeLayout.class);
    target.iv_mine = Utils.findRequiredViewAsType(source, R.id.iv_mine, "field 'iv_mine'", ImageView.class);
    target.tv_mine = Utils.findRequiredViewAsType(source, R.id.tv_mine, "field 'tv_mine'", TextView.class);
    target.view_reddot = Utils.findRequiredView(source, R.id.view_reddot, "field 'view_reddot'");
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
    target.drawer = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class);
    target.mADHead = Utils.findRequiredViewAsType(source, R.id.img_view, "field 'mADHead'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_bookShelf = null;
    target.iv_bookShelf = null;
    target.tv_bookShelf = null;
    target.ll_discover = null;
    target.iv_discover = null;
    target.tv_discover = null;
    target.ll_profile = null;
    target.iv_profile = null;
    target.tv_profile = null;
    target.profile_reddot = null;
    target.rl_mine = null;
    target.iv_mine = null;
    target.tv_mine = null;
    target.view_reddot = null;
    target.mViewPager = null;
    target.drawer = null;
    target.mADHead = null;

    view7f08068f.setOnClickListener(null);
    view7f08068f = null;
    view7f0806a0.setOnClickListener(null);
    view7f0806a0 = null;
  }
}
