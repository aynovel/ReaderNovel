// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail.bookadapter;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkInfoFansAdapter$FansViewHolder_ViewBinding implements Unbinder {
  private WorkInfoFansAdapter.FansViewHolder target;

  @UiThread
  public WorkInfoFansAdapter$FansViewHolder_ViewBinding(WorkInfoFansAdapter.FansViewHolder target,
      View source) {
    this.target = target;

    target.head = Utils.findRequiredViewAsType(source, R.id.head, "field 'head'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WorkInfoFansAdapter.FansViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.head = null;
  }
}
