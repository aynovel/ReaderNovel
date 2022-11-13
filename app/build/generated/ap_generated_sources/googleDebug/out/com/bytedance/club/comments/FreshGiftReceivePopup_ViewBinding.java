// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.comments;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FreshGiftReceivePopup_ViewBinding implements Unbinder {
  private FreshGiftReceivePopup target;

  private View view7f08079a;

  @UiThread
  public FreshGiftReceivePopup_ViewBinding(final FreshGiftReceivePopup target, View source) {
    this.target = target;

    View view;
    target.mVoucher = Utils.findRequiredViewAsType(source, R.id.voucher, "field 'mVoucher'", TextView.class);
    view = Utils.findRequiredView(source, R.id.receive, "method 'onReceiveClick'");
    view7f08079a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReceiveClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FreshGiftReceivePopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mVoucher = null;

    view7f08079a.setOnClickListener(null);
    view7f08079a = null;
  }
}
