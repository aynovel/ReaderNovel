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

public class SearchResultAdapter$ResultHolder_ViewBinding implements Unbinder {
  private SearchResultAdapter.ResultHolder target;

  @UiThread
  public SearchResultAdapter$ResultHolder_ViewBinding(SearchResultAdapter.ResultHolder target,
      View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
    target.author = Utils.findRequiredViewAsType(source, R.id.author, "field 'author'", TextView.class);
    target.sortname = Utils.findRequiredViewAsType(source, R.id.sort_name, "field 'sortname'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchResultAdapter.ResultHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.title = null;
    target.description = null;
    target.author = null;
    target.sortname = null;
  }
}
