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

public class FreshGiftReceiveSuccessPopup_ViewBinding implements Unbinder {
  private FreshGiftReceiveSuccessPopup target;

  private View view7f0800c9;

  @UiThread
  public FreshGiftReceiveSuccessPopup_ViewBinding(final FreshGiftReceiveSuccessPopup target,
      View source) {
    this.target = target;

    View view;
    target.mMsg = Utils.findRequiredViewAsType(source, R.id.msg, "field 'mMsg'", TextView.class);
    view = Utils.findRequiredView(source, R.id.checkNow, "method 'onCheckNowClick'");
    view7f0800c9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCheckNowClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FreshGiftReceiveSuccessPopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMsg = null;

    view7f0800c9.setOnClickListener(null);
    view7f0800c9 = null;
  }
}
