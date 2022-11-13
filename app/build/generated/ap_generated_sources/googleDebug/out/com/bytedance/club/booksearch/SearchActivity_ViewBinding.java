// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.booksearch;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import com.bytedance.club.publics.scrollweight.RecyclerFrameLayout;
import com.bytedance.club.publics.scrollweight.ScrollLayout;
import com.bytedance.club.publics.weight.FlowLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivity_ViewBinding implements Unbinder {
  private SearchActivity target;

  private View view7f08085e;

  private View view7f08085f;

  private View view7f0800dc;

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivity_ViewBinding(final SearchActivity target, View source) {
    this.target = target;

    View view;
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mResultRecyclerView = Utils.findRequiredViewAsType(source, R.id.resultRecyclerView, "field 'mResultRecyclerView'", RecyclerView.class);
    target.mScrollLayout = Utils.findRequiredViewAsType(source, R.id.scrollLayout, "field 'mScrollLayout'", ScrollLayout.class);
    target.mLlHistory = Utils.findRequiredViewAsType(source, R.id.ll_history, "field 'mLlHistory'", LinearLayout.class);
    target.mRecommendLayout = Utils.findRequiredView(source, R.id.recommendLayout, "field 'mRecommendLayout'");
    target.mRecyclerFrameLayout = Utils.findRequiredViewAsType(source, R.id.recyclerFrameLayout, "field 'mRecyclerFrameLayout'", RecyclerFrameLayout.class);
    target.mHotSearchKeyLayout = Utils.findRequiredView(source, R.id.hotSearchKeyLayout, "field 'mHotSearchKeyLayout'");
    view = Utils.findRequiredView(source, R.id.switchKeys, "field 'mSwitchKeys' and method 'onSwitchKeys'");
    target.mSwitchKeys = view;
    view7f08085e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchKeys();
      }
    });
    target.mFlowLayout = Utils.findRequiredViewAsType(source, R.id.flowLayout, "field 'mFlowLayout'", FlowLayout.class);
    target.mHotSearchWorkLayout = Utils.findRequiredView(source, R.id.hotSearchWorkLayout, "field 'mHotSearchWorkLayout'");
    view = Utils.findRequiredView(source, R.id.switchWorks, "field 'mSwitchWorks' and method 'onSwitchWorks'");
    target.mSwitchWorks = view;
    view7f08085f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchWorks();
      }
    });
    target.mHotSearchRecyclerView = Utils.findRequiredViewAsType(source, R.id.hotSearchRecyclerView, "field 'mHotSearchRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.clear, "method 'onClearClick'");
    view7f0800dc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClearClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRefreshLayout = null;
    target.mLoadFooter = null;
    target.mResultRecyclerView = null;
    target.mScrollLayout = null;
    target.mLlHistory = null;
    target.mRecommendLayout = null;
    target.mRecyclerFrameLayout = null;
    target.mHotSearchKeyLayout = null;
    target.mSwitchKeys = null;
    target.mFlowLayout = null;
    target.mHotSearchWorkLayout = null;
    target.mSwitchWorks = null;
    target.mHotSearchRecyclerView = null;

    view7f08085e.setOnClickListener(null);
    view7f08085e = null;
    view7f08085f.setOnClickListener(null);
    view7f08085f = null;
    view7f0800dc.setOnClickListener(null);
    view7f0800dc = null;
  }
}
