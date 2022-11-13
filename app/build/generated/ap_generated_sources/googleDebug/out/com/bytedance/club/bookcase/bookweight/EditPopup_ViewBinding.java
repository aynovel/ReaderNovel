// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookcase.bookweight;

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

public class EditPopup_ViewBinding implements Unbinder {
  private EditPopup target;

  private View view7f0807fa;

  private View view7f08012b;

  @UiThread
  public EditPopup_ViewBinding(final EditPopup target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.selectAll, "field 'mSelectAll' and method 'onSelectAllClick'");
    target.mSelectAll = Utils.castView(view, R.id.selectAll, "field 'mSelectAll'", TextView.class);
    view7f0807fa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSelectAllClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.delete, "field 'mDelete' and method 'onDeleteClick'");
    target.mDelete = Utils.castView(view, R.id.delete, "field 'mDelete'", TextView.class);
    view7f08012b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDeleteClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EditPopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSelectAll = null;
    target.mDelete = null;

    view7f0807fa.setOnClickListener(null);
    view7f0807fa = null;
    view7f08012b.setOnClickListener(null);
    view7f08012b = null;
  }
}
