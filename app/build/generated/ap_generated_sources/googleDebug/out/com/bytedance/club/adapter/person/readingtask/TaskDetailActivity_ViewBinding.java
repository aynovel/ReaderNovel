// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.readingtask;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.viewtext.MagnetTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TaskDetailActivity_ViewBinding implements Unbinder {
  private TaskDetailActivity target;

  private View view7f0800fc;

  @UiThread
  public TaskDetailActivity_ViewBinding(TaskDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TaskDetailActivity_ViewBinding(final TaskDetailActivity target, View source) {
    this.target = target;

    View view;
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.description, "field 'mDescription'", TextView.class);
    target.mMoney = Utils.findRequiredViewAsType(source, R.id.money, "field 'mMoney'", TextView.class);
    target.mExperience = Utils.findRequiredViewAsType(source, R.id.experience, "field 'mExperience'", TextView.class);
    view = Utils.findRequiredView(source, R.id.complete, "field 'mComplete' and method 'onCompleteClick'");
    target.mComplete = Utils.castView(view, R.id.complete, "field 'mComplete'", MagnetTextView.class);
    view7f0800fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCompleteClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TaskDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mDescription = null;
    target.mMoney = null;
    target.mExperience = null;
    target.mComplete = null;

    view7f0800fc.setOnClickListener(null);
    view7f0800fc = null;
  }
}
