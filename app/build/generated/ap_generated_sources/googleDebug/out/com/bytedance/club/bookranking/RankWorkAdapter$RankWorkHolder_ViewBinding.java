// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookranking;

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

public class RankWorkAdapter$RankWorkHolder_ViewBinding implements Unbinder {
  private RankWorkAdapter.RankWorkHolder target;

  @UiThread
  public RankWorkAdapter$RankWorkHolder_ViewBinding(RankWorkAdapter.RankWorkHolder target,
      View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
    target.author = Utils.findRequiredViewAsType(source, R.id.author, "field 'author'", TextView.class);
    target.sort = Utils.findRequiredViewAsType(source, R.id.sort, "field 'sort'", TextView.class);
    target.sortTitle = Utils.findRequiredViewAsType(source, R.id.sortTitle_type, "field 'sortTitle'", TextView.class);
    target.iv_start = Utils.findRequiredViewAsType(source, R.id.iv_start, "field 'iv_start'", ImageView.class);
    target.tv_num = Utils.findRequiredViewAsType(source, R.id.tv_num, "field 'tv_num'", TextView.class);
    target.ll_ranking = Utils.findRequiredViewAsType(source, R.id.ll_ranking, "field 'll_ranking'", LinearLayout.class);
    target.iv_type = Utils.findRequiredViewAsType(source, R.id.iv_type, "field 'iv_type'", ImageView.class);
    target.tv_sum_type = Utils.findRequiredViewAsType(source, R.id.tv_sum_type, "field 'tv_sum_type'", TextView.class);
    target.tv_score = Utils.findRequiredViewAsType(source, R.id.tv_score, "field 'tv_score'", TextView.class);
    target.tv_award = Utils.findRequiredViewAsType(source, R.id.tv_award, "field 'tv_award'", TextView.class);
    target.iv_bang = Utils.findRequiredViewAsType(source, R.id.iv_bang, "field 'iv_bang'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RankWorkAdapter.RankWorkHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.title = null;
    target.description = null;
    target.author = null;
    target.sort = null;
    target.sortTitle = null;
    target.iv_start = null;
    target.tv_num = null;
    target.ll_ranking = null;
    target.iv_type = null;
    target.tv_sum_type = null;
    target.tv_score = null;
    target.tv_award = null;
    target.iv_bang = null;
  }
}
