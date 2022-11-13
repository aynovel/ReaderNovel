// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookcase;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookShelfAdapter$GridViewHolder_ViewBinding implements Unbinder {
  private BookShelfAdapter.GridViewHolder target;

  @UiThread
  public BookShelfAdapter$GridViewHolder_ViewBinding(BookShelfAdapter.GridViewHolder target,
      View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.covers, "field 'cover'", ImageView.class);
    target.type = Utils.findRequiredViewAsType(source, R.id.type, "field 'type'", ImageView.class);
    target.select = Utils.findRequiredViewAsType(source, R.id.select, "field 'select'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.imagerec = Utils.findRequiredViewAsType(source, R.id.image_rec, "field 'imagerec'", ImageView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", TextView.class);
    target.update = Utils.findRequiredViewAsType(source, R.id.update, "field 'update'", ImageView.class);
    target.read_progress = Utils.findRequiredViewAsType(source, R.id.read_progress, "field 'read_progress'", ProgressBar.class);
    target.progress_percent = Utils.findRequiredViewAsType(source, R.id.progress_percent, "field 'progress_percent'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookShelfAdapter.GridViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.type = null;
    target.select = null;
    target.name = null;
    target.imagerec = null;
    target.progress = null;
    target.update = null;
    target.read_progress = null;
    target.progress_percent = null;
  }
}
