// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail.bookadapter;

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

public class NewWorkInfoRecommendAdapter$RecommendViewHolder_ViewBinding implements Unbinder {
  private NewWorkInfoRecommendAdapter.RecommendViewHolder target;

  @UiThread
  public NewWorkInfoRecommendAdapter$RecommendViewHolder_ViewBinding(
      NewWorkInfoRecommendAdapter.RecommendViewHolder target, View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.book_name = Utils.findRequiredViewAsType(source, R.id.book_name, "field 'book_name'", TextView.class);
    target.book_author = Utils.findRequiredViewAsType(source, R.id.book_author, "field 'book_author'", TextView.class);
    target.book_info = Utils.findRequiredViewAsType(source, R.id.book_info, "field 'book_info'", TextView.class);
    target.book_other = Utils.findRequiredViewAsType(source, R.id.book_other, "field 'book_other'", TextView.class);
    target.imgLogo = Utils.findRequiredViewAsType(source, R.id.imgLogo, "field 'imgLogo'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewWorkInfoRecommendAdapter.RecommendViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.book_name = null;
    target.book_author = null;
    target.book_info = null;
    target.book_other = null;
    target.imgLogo = null;
  }
}
