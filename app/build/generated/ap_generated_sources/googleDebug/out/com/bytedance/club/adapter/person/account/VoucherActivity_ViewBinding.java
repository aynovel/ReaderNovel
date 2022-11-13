// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.account;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoucherActivity_ViewBinding implements Unbinder {
  private VoucherActivity target;

  private View view7f080160;

  private View view7f080984;

  private View view7f080751;

  @UiThread
  public VoucherActivity_ViewBinding(VoucherActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VoucherActivity_ViewBinding(final VoucherActivity target, View source) {
    this.target = target;

    View view;
    target.mVoucherValue = Utils.findRequiredViewAsType(source, R.id.voucherValue, "field 'mVoucherValue'", TextView.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.exchange, "method 'onExchangeClick'");
    view7f080160 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onExchangeClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.voucherHelp, "method 'onVoucherHelpClick'");
    view7f080984 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onVoucherHelpClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.overdueVoucher, "method 'onOverdueVoucherClick'");
    view7f080751 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOverdueVoucherClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    VoucherActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mVoucherValue = null;
    target.mRefreshLayout = null;
    target.mLoadFooter = null;
    target.mRecyclerView = null;

    view7f080160.setOnClickListener(null);
    view7f080160 = null;
    view7f080984.setOnClickListener(null);
    view7f080984 = null;
    view7f080751.setOnClickListener(null);
    view7f080751 = null;
  }
}
