// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.view.View;
import android.widget.Button;
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
import com.bytedance.club.publics.fresh.android.view.ObservableScrollView;
import com.bytedance.club.publics.textviewfold.ExpandableTextView;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkDetailActivity_ViewBinding implements Unbinder {
  private WorkDetailActivity target;

  private View view7f0807d2;

  private View view7f080235;

  private View view7f080745;

  private View view7f08013f;

  private View view7f08084f;

  private View view7f08069f;

  private View view7f080699;

  private View view7f08069d;

  private View view7f080696;

  private View view7f080998;

  private View view7f080695;

  private View view7f0806ff;

  private View view7f0806c0;

  private View view7f080213;

  private View view7f0808fb;

  private View view7f080683;

  private View view7f0800d3;

  private View view7f080232;

  private View view7f080062;

  private View view7f0806a8;

  private View view7f0806fe;

  private View view7f0807c5;

  @UiThread
  public WorkDetailActivity_ViewBinding(WorkDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WorkDetailActivity_ViewBinding(final WorkDetailActivity target, View source) {
    this.target = target;

    View view;
    target.rl = Utils.findRequiredViewAsType(source, R.id.rl, "field 'rl'", RelativeLayout.class);
    target.book_detail_discount = Utils.findRequiredViewAsType(source, R.id.book_detail_discount, "field 'book_detail_discount'", TextView.class);
    target.book_detail_author = Utils.findRequiredViewAsType(source, R.id.book_detail_author, "field 'book_detail_author'", TextView.class);
    target.ll_start_read = Utils.findRequiredViewAsType(source, R.id.ll_start_read, "field 'll_start_read'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.rl_tibar, "field 'rl_tibar' and method 'setOnClick'");
    target.rl_tibar = Utils.castView(view, R.id.rl_tibar, "field 'rl_tibar'", RelativeLayout.class);
    view7f0807d2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.book_title = Utils.findRequiredViewAsType(source, R.id.book_title, "field 'book_title'", TextView.class);
    target.iv_back = Utils.findRequiredViewAsType(source, R.id.iv_back, "field 'iv_back'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.iv_share, "field 'iv_share' and method 'setOnClick'");
    target.iv_share = Utils.castView(view, R.id.iv_share, "field 'iv_share'", ImageView.class);
    view7f080235 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.btn_state = Utils.findRequiredViewAsType(source, R.id.btn_state, "field 'btn_state'", Button.class);
    target.book_detail_follow = Utils.findRequiredViewAsType(source, R.id.book_detail_follow, "field 'book_detail_follow'", TextView.class);
    target.book_detail_read = Utils.findRequiredViewAsType(source, R.id.book_detail_read, "field 'book_detail_read'", TextView.class);
    target.book_detail_reward = Utils.findRequiredViewAsType(source, R.id.book_detail_reward, "field 'book_detail_reward'", TextView.class);
    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'mScrollView'", ObservableScrollView.class);
    target.mCover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'mCover'", ImageView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
    target.essay_logo = Utils.findRequiredViewAsType(source, R.id.essay_logo, "field 'essay_logo'", ImageView.class);
    target.descriptions = Utils.findRequiredViewAsType(source, R.id.descriptions, "field 'descriptions'", ExpandableTextView.class);
    view = Utils.findRequiredView(source, R.id.opreview_ratingbar, "field 'opreview_ratingbar' and method 'setOnClick'");
    target.opreview_ratingbar = Utils.castView(view, R.id.opreview_ratingbar, "field 'opreview_ratingbar'", NiceRatingBar.class);
    view7f080745 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.mClickCount = Utils.findRequiredViewAsType(source, R.id.clickCount, "field 'mClickCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.do_bookcase, "field 'do_bookcase' and method 'setOnClick'");
    target.do_bookcase = Utils.castView(view, R.id.do_bookcase, "field 'do_bookcase'", ImageView.class);
    view7f08013f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.startRead, "field 'mStartRead' and method 'setOnClick'");
    target.mStartRead = Utils.castView(view, R.id.startRead, "field 'mStartRead'", TextView.class);
    view7f08084f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.ll_nei_content = Utils.findRequiredViewAsType(source, R.id.ll_nei_content, "field 'll_nei_content'", LinearLayout.class);
    target.ll_type = Utils.findRequiredViewAsType(source, R.id.ll_type, "field 'll_type'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_description_wai, "field 'll_description_wai' and method 'setOnClick'");
    target.ll_description_wai = Utils.castView(view, R.id.ll_description_wai, "field 'll_description_wai'", LinearLayout.class);
    view7f08069f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.tv_description_wai = Utils.findRequiredViewAsType(source, R.id.tv_description_wai, "field 'tv_description_wai'", TextView.class);
    target.v_description_wai = Utils.findRequiredView(source, R.id.v_description_wai, "field 'v_description_wai'");
    view = Utils.findRequiredView(source, R.id.ll_comment_wai, "field 'll_comment_wai' and method 'setOnClick'");
    target.ll_comment_wai = Utils.castView(view, R.id.ll_comment_wai, "field 'll_comment_wai'", LinearLayout.class);
    view7f080699 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.tv_comment_wai = Utils.findRequiredViewAsType(source, R.id.tv_comment_wai, "field 'tv_comment_wai'", TextView.class);
    target.v_comment_wai = Utils.findRequiredView(source, R.id.v_comment_wai, "field 'v_comment_wai'");
    view = Utils.findRequiredView(source, R.id.ll_description, "field 'll_description' and method 'setOnClick'");
    target.ll_description = Utils.castView(view, R.id.ll_description, "field 'll_description'", LinearLayout.class);
    view7f08069d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.tv_description = Utils.findRequiredViewAsType(source, R.id.tv_description, "field 'tv_description'", TextView.class);
    target.v_description = Utils.findRequiredView(source, R.id.v_description, "field 'v_description'");
    view = Utils.findRequiredView(source, R.id.ll_comment, "field 'll_comment' and method 'setOnClick'");
    target.ll_comment = Utils.castView(view, R.id.ll_comment, "field 'll_comment'", LinearLayout.class);
    view7f080696 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.tv_comment = Utils.findRequiredViewAsType(source, R.id.tv_comment, "field 'tv_comment'", TextView.class);
    target.v_comment = Utils.findRequiredView(source, R.id.v_comment, "field 'v_comment'");
    target.ll_description_content = Utils.findRequiredViewAsType(source, R.id.ll_description_content, "field 'll_description_content'", LinearLayout.class);
    target.ll_comment_content = Utils.findRequiredViewAsType(source, R.id.ll_comment_content, "field 'll_comment_content'", LinearLayout.class);
    target.ll_label = Utils.findRequiredViewAsType(source, R.id.ll_label, "field 'll_label'", LinearLayout.class);
    target.tagfl = Utils.findRequiredViewAsType(source, R.id.tagfl, "field 'tagfl'", TagFlowLayout.class);
    target.ll_comments = Utils.findRequiredViewAsType(source, R.id.ll_comments, "field 'll_comments'", LinearLayout.class);
    target.ll_comment_group = Utils.findRequiredViewAsType(source, R.id.ll_comment_group, "field 'll_comment_group'", LinearLayout.class);
    target.noComment = Utils.findRequiredViewAsType(source, R.id.noComment, "field 'noComment'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.write_comment, "field 'write_comment' and method 'setOnClick'");
    target.write_comment = Utils.castView(view, R.id.write_comment, "field 'write_comment'", ImageView.class);
    view7f080998 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_chapters, "field 'll_chapters' and method 'setOnClick'");
    target.ll_chapters = Utils.castView(view, R.id.ll_chapters, "field 'll_chapters'", LinearLayout.class);
    view7f080695 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.chapter_num = Utils.findRequiredViewAsType(source, R.id.chapter_num, "field 'chapter_num'", TextView.class);
    target.book_state_chapter = Utils.findRequiredViewAsType(source, R.id.book_state_chapter, "field 'book_state_chapter'", TextView.class);
    target.recomment_cover = Utils.findRequiredViewAsType(source, R.id.recomment_cover, "field 'recomment_cover'", ImageView.class);
    target.book_name = Utils.findRequiredViewAsType(source, R.id.book_name, "field 'book_name'", TextView.class);
    target.book_other = Utils.findRequiredViewAsType(source, R.id.book_other, "field 'book_other'", TextView.class);
    target.book_info = Utils.findRequiredViewAsType(source, R.id.book_info, "field 'book_info'", TextView.class);
    target.read_num = Utils.findRequiredViewAsType(source, R.id.read_num, "field 'read_num'", TextView.class);
    target.book_author = Utils.findRequiredViewAsType(source, R.id.book_author, "field 'book_author'", TextView.class);
    target.tv_name_recommend = Utils.findRequiredViewAsType(source, R.id.tv_name_recommend, "field 'tv_name_recommend'", TextView.class);
    target.rcv_content = Utils.findRequiredViewAsType(source, R.id.rcv_content, "field 'rcv_content'", RecyclerView.class);
    target.ll_reconmend_list = Utils.findRequiredViewAsType(source, R.id.ll_reconmend_list, "field 'll_reconmend_list'", LinearLayout.class);
    target.rl_upload = Utils.findRequiredViewAsType(source, R.id.rl_upload, "field 'rl_upload'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.more_recommend, "field 'more_recommend' and method 'setOnClick'");
    target.more_recommend = Utils.castView(view, R.id.more_recommend, "field 'more_recommend'", LinearLayout.class);
    view7f0806ff = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_white_comment, "field 'll_white_comment' and method 'setOnClick'");
    target.ll_white_comment = Utils.castView(view, R.id.ll_white_comment, "field 'll_white_comment'", LinearLayout.class);
    view7f0806c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.ll_white_comment_in = Utils.findRequiredViewAsType(source, R.id.ll_white_comment_in, "field 'll_white_comment_in'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_close, "field 'iv_close' and method 'setOnClick'");
    target.iv_close = Utils.castView(view, R.id.iv_close, "field 'iv_close'", ImageView.class);
    view7f080213 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_commit, "field 'tv_commit' and method 'setOnClick'");
    target.tv_commit = Utils.castView(view, R.id.tv_commit, "field 'tv_commit'", TextView.class);
    view7f0808fb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.opreview_ratingbar_comment = Utils.findRequiredViewAsType(source, R.id.opreview_ratingbar_comment, "field 'opreview_ratingbar_comment'", NiceRatingBar.class);
    target.edit_comment = Utils.findRequiredViewAsType(source, R.id.edit_comment, "field 'edit_comment'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ll_all, "field 'll_all' and method 'setOnClick'");
    target.ll_all = Utils.castView(view, R.id.ll_all, "field 'll_all'", LinearLayout.class);
    view7f080683 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.ll_catalog = Utils.findRequiredViewAsType(source, R.id.ll_catalog, "field 'll_catalog'", LinearLayout.class);
    target.chpater_counts = Utils.findRequiredViewAsType(source, R.id.chpater_counts, "field 'chpater_counts'", TextView.class);
    target.chpater_status = Utils.findRequiredViewAsType(source, R.id.chpater_status, "field 'chpater_status'", TextView.class);
    view = Utils.findRequiredView(source, R.id.chpater_order, "field 'chpater_order' and method 'setOnClick'");
    target.chpater_order = Utils.castView(view, R.id.chpater_order, "field 'chpater_order'", ImageView.class);
    view7f0800d3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.chpater_recyclerView = Utils.findRequiredViewAsType(source, R.id.chpater_recyclerView, "field 'chpater_recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.iv_report, "field 'mImgReport' and method 'setOnClick'");
    target.mImgReport = Utils.castView(view, R.id.iv_report, "field 'mImgReport'", ImageView.class);
    view7f080232 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.author_refresh, "method 'setOnClick'");
    view7f080062 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_item, "method 'setOnClick'");
    view7f0806a8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.moreComment, "method 'setOnClick'");
    view7f0806fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_close_chapter, "method 'setOnClick'");
    view7f0807c5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WorkDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl = null;
    target.book_detail_discount = null;
    target.book_detail_author = null;
    target.ll_start_read = null;
    target.rl_tibar = null;
    target.book_title = null;
    target.iv_back = null;
    target.iv_share = null;
    target.btn_state = null;
    target.book_detail_follow = null;
    target.book_detail_read = null;
    target.book_detail_reward = null;
    target.mScrollView = null;
    target.mCover = null;
    target.description = null;
    target.essay_logo = null;
    target.descriptions = null;
    target.opreview_ratingbar = null;
    target.mClickCount = null;
    target.do_bookcase = null;
    target.mStartRead = null;
    target.ll_nei_content = null;
    target.ll_type = null;
    target.ll_description_wai = null;
    target.tv_description_wai = null;
    target.v_description_wai = null;
    target.ll_comment_wai = null;
    target.tv_comment_wai = null;
    target.v_comment_wai = null;
    target.ll_description = null;
    target.tv_description = null;
    target.v_description = null;
    target.ll_comment = null;
    target.tv_comment = null;
    target.v_comment = null;
    target.ll_description_content = null;
    target.ll_comment_content = null;
    target.ll_label = null;
    target.tagfl = null;
    target.ll_comments = null;
    target.ll_comment_group = null;
    target.noComment = null;
    target.write_comment = null;
    target.ll_chapters = null;
    target.chapter_num = null;
    target.book_state_chapter = null;
    target.recomment_cover = null;
    target.book_name = null;
    target.book_other = null;
    target.book_info = null;
    target.read_num = null;
    target.book_author = null;
    target.tv_name_recommend = null;
    target.rcv_content = null;
    target.ll_reconmend_list = null;
    target.rl_upload = null;
    target.more_recommend = null;
    target.ll_white_comment = null;
    target.ll_white_comment_in = null;
    target.iv_close = null;
    target.tv_commit = null;
    target.opreview_ratingbar_comment = null;
    target.edit_comment = null;
    target.ll_all = null;
    target.ll_catalog = null;
    target.chpater_counts = null;
    target.chpater_status = null;
    target.chpater_order = null;
    target.chpater_recyclerView = null;
    target.mImgReport = null;

    view7f0807d2.setOnClickListener(null);
    view7f0807d2 = null;
    view7f080235.setOnClickListener(null);
    view7f080235 = null;
    view7f080745.setOnClickListener(null);
    view7f080745 = null;
    view7f08013f.setOnClickListener(null);
    view7f08013f = null;
    view7f08084f.setOnClickListener(null);
    view7f08084f = null;
    view7f08069f.setOnClickListener(null);
    view7f08069f = null;
    view7f080699.setOnClickListener(null);
    view7f080699 = null;
    view7f08069d.setOnClickListener(null);
    view7f08069d = null;
    view7f080696.setOnClickListener(null);
    view7f080696 = null;
    view7f080998.setOnClickListener(null);
    view7f080998 = null;
    view7f080695.setOnClickListener(null);
    view7f080695 = null;
    view7f0806ff.setOnClickListener(null);
    view7f0806ff = null;
    view7f0806c0.setOnClickListener(null);
    view7f0806c0 = null;
    view7f080213.setOnClickListener(null);
    view7f080213 = null;
    view7f0808fb.setOnClickListener(null);
    view7f0808fb = null;
    view7f080683.setOnClickListener(null);
    view7f080683 = null;
    view7f0800d3.setOnClickListener(null);
    view7f0800d3 = null;
    view7f080232.setOnClickListener(null);
    view7f080232 = null;
    view7f080062.setOnClickListener(null);
    view7f080062 = null;
    view7f0806a8.setOnClickListener(null);
    view7f0806a8 = null;
    view7f0806fe.setOnClickListener(null);
    view7f0806fe = null;
    view7f0807c5.setOnClickListener(null);
    view7f0807c5 = null;
  }
}
