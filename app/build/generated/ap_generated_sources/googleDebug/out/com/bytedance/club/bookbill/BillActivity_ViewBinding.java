// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookbill;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BillActivity_ViewBinding implements Unbinder {
  private BillActivity target;

  @UiThread
  public BillActivity_ViewBinding(BillActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BillActivity_ViewBinding(BillActivity target, View source) {
    this.target = target;

    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    BillActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRefreshLayout = null;
    target.mLoadFooter = null;
    target.mRecyclerView = null;
    target.mNoneView = null;
  }
}
