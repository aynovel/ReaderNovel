// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.niceratingbar.NiceRatingBar;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.RefreshHeaderView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkCommentListActivity_ViewBinding implements Unbinder {
  private WorkCommentListActivity target;

  private View view7f0806c0;

  private View view7f080213;

  private View view7f0808fb;

  private View view7f0806c1;

  private View view7f080214;

  private View view7f0800f6;

  @UiThread
  public WorkCommentListActivity_ViewBinding(WorkCommentListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WorkCommentListActivity_ViewBinding(final WorkCommentListActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mRefreshHeader = Utils.findRequiredViewAsType(source, R.id.refreshHeader, "field 'mRefreshHeader'", RefreshHeaderView.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    view = Utils.findRequiredView(source, R.id.ll_white_comment, "field 'll_white_comment' and method 'setOnClick'");
    target.ll_white_comment = Utils.castView(view, R.id.ll_white_comment, "field 'll_white_comment'", LinearLayout.class);
    view7f0806c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.header_comment = Utils.findRequiredViewAsType(source, R.id.header_comment, "field 'header_comment'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_close, "field 'iv_close' and method 'setOnClick'");
    target.iv_close = Utils.castView(view, R.id.iv_close, "field 'iv_close'", ImageView.class);
    view7f080213 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_commit, "field 'tv_commit' and method 'setOnClick'");
    target.tv_commit = Utils.castView(view, R.id.tv_commit, "field 'tv_commit'", TextView.class);
    view7f0808fb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.opreview_ratingbar_comment = Utils.findRequiredViewAsType(source, R.id.opreview_ratingbar_comment, "field 'opreview_ratingbar_comment'", NiceRatingBar.class);
    target.edit_comment = Utils.findRequiredViewAsType(source, R.id.edit_comment, "field 'edit_comment'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ll_white_comment_child, "field 'll_white_comment_child' and method 'setOnClick'");
    target.ll_white_comment_child = Utils.castView(view, R.id.ll_white_comment_child, "field 'll_white_comment_child'", LinearLayout.class);
    view7f0806c1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.header_comment_child = Utils.findRequiredViewAsType(source, R.id.header_comment_child, "field 'header_comment_child'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_close_child, "field 'iv_close_child' and method 'setOnClick'");
    target.iv_close_child = Utils.castView(view, R.id.iv_close_child, "field 'iv_close_child'", ImageView.class);
    view7f080214 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.fragment_container = Utils.findRequiredViewAsType(source, R.id.fragment_container, "field 'fragment_container'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.comment, "method 'setOnClick'");
    view7f0800f6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WorkCommentListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mRefreshLayout = null;
    target.mRefreshHeader = null;
    target.mLoadFooter = null;
    target.ll_white_comment = null;
    target.header_comment = null;
    target.iv_close = null;
    target.tv_commit = null;
    target.opreview_ratingbar_comment = null;
    target.edit_comment = null;
    target.ll_white_comment_child = null;
    target.header_comment_child = null;
    target.iv_close_child = null;
    target.fragment_container = null;

    view7f0806c0.setOnClickListener(null);
    view7f0806c0 = null;
    view7f080213.setOnClickListener(null);
    view7f080213 = null;
    view7f0808fb.setOnClickListener(null);
    view7f0808fb = null;
    view7f0806c1.setOnClickListener(null);
    view7f0806c1 = null;
    view7f080214.setOnClickListener(null);
    view7f080214 = null;
    view7f0800f6.setOnClickListener(null);
    view7f0800f6 = null;
  }
}
