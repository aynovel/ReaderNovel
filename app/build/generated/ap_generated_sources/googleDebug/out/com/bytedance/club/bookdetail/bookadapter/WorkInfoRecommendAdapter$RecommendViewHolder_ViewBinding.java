// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail.bookadapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkInfoRecommendAdapter$RecommendViewHolder_ViewBinding implements Unbinder {
  private WorkInfoRecommendAdapter.RecommendViewHolder target;

  @UiThread
  public WorkInfoRecommendAdapter$RecommendViewHolder_ViewBinding(
      WorkInfoRecommendAdapter.RecommendViewHolder target, View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.book_name = Utils.findRequiredViewAsType(source, R.id.book_name, "field 'book_name'", TextView.class);
    target.ll_hot = Utils.findRequiredViewAsType(source, R.id.ll_hot, "field 'll_hot'", LinearLayout.class);
    target.read_num = Utils.findRequiredViewAsType(source, R.id.read_num, "field 'read_num'", TextView.class);
    target.mImgLogo = Utils.findRequiredViewAsType(source, R.id.imgLogo, "field 'mImgLogo'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WorkInfoRecommendAdapter.RecommendViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.book_name = null;
    target.ll_hot = null;
    target.read_num = null;
    target.mImgLogo = null;
  }
}
