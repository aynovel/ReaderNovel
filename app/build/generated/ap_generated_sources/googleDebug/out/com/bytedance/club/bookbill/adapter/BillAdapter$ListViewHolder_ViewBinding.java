// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookbill.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BillAdapter$ListViewHolder_ViewBinding implements Unbinder {
  private BillAdapter.ListViewHolder target;

  @UiThread
  public BillAdapter$ListViewHolder_ViewBinding(BillAdapter.ListViewHolder target, View source) {
    this.target = target;

    target.mTvState = Utils.findRequiredViewAsType(source, R.id.tv_state, "field 'mTvState'", TextView.class);
    target.mTvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'mTvTime'", TextView.class);
    target.mTvMoney = Utils.findRequiredViewAsType(source, R.id.tv_money, "field 'mTvMoney'", TextView.class);
    target.mTvExpireTime = Utils.findRequiredViewAsType(source, R.id.tv_expire_time, "field 'mTvExpireTime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BillAdapter.ListViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvState = null;
    target.mTvTime = null;
    target.mTvMoney = null;
    target.mTvExpireTime = null;
  }
}
