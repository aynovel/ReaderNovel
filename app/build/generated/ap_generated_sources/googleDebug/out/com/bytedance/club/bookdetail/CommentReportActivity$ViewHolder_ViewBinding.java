// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommentReportActivity$ViewHolder_ViewBinding implements Unbinder {
  private CommentReportActivity.ViewHolder target;

  @UiThread
  public CommentReportActivity$ViewHolder_ViewBinding(CommentReportActivity.ViewHolder target,
      View source) {
    this.target = target;

    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
    target.checkBox = Utils.findRequiredViewAsType(source, R.id.checkBox, "field 'checkBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentReportActivity.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
    target.checkBox = null;
  }
}
