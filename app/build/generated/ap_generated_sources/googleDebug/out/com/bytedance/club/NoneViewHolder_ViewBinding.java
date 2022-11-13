// Generated code from Butter Knife. Do not modify!
package com.bytedance.club;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoneViewHolder_ViewBinding implements Unbinder {
  private NoneViewHolder target;

  @UiThread
  public NoneViewHolder_ViewBinding(NoneViewHolder target, View source) {
    this.target = target;

    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoneViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.description = null;
  }
}
