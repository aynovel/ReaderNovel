// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookranking;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.RefreshHeaderView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RankingChildFragment_ViewBinding implements Unbinder {
  private RankingChildFragment target;

  private View view7f08021c;

  @UiThread
  public RankingChildFragment_ViewBinding(final RankingChildFragment target, View source) {
    this.target = target;

    View view;
    target.mCycleText = Utils.findRequiredViewAsType(source, R.id.textView, "field 'mCycleText'", TextView.class);
    target.tv_type = Utils.findRequiredViewAsType(source, R.id.tv_type, "field 'tv_type'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_hint, "field 'iv_hint' and method 'onTvhintClick'");
    target.iv_hint = Utils.castView(view, R.id.iv_hint, "field 'iv_hint'", ImageView.class);
    view7f08021c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTvhintClick();
      }
    });
    target.mCycleSelector = Utils.findRequiredViewAsType(source, R.id.cycleSelector, "field 'mCycleSelector'", RelativeLayout.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mRefreshHeader = Utils.findRequiredViewAsType(source, R.id.refreshHeader, "field 'mRefreshHeader'", RefreshHeaderView.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RankingChildFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCycleText = null;
    target.tv_type = null;
    target.iv_hint = null;
    target.mCycleSelector = null;
    target.mRefreshLayout = null;
    target.mRefreshHeader = null;
    target.mLoadFooter = null;
    target.mRecyclerView = null;

    view7f08021c.setOnClickListener(null);
    view7f08021c = null;
  }
}
