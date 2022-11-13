// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookbill;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletActivity_ViewBinding implements Unbinder {
  private WalletActivity target;

  private View view7f0808c1;

  @UiThread
  public WalletActivity_ViewBinding(WalletActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletActivity_ViewBinding(final WalletActivity target, View source) {
    this.target = target;

    View view;
    target.mTvCoins = Utils.findRequiredViewAsType(source, R.id.tv_coins, "field 'mTvCoins'", TextView.class);
    target.mTvCoupons = Utils.findRequiredViewAsType(source, R.id.tv_coupons, "field 'mTvCoupons'", TextView.class);
    target.mTvTip = Utils.findRequiredViewAsType(source, R.id.tvTip, "field 'mTvTip'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tvDetail, "method 'onClick'");
    view7f0808c1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvCoins = null;
    target.mTvCoupons = null;
    target.mTvTip = null;

    view7f0808c1.setOnClickListener(null);
    view7f0808c1 = null;
  }
}
