// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.account;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RechargeRecordActivity$RechargeRecordViewHolder_ViewBinding implements Unbinder {
  private RechargeRecordActivity.RechargeRecordViewHolder target;

  @UiThread
  public RechargeRecordActivity$RechargeRecordViewHolder_ViewBinding(
      RechargeRecordActivity.RechargeRecordViewHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RechargeRecordActivity.RechargeRecordViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.date = null;
    target.money = null;
  }
}
