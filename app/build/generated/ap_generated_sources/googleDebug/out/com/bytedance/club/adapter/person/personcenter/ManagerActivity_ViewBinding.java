// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ManagerActivity_ViewBinding implements Unbinder {
  private ManagerActivity target;

  private View view7f080692;

  private View view7f080685;

  @UiThread
  public ManagerActivity_ViewBinding(ManagerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ManagerActivity_ViewBinding(final ManagerActivity target, View source) {
    this.target = target;

    View view;
    target.mBookUpdateCB = Utils.findRequiredViewAsType(source, R.id.book_update_cb, "field 'mBookUpdateCB'", CheckBox.class);
    target.mAutoLockCB = Utils.findRequiredViewAsType(source, R.id.auto_lock_cb, "field 'mAutoLockCB'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.ll_book_update_cb, "method 'onBookUpdateClick'");
    view7f080692 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBookUpdateClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_auto_lock_cb, "method 'onAutoLockClick'");
    view7f080685 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAutoLockClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ManagerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBookUpdateCB = null;
    target.mAutoLockCB = null;

    view7f080692.setOnClickListener(null);
    view7f080692 = null;
    view7f080685.setOnClickListener(null);
    view7f080685 = null;
  }
}
