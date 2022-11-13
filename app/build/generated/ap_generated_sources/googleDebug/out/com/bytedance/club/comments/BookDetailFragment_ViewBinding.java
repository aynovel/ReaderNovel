// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.comments;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.AutoRollBanner;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookDetailFragment_ViewBinding implements Unbinder {
  private BookDetailFragment target;

  private View view7f08012d;

  private View view7f08012e;

  private View view7f080997;

  private View view7f080728;

  private View view7f0806fe;

  @UiThread
  public BookDetailFragment_ViewBinding(final BookDetailFragment target, View source) {
    this.target = target;

    View view;
    target.ll_label = Utils.findRequiredViewAsType(source, R.id.ll_label, "field 'll_label'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.description, "field 'mDescription' and method 'onDescriptionClick'");
    target.mDescription = Utils.castView(view, R.id.description, "field 'mDescription'", TextView.class);
    view7f08012d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDescriptionClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.descriptionFlex, "field 'mDescriptionFlex' and method 'onDescriptionClick'");
    target.mDescriptionFlex = Utils.castView(view, R.id.descriptionFlex, "field 'mDescriptionFlex'", ImageView.class);
    view7f08012e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDescriptionClick();
      }
    });
    target.mNewChapterName = Utils.findRequiredViewAsType(source, R.id.newChapterName, "field 'mNewChapterName'", TextView.class);
    target.mNewChapterDate = Utils.findRequiredViewAsType(source, R.id.newChapterDate, "field 'mNewChapterDate'", TextView.class);
    target.tv_abstract_more = Utils.findRequiredViewAsType(source, R.id.tv_abstract_more, "field 'tv_abstract_more'", TextView.class);
    target.mFansLayout = Utils.findRequiredView(source, R.id.fansLayout, "field 'mFansLayout'");
    target.mFansList = Utils.findRequiredViewAsType(source, R.id.fansList, "field 'mFansList'", RecyclerView.class);
    target.mCommentCount = Utils.findRequiredViewAsType(source, R.id.commentCount, "field 'mCommentCount'", TextView.class);
    target.mHasComment = Utils.findRequiredView(source, R.id.hasComment, "field 'mHasComment'");
    target.mCommentGroup = Utils.findRequiredViewAsType(source, R.id.commentGroup, "field 'mCommentGroup'", LinearLayout.class);
    target.mNoComment = Utils.findRequiredView(source, R.id.noComment, "field 'mNoComment'");
    target.mBannerLayout = Utils.findRequiredView(source, R.id.bannerLayout, "field 'mBannerLayout'");
    target.mBanner = Utils.findRequiredViewAsType(source, R.id.banner, "field 'mBanner'", AutoRollBanner.class);
    target.mSortRecommendLayout = Utils.findRequiredView(source, R.id.sortRecommendLayout, "field 'mSortRecommendLayout'");
    target.mSortRecyclerView = Utils.findRequiredViewAsType(source, R.id.sortRecyclerView, "field 'mSortRecyclerView'", RecyclerView.class);
    target.mOtherRecommendLayout = Utils.findRequiredView(source, R.id.otherRecommendLayout, "field 'mOtherRecommendLayout'");
    target.mOtherRecyclerView = Utils.findRequiredViewAsType(source, R.id.otherRecyclerView, "field 'mOtherRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.writeComment, "method 'onWriteCommentClick'");
    view7f080997 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWriteCommentClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.newChapter, "method 'onNewChapterClick'");
    view7f080728 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNewChapterClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.moreComment, "method 'onMoreCommentClick'");
    view7f0806fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMoreCommentClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BookDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_label = null;
    target.mDescription = null;
    target.mDescriptionFlex = null;
    target.mNewChapterName = null;
    target.mNewChapterDate = null;
    target.tv_abstract_more = null;
    target.mFansLayout = null;
    target.mFansList = null;
    target.mCommentCount = null;
    target.mHasComment = null;
    target.mCommentGroup = null;
    target.mNoComment = null;
    target.mBannerLayout = null;
    target.mBanner = null;
    target.mSortRecommendLayout = null;
    target.mSortRecyclerView = null;
    target.mOtherRecommendLayout = null;
    target.mOtherRecyclerView = null;

    view7f08012d.setOnClickListener(null);
    view7f08012d = null;
    view7f08012e.setOnClickListener(null);
    view7f08012e = null;
    view7f080997.setOnClickListener(null);
    view7f080997 = null;
    view7f080728.setOnClickListener(null);
    view7f080728 = null;
    view7f0806fe.setOnClickListener(null);
    view7f0806fe = null;
  }
}
