// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail.rewardweight;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RewardPopup_ViewBinding implements Unbinder {
  private RewardPopup target;

  private View view7f080688;

  private View view7f080689;

  private View view7f08068a;

  private View view7f08068b;

  private View view7f08068c;

  private View view7f08068d;

  private View view7f0800fe;

  @UiThread
  public RewardPopup_ViewBinding(final RewardPopup target, View source) {
    this.target = target;

    View view;
    target.my_coins = Utils.findRequiredViewAsType(source, R.id.my_coins, "field 'my_coins'", TextView.class);
    target.money_1 = Utils.findRequiredViewAsType(source, R.id.money_1, "field 'money_1'", TextView.class);
    target.money_2 = Utils.findRequiredViewAsType(source, R.id.money_2, "field 'money_2'", TextView.class);
    target.money_3 = Utils.findRequiredViewAsType(source, R.id.money_3, "field 'money_3'", TextView.class);
    target.money_4 = Utils.findRequiredViewAsType(source, R.id.money_4, "field 'money_4'", TextView.class);
    target.money_5 = Utils.findRequiredViewAsType(source, R.id.money_5, "field 'money_5'", TextView.class);
    target.money_6 = Utils.findRequiredViewAsType(source, R.id.money_6, "field 'money_6'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_bg_1, "field 'll_bg_1' and method 'll_bg_1'");
    target.ll_bg_1 = Utils.castView(view, R.id.ll_bg_1, "field 'll_bg_1'", LinearLayout.class);
    view7f080688 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_1();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_bg_2, "field 'll_bg_2' and method 'll_bg_2'");
    target.ll_bg_2 = Utils.castView(view, R.id.ll_bg_2, "field 'll_bg_2'", LinearLayout.class);
    view7f080689 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_2();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_bg_3, "field 'll_bg_3' and method 'll_bg_3'");
    target.ll_bg_3 = Utils.castView(view, R.id.ll_bg_3, "field 'll_bg_3'", LinearLayout.class);
    view7f08068a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_3();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_bg_4, "field 'll_bg_4' and method 'll_bg_4'");
    target.ll_bg_4 = Utils.castView(view, R.id.ll_bg_4, "field 'll_bg_4'", LinearLayout.class);
    view7f08068b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_4();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_bg_5, "field 'll_bg_5' and method 'll_bg_5'");
    target.ll_bg_5 = Utils.castView(view, R.id.ll_bg_5, "field 'll_bg_5'", LinearLayout.class);
    view7f08068c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_5();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_bg_6, "field 'll_bg_6' and method 'll_bg_6'");
    target.ll_bg_6 = Utils.castView(view, R.id.ll_bg_6, "field 'll_bg_6'", LinearLayout.class);
    view7f08068d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ll_bg_6();
      }
    });
    view = Utils.findRequiredView(source, R.id.confirm, "field 'mConfirm' and method 'onConfirmClick'");
    target.mConfirm = Utils.castView(view, R.id.confirm, "field 'mConfirm'", TextView.class);
    view7f0800fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onConfirmClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RewardPopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.my_coins = null;
    target.money_1 = null;
    target.money_2 = null;
    target.money_3 = null;
    target.money_4 = null;
    target.money_5 = null;
    target.money_6 = null;
    target.ll_bg_1 = null;
    target.ll_bg_2 = null;
    target.ll_bg_3 = null;
    target.ll_bg_4 = null;
    target.ll_bg_5 = null;
    target.ll_bg_6 = null;
    target.mConfirm = null;

    view7f080688.setOnClickListener(null);
    view7f080688 = null;
    view7f080689.setOnClickListener(null);
    view7f080689 = null;
    view7f08068a.setOnClickListener(null);
    view7f08068a = null;
    view7f08068b.setOnClickListener(null);
    view7f08068b = null;
    view7f08068c.setOnClickListener(null);
    view7f08068c = null;
    view7f08068d.setOnClickListener(null);
    view7f08068d = null;
    view7f0800fe.setOnClickListener(null);
    view7f0800fe = null;
  }
}
