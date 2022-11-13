// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.readinglevel;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LevelRuleActivity_ViewBinding implements Unbinder {
  private LevelRuleActivity target;

  private View view7f080736;

  private View view7f08097e;

  private View view7f080970;

  private ViewPager.OnPageChangeListener view7f080970OnPageChangeListener;

  private View view7f08006a;

  @UiThread
  public LevelRuleActivity_ViewBinding(LevelRuleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LevelRuleActivity_ViewBinding(final LevelRuleActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.normalLevel, "field 'mNormalLevel' and method 'onNormalLevelChange'");
    target.mNormalLevel = Utils.castView(view, R.id.normalLevel, "field 'mNormalLevel'", RadioButton.class);
    view7f080736 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onNormalLevelChange(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.vipLevel, "field 'mVipLevel' and method 'onVipLevelChange'");
    target.mVipLevel = Utils.castView(view, R.id.vipLevel, "field 'mVipLevel'", RadioButton.class);
    view7f08097e = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onVipLevelChange(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.viewPager, "field 'mViewPager' and method 'onPageSelected'");
    target.mViewPager = Utils.castView(view, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
    view7f080970 = view;
    view7f080970OnPageChangeListener = new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageSelected(int p0) {
        target.onPageSelected(p0);
      }

      @Override
      public void onPageScrolled(int p0, float p1, int p2) {
      }

      @Override
      public void onPageScrollStateChanged(int p0) {
      }
    };
    ((ViewPager) view).addOnPageChangeListener(view7f080970OnPageChangeListener);
    view = Utils.findRequiredView(source, R.id.back, "method 'onBackClick'");
    view7f08006a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBackClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LevelRuleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNormalLevel = null;
    target.mVipLevel = null;
    target.mViewPager = null;

    ((CompoundButton) view7f080736).setOnCheckedChangeListener(null);
    view7f080736 = null;
    ((CompoundButton) view7f08097e).setOnCheckedChangeListener(null);
    view7f08097e = null;
    ((ViewPager) view7f080970).removeOnPageChangeListener(view7f080970OnPageChangeListener);
    view7f080970OnPageChangeListener = null;
    view7f080970 = null;
    view7f08006a.setOnClickListener(null);
    view7f08006a = null;
  }
}
