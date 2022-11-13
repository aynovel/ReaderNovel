// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.ui.other.adapter;

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

public class NewReadCatalogAdapter$CatalogViewHolder_ViewBinding implements Unbinder {
  private NewReadCatalogAdapter.CatalogViewHolder target;

  @UiThread
  public NewReadCatalogAdapter$CatalogViewHolder_ViewBinding(
      NewReadCatalogAdapter.CatalogViewHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.hot = Utils.findRequiredView(source, R.id.hot, "field 'hot'");
    target.status = Utils.findRequiredViewAsType(source, R.id.status, "field 'status'", ImageView.class);
    target.v_line = Utils.findRequiredView(source, R.id.v_line, "field 'v_line'");
  }

  @Override
  @CallSuper
  public void unbind() {
    NewReadCatalogAdapter.CatalogViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.hot = null;
    target.status = null;
    target.v_line = null;
  }
}
