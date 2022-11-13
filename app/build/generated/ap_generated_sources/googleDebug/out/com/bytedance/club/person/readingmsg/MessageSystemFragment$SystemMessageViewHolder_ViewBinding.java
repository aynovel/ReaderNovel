// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.readingmsg;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MessageSystemFragment$SystemMessageViewHolder_ViewBinding implements Unbinder {
  private MessageSystemFragment.SystemMessageViewHolder target;

  @UiThread
  public MessageSystemFragment$SystemMessageViewHolder_ViewBinding(
      MessageSystemFragment.SystemMessageViewHolder target, View source) {
    this.target = target;

    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MessageSystemFragment.SystemMessageViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.content = null;
    target.date = null;
  }
}
