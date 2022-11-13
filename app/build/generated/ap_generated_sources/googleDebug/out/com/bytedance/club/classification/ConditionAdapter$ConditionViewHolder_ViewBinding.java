// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.classification;

import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConditionAdapter$ConditionViewHolder_ViewBinding implements Unbinder {
  private ConditionAdapter.ConditionViewHolder target;

  @UiThread
  public ConditionAdapter$ConditionViewHolder_ViewBinding(
      ConditionAdapter.ConditionViewHolder target, View source) {
    this.target = target;

    target.conditionTitle = Utils.findRequiredViewAsType(source, R.id.conditionTitle, "field 'conditionTitle'", TextView.class);
    target.gridView = Utils.findRequiredViewAsType(source, R.id.gridView, "field 'gridView'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConditionAdapter.ConditionViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.conditionTitle = null;
    target.gridView = null;
  }
}
