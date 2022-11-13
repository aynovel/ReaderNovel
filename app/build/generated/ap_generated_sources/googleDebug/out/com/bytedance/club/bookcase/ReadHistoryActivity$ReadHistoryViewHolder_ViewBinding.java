// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookcase;

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

public class ReadHistoryActivity$ReadHistoryViewHolder_ViewBinding implements Unbinder {
  private ReadHistoryActivity.ReadHistoryViewHolder target;

  @UiThread
  public ReadHistoryActivity$ReadHistoryViewHolder_ViewBinding(
      ReadHistoryActivity.ReadHistoryViewHolder target, View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.author = Utils.findRequiredViewAsType(source, R.id.author, "field 'author'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.collect = Utils.findRequiredViewAsType(source, R.id.collect, "field 'collect'", TextView.class);
    target.select = Utils.findRequiredViewAsType(source, R.id.select, "field 'select'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReadHistoryActivity.ReadHistoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.title = null;
    target.author = null;
    target.date = null;
    target.collect = null;
    target.select = null;
  }
}
