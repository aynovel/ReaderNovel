// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person.readingmsg;

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

public class MessageReplyMeFragment$ReplyMeViewHolder_ViewBinding implements Unbinder {
  private MessageReplyMeFragment.ReplyMeViewHolder target;

  @UiThread
  public MessageReplyMeFragment$ReplyMeViewHolder_ViewBinding(
      MessageReplyMeFragment.ReplyMeViewHolder target, View source) {
    this.target = target;

    target.head = Utils.findRequiredViewAsType(source, R.id.head, "field 'head'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", TextView.class);
    target.from = Utils.findRequiredViewAsType(source, R.id.from, "field 'from'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MessageReplyMeFragment.ReplyMeViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.head = null;
    target.name = null;
    target.date = null;
    target.content = null;
    target.from = null;
  }
}
