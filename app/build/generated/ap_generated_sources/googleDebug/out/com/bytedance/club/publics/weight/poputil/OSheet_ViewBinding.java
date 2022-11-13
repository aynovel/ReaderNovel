// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.publics.weight.poputil;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.WrapListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OSheet_ViewBinding implements Unbinder {
  private OSheet target;

  private View view7f0800b3;

  @UiThread
  public OSheet_ViewBinding(final OSheet target, View source) {
    this.target = target;

    View view;
    target.mListView = Utils.findRequiredViewAsType(source, R.id.listView, "field 'mListView'", WrapListView.class);
    view = Utils.findRequiredView(source, R.id.cancel, "field 'mCancel' and method 'onCancelClick'");
    target.mCancel = Utils.castView(view, R.id.cancel, "field 'mCancel'", TextView.class);
    view7f0800b3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    OSheet target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mListView = null;
    target.mCancel = null;

    view7f0800b3.setOnClickListener(null);
    view7f0800b3 = null;
  }
}
