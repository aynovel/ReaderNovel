// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.publics.weight.poputil;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Pop_ViewBinding implements Unbinder {
  private Pop target;

  private View view7f080950;

  private View view7f08009d;

  private View view7f080191;

  @UiThread
  public Pop_ViewBinding(final Pop target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.unknown, "field 'mUnknown' and method 'onUnknownChanged'");
    target.mUnknown = Utils.castView(view, R.id.unknown, "field 'mUnknown'", RadioButton.class);
    view7f080950 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onUnknownChanged(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.boy, "field 'mBoy' and method 'onBoyChanged'");
    target.mBoy = Utils.castView(view, R.id.boy, "field 'mBoy'", RadioButton.class);
    view7f08009d = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onBoyChanged(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.girl, "field 'mGirl' and method 'onGirlChanged'");
    target.mGirl = Utils.castView(view, R.id.girl, "field 'mGirl'", RadioButton.class);
    view7f080191 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onGirlChanged(p1);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Pop target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mUnknown = null;
    target.mBoy = null;
    target.mGirl = null;

    ((CompoundButton) view7f080950).setOnCheckedChangeListener(null);
    view7f080950 = null;
    ((CompoundButton) view7f08009d).setOnCheckedChangeListener(null);
    view7f08009d = null;
    ((CompoundButton) view7f080191).setOnCheckedChangeListener(null);
    view7f080191 = null;
  }
}
