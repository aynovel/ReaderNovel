// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.personcenter;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedbackActivity_ViewBinding implements Unbinder {
  private FeedbackActivity target;

  private View view7f08016c;

  @UiThread
  public FeedbackActivity_ViewBinding(FeedbackActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FeedbackActivity_ViewBinding(final FeedbackActivity target, View source) {
    this.target = target;

    View view;
    target.mEtContent = Utils.findRequiredViewAsType(source, R.id.et_content, "field 'mEtContent'", EditText.class);
    target.mTvCount = Utils.findRequiredViewAsType(source, R.id.tv_count, "field 'mTvCount'", TextView.class);
    target.mEtEmail = Utils.findRequiredViewAsType(source, R.id.et_email, "field 'mEtEmail'", EditText.class);
    target.rvImageList = Utils.findRequiredViewAsType(source, R.id.rvImageList, "field 'rvImageList'", RecyclerView.class);
    target.tv_hint_num = Utils.findRequiredViewAsType(source, R.id.tv_hint_num, "field 'tv_hint_num'", TextView.class);
    view = Utils.findRequiredView(source, R.id.feedback_send, "method 'onFeedbackSendClick'");
    view7f08016c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFeedbackSendClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FeedbackActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEtContent = null;
    target.mTvCount = null;
    target.mEtEmail = null;
    target.rvImageList = null;
    target.tv_hint_num = null;

    view7f08016c.setOnClickListener(null);
    view7f08016c = null;
  }
}
