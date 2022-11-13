// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.account;

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

public class AccountActivity_ViewBinding implements Unbinder {
  private AccountActivity target;

  private View view7f08079b;

  private View view7f080985;

  private View view7f08079c;

  private View view7f080103;

  @UiThread
  public AccountActivity_ViewBinding(AccountActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AccountActivity_ViewBinding(final AccountActivity target, View source) {
    this.target = target;

    View view;
    target.mMoney = Utils.findRequiredViewAsType(source, R.id.money, "field 'mMoney'", TextView.class);
    target.mVoucher = Utils.findRequiredViewAsType(source, R.id.voucher, "field 'mVoucher'", TextView.class);
    view = Utils.findRequiredView(source, R.id.recharge, "method 'onRechargeClick'");
    view7f08079b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRechargeClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.voucherItem, "method 'onVoucherItemClick'");
    view7f080985 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onVoucherItemClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rechargeItem, "method 'onRechargeItemClick'");
    view7f08079c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRechargeItemClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.consumeItem, "method 'onConsumeItemClick'");
    view7f080103 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onConsumeItemClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMoney = null;
    target.mVoucher = null;

    view7f08079b.setOnClickListener(null);
    view7f08079b = null;
    view7f080985.setOnClickListener(null);
    view7f080985 = null;
    view7f08079c.setOnClickListener(null);
    view7f08079c = null;
    view7f080103.setOnClickListener(null);
    view7f080103 = null;
  }
}
