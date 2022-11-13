// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookranking;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.cantview.CantSlideViewPager;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RankingFragment_ViewBinding implements Unbinder {
  private RankingFragment target;

  @UiThread
  public RankingFragment_ViewBinding(RankingFragment target, View source) {
    this.target = target;

    target.mLayoutRank = Utils.findRequiredViewAsType(source, R.id.layout_rank, "field 'mLayoutRank'", LinearLayout.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", CantSlideViewPager.class);
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    RankingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLayoutRank = null;
    target.mRecyclerView = null;
    target.mViewPager = null;
    target.mNoneView = null;
  }
}
