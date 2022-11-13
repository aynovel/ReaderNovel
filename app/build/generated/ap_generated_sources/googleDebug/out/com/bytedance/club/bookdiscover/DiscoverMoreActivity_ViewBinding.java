// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdiscover;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DiscoverMoreActivity_ViewBinding implements Unbinder {
  private DiscoverMoreActivity target;

  @UiThread
  public DiscoverMoreActivity_ViewBinding(DiscoverMoreActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DiscoverMoreActivity_ViewBinding(DiscoverMoreActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DiscoverMoreActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
