// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.readinglevel;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.magicindicator.MagicIndicator;
import com.bytedance.club.publics.scrollweight.ScrollLayout;
import com.bytedance.club.publics.weight.AutoRollBanner;
import com.bytedance.club.publics.weight.LevelView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignAndWelfareActivity_ViewBinding implements Unbinder {
  private SignAndWelfareActivity target;

  private View view7f08082c;

  private View view7f080970;

  private ViewPager.OnPageChangeListener view7f080970OnPageChangeListener;

  private View view7f08082f;

  private View view7f08066f;

  @UiThread
  public SignAndWelfareActivity_ViewBinding(SignAndWelfareActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignAndWelfareActivity_ViewBinding(final SignAndWelfareActivity target, View source) {
    this.target = target;

    View view;
    target.mNormalLevel = Utils.findRequiredViewAsType(source, R.id.normalLevel, "field 'mNormalLevel'", LevelView.class);
    target.mVipLevel = Utils.findRequiredViewAsType(source, R.id.vipLevel, "field 'mVipLevel'", LevelView.class);
    view = Utils.findRequiredView(source, R.id.sign, "field 'mSign' and method 'onSignClick'");
    target.mSign = Utils.castView(view, R.id.sign, "field 'mSign'", TextView.class);
    view7f08082c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSignClick();
      }
    });
    target.mSignDays = Utils.findRequiredViewAsType(source, R.id.signDays, "field 'mSignDays'", TextView.class);
    target.mScrollLayout = Utils.findRequiredViewAsType(source, R.id.scrollLayout, "field 'mScrollLayout'", ScrollLayout.class);
    target.mBanner = Utils.findRequiredViewAsType(source, R.id.banner, "field 'mBanner'", AutoRollBanner.class);
    target.mMagicIndicator = Utils.findRequiredViewAsType(source, R.id.magicIndicator, "field 'mMagicIndicator'", MagicIndicator.class);
    view = Utils.findRequiredView(source, R.id.viewPager, "field 'mViewPager' and method 'onPagerSelect'");
    target.mViewPager = Utils.castView(view, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
    view7f080970 = view;
    view7f080970OnPageChangeListener = new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageSelected(int p0) {
        target.onPagerSelect(p0);
      }

      @Override
      public void onPageScrolled(int p0, float p1, int p2) {
      }

      @Override
      public void onPageScrollStateChanged(int p0) {
      }
    };
    ((ViewPager) view).addOnPageChangeListener(view7f080970OnPageChangeListener);
    view = Utils.findRequiredView(source, R.id.signRule, "method 'onSignRuleClick'");
    view7f08082f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSignRuleClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.levelInfo, "method 'onLevelInfoClick'");
    view7f08066f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLevelInfoClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SignAndWelfareActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNormalLevel = null;
    target.mVipLevel = null;
    target.mSign = null;
    target.mSignDays = null;
    target.mScrollLayout = null;
    target.mBanner = null;
    target.mMagicIndicator = null;
    target.mViewPager = null;

    view7f08082c.setOnClickListener(null);
    view7f08082c = null;
    ((ViewPager) view7f080970).removeOnPageChangeListener(view7f080970OnPageChangeListener);
    view7f080970OnPageChangeListener = null;
    view7f080970 = null;
    view7f08082f.setOnClickListener(null);
    view7f08082f = null;
    view7f08066f.setOnClickListener(null);
    view7f08066f = null;
  }
}
