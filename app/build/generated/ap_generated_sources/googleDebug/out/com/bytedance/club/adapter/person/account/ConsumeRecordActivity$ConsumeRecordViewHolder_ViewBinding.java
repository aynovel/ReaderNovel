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

public class ConsumeRecordActivity$ConsumeRecordViewHolder_ViewBinding implements Unbinder {
  private ConsumeRecordActivity.ConsumeRecordViewHolder target;

  @UiThread
  public ConsumeRecordActivity$ConsumeRecordViewHolder_ViewBinding(
      ConsumeRecordActivity.ConsumeRecordViewHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConsumeRecordActivity.ConsumeRecordViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.money = null;
    target.date = null;
  }
}
