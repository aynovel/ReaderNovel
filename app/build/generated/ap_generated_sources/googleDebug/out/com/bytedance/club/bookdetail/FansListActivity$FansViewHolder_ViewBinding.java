// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.LevelView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FansListActivity$FansViewHolder_ViewBinding implements Unbinder {
  private FansListActivity.FansViewHolder target;

  @UiThread
  public FansListActivity$FansViewHolder_ViewBinding(FansListActivity.FansViewHolder target,
      View source) {
    this.target = target;

    target.sort = Utils.findRequiredViewAsType(source, R.id.sort, "field 'sort'", TextView.class);
    target.head = Utils.findRequiredViewAsType(source, R.id.head, "field 'head'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.level = Utils.findRequiredViewAsType(source, R.id.level, "field 'level'", LevelView.class);
    target.fansValue = Utils.findRequiredViewAsType(source, R.id.fansValue, "field 'fansValue'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FansListActivity.FansViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sort = null;
    target.head = null;
    target.name = null;
    target.level = null;
    target.fansValue = null;
  }
}
