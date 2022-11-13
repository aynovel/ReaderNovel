// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.publics.weight.poputil;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ManagePopup_ViewBinding implements Unbinder {
  private ManagePopup target;

  private View view7f0806a6;

  private View view7f0806b0;

  @UiThread
  public ManagePopup_ViewBinding(final ManagePopup target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ll_hottest, "field 'll_hottest' and method 'onHottestClick'");
    target.ll_hottest = Utils.castView(view, R.id.ll_hottest, "field 'll_hottest'", LinearLayout.class);
    view7f0806a6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onHottestClick();
      }
    });
    target.tv_hottest = Utils.findRequiredViewAsType(source, R.id.tv_hottest, "field 'tv_hottest'", TextView.class);
    target.iv_hottest = Utils.findRequiredViewAsType(source, R.id.iv_hottest, "field 'iv_hottest'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.ll_newest, "field 'll_newest' and method 'onNewestClick'");
    target.ll_newest = Utils.castView(view, R.id.ll_newest, "field 'll_newest'", LinearLayout.class);
    view7f0806b0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNewestClick();
      }
    });
    target.tv_newest = Utils.findRequiredViewAsType(source, R.id.tv_newest, "field 'tv_newest'", TextView.class);
    target.iv_newest = Utils.findRequiredViewAsType(source, R.id.iv_newest, "field 'iv_newest'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ManagePopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_hottest = null;
    target.tv_hottest = null;
    target.iv_hottest = null;
    target.ll_newest = null;
    target.tv_newest = null;
    target.iv_newest = null;

    view7f0806a6.setOnClickListener(null);
    view7f0806a6 = null;
    view7f0806b0.setOnClickListener(null);
    view7f0806b0 = null;
  }
}
