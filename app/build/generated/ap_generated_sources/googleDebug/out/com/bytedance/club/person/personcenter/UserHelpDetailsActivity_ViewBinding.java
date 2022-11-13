// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.personcenter;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserHelpDetailsActivity_ViewBinding implements Unbinder {
  private UserHelpDetailsActivity target;

  @UiThread
  public UserHelpDetailsActivity_ViewBinding(UserHelpDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserHelpDetailsActivity_ViewBinding(UserHelpDetailsActivity target, View source) {
    this.target = target;

    target.mLayoutAnswer = Utils.findRequiredView(source, R.id.layout_answer, "field 'mLayoutAnswer'");
    target.mLayoutNone = Utils.findRequiredViewAsType(source, R.id.layout_none, "field 'mLayoutNone'", LinearLayout.class);
    target.mTvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'mTvTitle'", TextView.class);
    target.mTvAnswer = Utils.findRequiredViewAsType(source, R.id.tv_answer, "field 'mTvAnswer'", TextView.class);
    target.mFeedBack = Utils.findRequiredViewAsType(source, R.id.feed_back, "field 'mFeedBack'", TextView.class);
    target.mWebAnswer = Utils.findRequiredViewAsType(source, R.id.web_answer, "field 'mWebAnswer'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserHelpDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLayoutAnswer = null;
    target.mLayoutNone = null;
    target.mTvTitle = null;
    target.mTvAnswer = null;
    target.mFeedBack = null;
    target.mWebAnswer = null;
  }
}
