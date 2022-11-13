// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.account;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VoucherAdapter$VoucherViewHolder_ViewBinding implements Unbinder {
  private VoucherAdapter.VoucherViewHolder target;

  @UiThread
  public VoucherAdapter$VoucherViewHolder_ViewBinding(VoucherAdapter.VoucherViewHolder target,
      View source) {
    this.target = target;

    target.mValue = Utils.findRequiredViewAsType(source, R.id.value, "field 'mValue'", TextView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.name, "field 'mName'", TextView.class);
    target.mLeftValue = Utils.findRequiredViewAsType(source, R.id.leftValue, "field 'mLeftValue'", TextView.class);
    target.mValueFrom = Utils.findRequiredViewAsType(source, R.id.voucherFrom, "field 'mValueFrom'", TextView.class);
    target.mEnableDate = Utils.findRequiredViewAsType(source, R.id.enableDate, "field 'mEnableDate'", TextView.class);
    target.mIcon = Utils.findRequiredViewAsType(source, R.id.overdueIcon, "field 'mIcon'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VoucherAdapter.VoucherViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mValue = null;
    target.mName = null;
    target.mLeftValue = null;
    target.mValueFrom = null;
    target.mEnableDate = null;
    target.mIcon = null;
  }
}
