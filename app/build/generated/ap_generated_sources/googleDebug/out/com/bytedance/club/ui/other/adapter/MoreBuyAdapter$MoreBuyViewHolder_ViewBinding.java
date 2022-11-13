// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.ui.other.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoreBuyAdapter$MoreBuyViewHolder_ViewBinding implements Unbinder {
  private MoreBuyAdapter.MoreBuyViewHolder target;

  @UiThread
  public MoreBuyAdapter$MoreBuyViewHolder_ViewBinding(MoreBuyAdapter.MoreBuyViewHolder target,
      View source) {
    this.target = target;

    target.rl_bg = Utils.findRequiredViewAsType(source, R.id.rl_bg, "field 'rl_bg'", RelativeLayout.class);
    target.tv_prace = Utils.findRequiredViewAsType(source, R.id.tv_prace, "field 'tv_prace'", TextView.class);
    target.tv_chapters = Utils.findRequiredViewAsType(source, R.id.tv_chapters, "field 'tv_chapters'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoreBuyAdapter.MoreBuyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_bg = null;
    target.tv_prace = null;
    target.tv_chapters = null;
  }
}
