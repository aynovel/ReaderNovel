// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.personcenter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserHelpActivity_ViewBinding implements Unbinder {
  private UserHelpActivity target;

  @UiThread
  public UserHelpActivity_ViewBinding(UserHelpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserHelpActivity_ViewBinding(UserHelpActivity target, View source) {
    this.target = target;

    target.mFeedBack = Utils.findRequiredViewAsType(source, R.id.feed_back, "field 'mFeedBack'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rcv_content, "field 'mRecyclerView'", RecyclerView.class);
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    UserHelpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFeedBack = null;
    target.mRecyclerView = null;
    target.mNoneView = null;
  }
}
