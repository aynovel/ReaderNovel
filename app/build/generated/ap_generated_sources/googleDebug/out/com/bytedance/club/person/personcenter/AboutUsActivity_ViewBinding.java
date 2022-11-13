// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.personcenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutUsActivity_ViewBinding implements Unbinder {
  private AboutUsActivity target;

  private View view7f080015;

  private View view7f08000c;

  @UiThread
  public AboutUsActivity_ViewBinding(AboutUsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutUsActivity_ViewBinding(final AboutUsActivity target, View source) {
    this.target = target;

    View view;
    target.mVersion = Utils.findRequiredViewAsType(source, R.id.version, "field 'mVersion'", TextView.class);
    target.debug = Utils.findRequiredViewAsType(source, R.id.debug, "field 'debug'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.TermsServiceItem, "method 'onServiceTermsClick'");
    view7f080015 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServiceTermsClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.PrivacyPolicyItem, "method 'onPrivatePolicyClick'");
    view7f08000c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPrivatePolicyClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutUsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mVersion = null;
    target.debug = null;

    view7f080015.setOnClickListener(null);
    view7f080015 = null;
    view7f08000c.setOnClickListener(null);
    view7f08000c = null;
  }
}
