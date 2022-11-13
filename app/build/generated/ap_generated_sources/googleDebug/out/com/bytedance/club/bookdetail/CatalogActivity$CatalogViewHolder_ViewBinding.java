// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CatalogActivity$CatalogViewHolder_ViewBinding implements Unbinder {
  private CatalogActivity.CatalogViewHolder target;

  @UiThread
  public CatalogActivity$CatalogViewHolder_ViewBinding(CatalogActivity.CatalogViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.status = Utils.findRequiredView(source, R.id.status, "field 'status'");
  }

  @Override
  @CallSuper
  public void unbind() {
    CatalogActivity.CatalogViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.status = null;
  }
}
