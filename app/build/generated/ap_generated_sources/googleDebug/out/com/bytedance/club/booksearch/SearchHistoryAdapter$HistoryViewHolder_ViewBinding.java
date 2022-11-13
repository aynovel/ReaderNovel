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

public class SearchHistoryAdapter$HistoryViewHolder_ViewBinding implements Unbinder {
  private SearchHistoryAdapter.HistoryViewHolder target;

  @UiThread
  public SearchHistoryAdapter$HistoryViewHolder_ViewBinding(
      SearchHistoryAdapter.HistoryViewHolder target, View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
    target.imgclear = Utils.findRequiredViewAsType(source, R.id.img_clear, "field 'imgclear'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchHistoryAdapter.HistoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
    target.imgclear = null;
  }
}
