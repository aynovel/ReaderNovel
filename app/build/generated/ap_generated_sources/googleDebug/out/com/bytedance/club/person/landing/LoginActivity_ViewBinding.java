// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.landing;

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

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view7f0806a3;

  private View view7f0806a2;

  private View view7f080661;

  private View view7f080659;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.mImgBack = Utils.findRequiredViewAsType(source, R.id.img_back, "field 'mImgBack'", ImageView.class);
    target.mTvGoogleLast = Utils.findRequiredViewAsType(source, R.id.tvGoogleLast, "field 'mTvGoogleLast'", TextView.class);
    target.mTvFaceLast = Utils.findRequiredViewAsType(source, R.id.tvFaceLast, "field 'mTvFaceLast'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_google_login, "method 'onGoogleClick'");
    view7f0806a3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onGoogleClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_facebook_login, "method 'onFacebookClick'");
    view7f0806a2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFacebookClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.layout_service, "method 'onServiceClick'");
    view7f080661 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServiceClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.layout_private, "method 'onPolicyClick'");
    view7f080659 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPolicyClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImgBack = null;
    target.mTvGoogleLast = null;
    target.mTvFaceLast = null;

    view7f0806a3.setOnClickListener(null);
    view7f0806a3 = null;
    view7f0806a2.setOnClickListener(null);
    view7f0806a2 = null;
    view7f080661.setOnClickListener(null);
    view7f080661 = null;
    view7f080659.setOnClickListener(null);
    view7f080659 = null;
  }
}
