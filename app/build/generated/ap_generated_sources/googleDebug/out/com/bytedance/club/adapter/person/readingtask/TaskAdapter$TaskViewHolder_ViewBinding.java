// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.readingtask;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TaskAdapter$TaskViewHolder_ViewBinding implements Unbinder {
  private TaskAdapter.TaskViewHolder target;

  @UiThread
  public TaskAdapter$TaskViewHolder_ViewBinding(TaskAdapter.TaskViewHolder target, View source) {
    this.target = target;

    target.mTaskName = Utils.findRequiredViewAsType(source, R.id.taskName, "field 'mTaskName'", TextView.class);
    target.mTaskAward = Utils.findRequiredViewAsType(source, R.id.taskAward, "field 'mTaskAward'", TextView.class);
    target.mTaskStatus = Utils.findRequiredViewAsType(source, R.id.taskStatus, "field 'mTaskStatus'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TaskAdapter.TaskViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTaskName = null;
    target.mTaskAward = null;
    target.mTaskStatus = null;
  }
}
