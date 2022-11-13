// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.LevelView;
import com.bytedance.club.publics.weight.RadiusImageView;
import com.bytedance.club.sql.NiceRatingBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserWorkCommentListActivity$PersonalCommentViewHolder_ViewBinding implements Unbinder {
  private UserWorkCommentListActivity.PersonalCommentViewHolder target;

  @UiThread
  public UserWorkCommentListActivity$PersonalCommentViewHolder_ViewBinding(
      UserWorkCommentListActivity.PersonalCommentViewHolder target, View source) {
    this.target = target;

    target.comment = Utils.findRequiredView(source, R.id.comment, "field 'comment'");
    target.head = Utils.findRequiredViewAsType(source, R.id.head, "field 'head'", RadiusImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.name, "field 'name'", TextView.class);
    target.level = Utils.findRequiredViewAsType(source, R.id.level, "field 'level'", LevelView.class);
    target.reply = Utils.findRequiredViewAsType(source, R.id.reply, "field 'reply'", TextView.class);
    target.like = Utils.findRequiredViewAsType(source, R.id.like, "field 'like'", TextView.class);
    target.score = Utils.findRequiredViewAsType(source, R.id.score, "field 'score'", NiceRatingBar.class);
    target.reward = Utils.findRequiredViewAsType(source, R.id.reward, "field 'reward'", TextView.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", TextView.class);
    target.work = Utils.findRequiredView(source, R.id.work, "field 'work'");
    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.author = Utils.findRequiredViewAsType(source, R.id.author, "field 'author'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.date, "field 'date'", TextView.class);
    target.type = Utils.findRequiredViewAsType(source, R.id.type, "field 'type'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserWorkCommentListActivity.PersonalCommentViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.comment = null;
    target.head = null;
    target.name = null;
    target.level = null;
    target.reply = null;
    target.like = null;
    target.score = null;
    target.reward = null;
    target.content = null;
    target.work = null;
    target.cover = null;
    target.title = null;
    target.author = null;
    target.date = null;
    target.type = null;
  }
}
