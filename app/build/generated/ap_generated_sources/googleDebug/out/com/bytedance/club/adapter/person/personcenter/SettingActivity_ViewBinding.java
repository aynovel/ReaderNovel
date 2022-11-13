// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.KOL;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingActivity_ViewBinding implements Unbinder {
  private SettingActivity target;

  private View view7f0806c7;

  private View view7f0800dd;

  private View view7f080770;

  private View view7f080775;

  @UiThread
  public SettingActivity_ViewBinding(SettingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingActivity_ViewBinding(final SettingActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.logOut, "field 'mLogOut' and method 'onLogOutClick'");
    target.mLogOut = Utils.castView(view, R.id.logOut, "field 'mLogOut'", TextView.class);
    view7f0806c7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLogOutClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.clearMemoryItem, "field 'mClearMemory' and method 'onClearMemoryItemClick'");
    target.mClearMemory = Utils.castView(view, R.id.clearMemoryItem, "field 'mClearMemory'", KOL.class);
    view7f0800dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClearMemoryItemClick();
      }
    });
    target.mVReddot = Utils.findRequiredView(source, R.id.v_reddot, "field 'mVReddot'");
    view = Utils.findRequiredView(source, R.id.pushManageItem, "method 'onPushManageItemClick'");
    view7f080770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPushManageItemClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rateUsItem, "method 'onRateUsItemClick'");
    view7f080775 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRateUsItemClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLogOut = null;
    target.mClearMemory = null;
    target.mVReddot = null;

    view7f0806c7.setOnClickListener(null);
    view7f0806c7 = null;
    view7f0800dd.setOnClickListener(null);
    view7f0800dd = null;
    view7f080770.setOnClickListener(null);
    view7f080770 = null;
    view7f080775.setOnClickListener(null);
    view7f080775 = null;
  }
}
