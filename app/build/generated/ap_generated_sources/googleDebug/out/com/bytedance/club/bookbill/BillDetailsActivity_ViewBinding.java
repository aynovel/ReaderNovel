// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookbill;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.magicindicator.MagicIndicator;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BillDetailsActivity_ViewBinding implements Unbinder {
  private BillDetailsActivity target;

  @UiThread
  public BillDetailsActivity_ViewBinding(BillDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BillDetailsActivity_ViewBinding(BillDetailsActivity target, View source) {
    this.target = target;

    target.mMagicIndicator = Utils.findRequiredViewAsType(source, R.id.magicIndicator, "field 'mMagicIndicator'", MagicIndicator.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BillDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMagicIndicator = null;
    target.mViewPager = null;
  }
}
