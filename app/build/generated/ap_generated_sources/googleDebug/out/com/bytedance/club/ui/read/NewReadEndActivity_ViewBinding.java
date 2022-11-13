// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.ui.read;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.niceratingbar.NiceRatingBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewReadEndActivity_ViewBinding implements Unbinder {
  private NewReadEndActivity target;

  private View view7f0808fb;

  private View view7f080234;

  private View view7f080193;

  private View view7f080696;

  private View view7f0806fd;

  private View view7f0807a2;

  private View view7f0806c8;

  private View view7f080213;

  private View view7f0807bc;

  @UiThread
  public NewReadEndActivity_ViewBinding(NewReadEndActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewReadEndActivity_ViewBinding(final NewReadEndActivity target, View source) {
    this.target = target;

    View view;
    target.mIsFinish = Utils.findRequiredViewAsType(source, R.id.isFinish, "field 'mIsFinish'", TextView.class);
    target.upload_hint = Utils.findRequiredViewAsType(source, R.id.upload_hint, "field 'upload_hint'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_commit, "field 'tv_commit' and method 'setPublishClick'");
    target.tv_commit = Utils.castView(view, R.id.tv_commit, "field 'tv_commit'", TextView.class);
    view7f0808fb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setPublishClick();
      }
    });
    target.opreview_ratingbar = Utils.findRequiredViewAsType(source, R.id.opreview_ratingbar, "field 'opreview_ratingbar'", NiceRatingBar.class);
    target.edit_comment = Utils.findRequiredViewAsType(source, R.id.edit_comment, "field 'edit_comment'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_sang, "field 'iv_sang' and method 'OnRewardClick'");
    target.iv_sang = Utils.castView(view, R.id.iv_sang, "field 'iv_sang'", ImageView.class);
    view7f080234 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnRewardClick();
      }
    });
    target.comment_name = Utils.findRequiredViewAsType(source, R.id.comment_name, "field 'comment_name'", TextView.class);
    target.comment_content = Utils.findRequiredViewAsType(source, R.id.comment_content, "field 'comment_content'", TextView.class);
    target.iv_head = Utils.findRequiredViewAsType(source, R.id.iv_head, "field 'iv_head'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.go_comment, "field 'go_comment' and method 'setGoCommentClick'");
    target.go_comment = Utils.castView(view, R.id.go_comment, "field 'go_comment'", TextView.class);
    view7f080193 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setGoCommentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_comment, "field 'll_comment' and method 'setHideClick'");
    target.ll_comment = Utils.castView(view, R.id.ll_comment, "field 'll_comment'", LinearLayout.class);
    view7f080696 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setHideClick();
      }
    });
    target.rl_upload = Utils.findRequiredViewAsType(source, R.id.rl_upload, "field 'rl_upload'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.more, "field 'more' and method 'OnCommentMoreClick'");
    target.more = Utils.castView(view, R.id.more, "field 'more'", LinearLayout.class);
    view7f0806fd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnCommentMoreClick();
      }
    });
    target.tv_name = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tv_name'", TextView.class);
    target.like_more_content = Utils.findRequiredViewAsType(source, R.id.like_more_content, "field 'like_more_content'", RecyclerView.class);
    target.rl_complete = Utils.findRequiredViewAsType(source, R.id.rl_complete, "field 'rl_complete'", RelativeLayout.class);
    target.recommend_book_cover = Utils.findRequiredViewAsType(source, R.id.recommend_book_cover, "field 'recommend_book_cover'", ImageView.class);
    target.recommend_book_title = Utils.findRequiredViewAsType(source, R.id.recommend_book_title, "field 'recommend_book_title'", TextView.class);
    target.recommend_book_content = Utils.findRequiredViewAsType(source, R.id.recommend_book_content, "field 'recommend_book_content'", TextView.class);
    target.recommend_chapter_title = Utils.findRequiredViewAsType(source, R.id.recommend_chapter_title, "field 'recommend_chapter_title'", TextView.class);
    target.recommend_chapter_content = Utils.findRequiredViewAsType(source, R.id.recommend_chapter_content, "field 'recommend_chapter_content'", TextView.class);
    view = Utils.findRequiredView(source, R.id.recommend_chapter_go_on, "field 'recommend_chapter_go_on' and method 'OnContinueClick'");
    target.recommend_chapter_go_on = Utils.castView(view, R.id.recommend_chapter_go_on, "field 'recommend_chapter_go_on'", TextView.class);
    view7f0807a2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnContinueClick();
      }
    });
    target.all_comment = Utils.findRequiredViewAsType(source, R.id.all_comment, "field 'all_comment'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.look_all_comment, "method 'OnCommentClick'");
    view7f0806c8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnCommentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_close, "method 'onHideClick'");
    view7f080213 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onHideClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rl, "method 'OnRecommentClick'");
    view7f0807bc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnRecommentClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    NewReadEndActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIsFinish = null;
    target.upload_hint = null;
    target.tv_commit = null;
    target.opreview_ratingbar = null;
    target.edit_comment = null;
    target.iv_sang = null;
    target.comment_name = null;
    target.comment_content = null;
    target.iv_head = null;
    target.go_comment = null;
    target.ll_comment = null;
    target.rl_upload = null;
    target.more = null;
    target.tv_name = null;
    target.like_more_content = null;
    target.rl_complete = null;
    target.recommend_book_cover = null;
    target.recommend_book_title = null;
    target.recommend_book_content = null;
    target.recommend_chapter_title = null;
    target.recommend_chapter_content = null;
    target.recommend_chapter_go_on = null;
    target.all_comment = null;

    view7f0808fb.setOnClickListener(null);
    view7f0808fb = null;
    view7f080234.setOnClickListener(null);
    view7f080234 = null;
    view7f080193.setOnClickListener(null);
    view7f080193 = null;
    view7f080696.setOnClickListener(null);
    view7f080696 = null;
    view7f0806fd.setOnClickListener(null);
    view7f0806fd = null;
    view7f0807a2.setOnClickListener(null);
    view7f0807a2 = null;
    view7f0806c8.setOnClickListener(null);
    view7f0806c8 = null;
    view7f080213.setOnClickListener(null);
    view7f080213 = null;
    view7f0807bc.setOnClickListener(null);
    view7f0807bc = null;
  }
}
