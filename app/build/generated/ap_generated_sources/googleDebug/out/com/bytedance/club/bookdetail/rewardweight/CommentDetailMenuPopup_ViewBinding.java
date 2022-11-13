// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail.rewardweight;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.viewtext.MagnetTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommentDetailMenuPopup_ViewBinding implements Unbinder {
  private CommentDetailMenuPopup target;

  private View view7f08012b;

  private View view7f080705;

  private View view7f080704;

  private View view7f0807af;

  @UiThread
  public CommentDetailMenuPopup_ViewBinding(final CommentDetailMenuPopup target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.delete, "field 'delete' and method 'onDeleteClick'");
    target.delete = view;
    view7f08012b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDeleteClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.mt_placed_top, "field 'mt_placed_top' and method 'onWeChatClick'");
    target.mt_placed_top = Utils.castView(view, R.id.mt_placed_top, "field 'mt_placed_top'", MagnetTextView.class);
    view7f080705 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWeChatClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.mt_banned, "field 'mt_banned' and method 'onWeChatCircleClick'");
    target.mt_banned = Utils.castView(view, R.id.mt_banned, "field 'mt_banned'", MagnetTextView.class);
    view7f080704 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWeChatCircleClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.report, "method 'onReportClick'");
    view7f0807af = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReportClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentDetailMenuPopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.delete = null;
    target.mt_placed_top = null;
    target.mt_banned = null;

    view7f08012b.setOnClickListener(null);
    view7f08012b = null;
    view7f080705.setOnClickListener(null);
    view7f080705 = null;
    view7f080704.setOnClickListener(null);
    view7f080704 = null;
    view7f0807af.setOnClickListener(null);
    view7f0807af = null;
  }
}
