// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.booksearch;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HotSearchWorkAdapter$HotSearchWorkViewHolder_ViewBinding implements Unbinder {
  private HotSearchWorkAdapter.HotSearchWorkViewHolder target;

  @UiThread
  public HotSearchWorkAdapter$HotSearchWorkViewHolder_ViewBinding(
      HotSearchWorkAdapter.HotSearchWorkViewHolder target, View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HotSearchWorkAdapter.HotSearchWorkViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.name = null;
  }
}
