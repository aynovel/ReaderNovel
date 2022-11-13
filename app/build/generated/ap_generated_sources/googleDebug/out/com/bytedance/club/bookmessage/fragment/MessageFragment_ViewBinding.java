// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookmessage.fragment;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MessageFragment_ViewBinding implements Unbinder {
  private MessageFragment target;

  private View view7f08064f;

  private View view7f080665;

  @UiThread
  public MessageFragment_ViewBinding(final MessageFragment target, View source) {
    this.target = target;

    View view;
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
    view = Utils.findRequiredView(source, R.id.layout_customer, "field 'mLayoutCustomer' and method 'onCustomerClick'");
    target.mLayoutCustomer = Utils.castView(view, R.id.layout_customer, "field 'mLayoutCustomer'", RelativeLayout.class);
    view7f08064f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCustomerClick();
      }
    });
    target.mViewCustomer = Utils.findRequiredView(source, R.id.view_customer, "field 'mViewCustomer'");
    target.mTvCustomer = Utils.findRequiredViewAsType(source, R.id.tv_customer, "field 'mTvCustomer'", TextView.class);
    target.mTvCustomerTime = Utils.findRequiredViewAsType(source, R.id.tv_customer_time, "field 'mTvCustomerTime'", TextView.class);
    target.mTvCustomerNum = Utils.findRequiredViewAsType(source, R.id.tv_customer_num, "field 'mTvCustomerNum'", TextView.class);
    view = Utils.findRequiredView(source, R.id.layout_system, "field 'mLayoutSystem' and method 'onSystemClick'");
    target.mLayoutSystem = Utils.castView(view, R.id.layout_system, "field 'mLayoutSystem'", RelativeLayout.class);
    view7f080665 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSystemClick();
      }
    });
    target.mViewSystem = Utils.findRequiredView(source, R.id.view_system, "field 'mViewSystem'");
    target.mTvSystem = Utils.findRequiredViewAsType(source, R.id.tv_system, "field 'mTvSystem'", TextView.class);
    target.mTvSystemTime = Utils.findRequiredViewAsType(source, R.id.tv_system_time, "field 'mTvSystemTime'", TextView.class);
    target.mTvSystemNum = Utils.findRequiredViewAsType(source, R.id.tv_system_num, "field 'mTvSystemNum'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MessageFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNoneView = null;
    target.mLayoutCustomer = null;
    target.mViewCustomer = null;
    target.mTvCustomer = null;
    target.mTvCustomerTime = null;
    target.mTvCustomerNum = null;
    target.mLayoutSystem = null;
    target.mViewSystem = null;
    target.mTvSystem = null;
    target.mTvSystemTime = null;
    target.mTvSystemNum = null;

    view7f08064f.setOnClickListener(null);
    view7f08064f = null;
    view7f080665.setOnClickListener(null);
    view7f080665 = null;
  }
}
