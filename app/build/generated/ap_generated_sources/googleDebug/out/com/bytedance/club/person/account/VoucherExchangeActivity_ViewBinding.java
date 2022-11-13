// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.account;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoucherExchangeActivity_ViewBinding implements Unbinder {
  private VoucherExchangeActivity target;

  private View view7f080160;

  @UiThread
  public VoucherExchangeActivity_ViewBinding(VoucherExchangeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VoucherExchangeActivity_ViewBinding(final VoucherExchangeActivity target, View source) {
    this.target = target;

    View view;
    target.mCode = Utils.findRequiredViewAsType(source, R.id.code, "field 'mCode'", EditText.class);
    view = Utils.findRequiredView(source, R.id.exchange, "method 'onExchangeClick'");
    view7f080160 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onExchangeClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    VoucherExchangeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCode = null;

    view7f080160.setOnClickListener(null);
    view7f080160 = null;
  }
}
