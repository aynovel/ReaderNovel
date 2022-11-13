// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.publics.weight.poputil;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SharePopup_ViewBinding implements Unbinder {
  private SharePopup target;

  private View view7f0800ef;

  private View view7f0800f5;

  @UiThread
  public SharePopup_ViewBinding(final SharePopup target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.com_facebook_share, "method 'onFacebookClick'");
    view7f0800ef = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFacebookClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.com_zalo_share, "method 'onWeChatCircleClick'");
    view7f0800f5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWeChatCircleClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f0800ef.setOnClickListener(null);
    view7f0800ef = null;
    view7f0800f5.setOnClickListener(null);
    view7f0800f5 = null;
  }
}
