// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.ui.read;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.booktopup.MarqueeView;
import com.bytedance.club.ui.read.view.readpage.PageView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReadActivity_ViewBinding implements Unbinder {
  private ReadActivity target;

  private View view7f08020b;

  private View view7f080099;

  private View view7f080209;

  private View view7f08017e;

  private View view7f080683;

  private View view7f0807ce;

  private View view7f0801df;

  private View view7f0807d0;

  private View view7f080067;

  private View view7f080852;

  private View view7f080097;

  private View view7f08008a;

  private View view7f080181;

  private View view7f0800b6;

  private View view7f080690;

  private View view7f080165;

  private View view7f080694;

  private View view7f0807c5;

  private View view7f0806b7;

  private View view7f080696;

  private View view7f0806b1;

  private View view7f08020a;

  @UiThread
  public ReadActivity_ViewBinding(ReadActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReadActivity_ViewBinding(final ReadActivity target, View source) {
    this.target = target;

    View view;
    target.mReadToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mReadToolbar'", Toolbar.class);
    target.mDlSlide = Utils.findRequiredViewAsType(source, R.id.read_dl_slide, "field 'mDlSlide'", DrawerLayout.class);
    target.mPvPage = Utils.findRequiredViewAsType(source, R.id.read_pv_page, "field 'mPvPage'", PageView.class);
    target.mAblTopMenu = Utils.findRequiredViewAsType(source, R.id.read_abl_top_menu, "field 'mAblTopMenu'", AppBarLayout.class);
    target.ck_down = Utils.findRequiredViewAsType(source, R.id.ck_down, "field 'ck_down'", CheckBox.class);
    target.ck_more = Utils.findRequiredViewAsType(source, R.id.ck_more, "field 'ck_more'", CheckBox.class);
    target.mLlBottomMenu = Utils.findRequiredViewAsType(source, R.id.read_ll_bottom_menu, "field 'mLlBottomMenu'", LinearLayout.class);
    target.rl_clickToDismiss = Utils.findRequiredViewAsType(source, R.id.rl_clickToDismiss, "field 'rl_clickToDismiss'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_add_shelf_read, "field 'iv_add_shelf_read' and method 'setOnClick'");
    target.iv_add_shelf_read = Utils.castView(view, R.id.iv_add_shelf_read, "field 'iv_add_shelf_read'", ImageView.class);
    view7f08020b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.mNightModeCheckBox = Utils.findRequiredViewAsType(source, R.id.nightModeCheckBox, "field 'mNightModeCheckBox'", ImageView.class);
    target.catalogOpen = Utils.findRequiredViewAsType(source, R.id.catalogOpen, "field 'catalogOpen'", ImageView.class);
    target.readSettings = Utils.findRequiredViewAsType(source, R.id.readSettings, "field 'readSettings'", ImageView.class);
    target.iv_comment = Utils.findRequiredViewAsType(source, R.id.iv_comment, "field 'iv_comment'", ImageView.class);
    target.mTvPreChapter = Utils.findRequiredViewAsType(source, R.id.read_tv_pre_chapter, "field 'mTvPreChapter'", TextView.class);
    target.mSbChapterProgress = Utils.findRequiredViewAsType(source, R.id.read_sb_chapter_progress, "field 'mSbChapterProgress'", SeekBar.class);
    target.mTvNextChapter = Utils.findRequiredViewAsType(source, R.id.read_tv_next_chapter, "field 'mTvNextChapter'", TextView.class);
    view = Utils.findRequiredView(source, R.id.book_update_cb, "field 'book_update_cb' and method 'setOnClick'");
    target.book_update_cb = Utils.castView(view, R.id.book_update_cb, "field 'book_update_cb'", CheckBox.class);
    view7f080099 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.is_add_shelf = Utils.findRequiredViewAsType(source, R.id.is_add_shelf, "field 'is_add_shelf'", LinearLayout.class);
    target.iv_small_cover = Utils.findRequiredViewAsType(source, R.id.iv_small_cover, "field 'iv_small_cover'", ImageView.class);
    target.tv_add_shelf = Utils.findRequiredViewAsType(source, R.id.tv_add_shelf, "field 'tv_add_shelf'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_add_shelf, "field 'iv_add_shelf' and method 'setOnClick'");
    target.iv_add_shelf = Utils.castView(view, R.id.iv_add_shelf, "field 'iv_add_shelf'", ImageView.class);
    view7f080209 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.mCommentTag = Utils.findRequiredViewAsType(source, R.id.commentTag, "field 'mCommentTag'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fl_bulk_buy, "field 'fl_bulk_buy' and method 'setOnClick'");
    target.fl_bulk_buy = Utils.castView(view, R.id.fl_bulk_buy, "field 'fl_bulk_buy'", RelativeLayout.class);
    view7f08017e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
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
    target.mHeader = Utils.findRequiredViewAsType(source, R.id.header, "field 'mHeader'", LinearLayout.class);
    target.v_line = Utils.findRequiredView(source, R.id.v_line, "field 'v_line'");
    target.mStatus = Utils.findRequiredViewAsType(source, R.id.status, "field 'mStatus'", TextView.class);
    target.mCounts = Utils.findRequiredViewAsType(source, R.id.counts, "field 'mCounts'", TextView.class);
    target.mOrder = Utils.findRequiredViewAsType(source, R.id.order, "field 'mOrder'", ImageView.class);
    target.book_cover_detail = Utils.findRequiredViewAsType(source, R.id.book_cover_detail, "field 'book_cover_detail'", ImageView.class);
    target.book_name_chapter = Utils.findRequiredViewAsType(source, R.id.book_name_chapter, "field 'book_name_chapter'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.rl_menu, "field 'rl_menu' and method 'setOnClick'");
    target.rl_menu = Utils.castView(view, R.id.rl_menu, "field 'rl_menu'", RelativeLayout.class);
    view7f0807ce = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.ll_menu = Utils.findRequiredViewAsType(source, R.id.ll_menu, "field 'll_menu'", LinearLayout.class);
    target.book_title = Utils.findRequiredViewAsType(source, R.id.book_title, "field 'book_title'", MarqueeView.class);
    target.book_cover = Utils.findRequiredViewAsType(source, R.id.book_cover, "field 'book_cover'", ImageView.class);
    target.book_name = Utils.findRequiredViewAsType(source, R.id.book_name, "field 'book_name'", TextView.class);
    target.book_state = Utils.findRequiredViewAsType(source, R.id.book_state, "field 'book_state'", TextView.class);
    target.book_chapter = Utils.findRequiredViewAsType(source, R.id.book_chapter, "field 'book_chapter'", TextView.class);
    view = Utils.findRequiredView(source, R.id.img_back, "field 'img_back' and method 'setOnClick'");
    target.img_back = Utils.castView(view, R.id.img_back, "field 'img_back'", ImageView.class);
    view7f0801df = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_more, "field 'rl_more' and method 'setOnClick'");
    target.rl_more = Utils.castView(view, R.id.rl_more, "field 'rl_more'", RelativeLayout.class);
    view7f0807d0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.ll_more_buy = Utils.findRequiredViewAsType(source, R.id.ll_more_buy, "field 'll_more_buy'", LinearLayout.class);
    target.current_chapter = Utils.findRequiredViewAsType(source, R.id.current_chapter, "field 'current_chapter'", TextView.class);
    view = Utils.findRequiredView(source, R.id.auto_lock_cb, "field 'auto_lock_cb' and method 'setOnClick'");
    target.auto_lock_cb = Utils.castView(view, R.id.auto_lock_cb, "field 'auto_lock_cb'", CheckBox.class);
    view7f080067 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.buy_more_coins = Utils.findRequiredViewAsType(source, R.id.buy_more_coins, "field 'buy_more_coins'", TextView.class);
    target.tv_coupons = Utils.findRequiredViewAsType(source, R.id.tv_coupons, "field 'tv_coupons'", TextView.class);
    target.recyclerView_more = Utils.findRequiredViewAsType(source, R.id.recyclerView_more, "field 'recyclerView_more'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.start_buy, "field 'start_buy' and method 'setOnClick'");
    target.start_buy = Utils.castView(view, R.id.start_buy, "field 'start_buy'", TextView.class);
    view7f080852 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    target.flBanner = Utils.findRequiredViewAsType(source, R.id.fl_banner, "field 'flBanner'", FrameLayout.class);
    target.tipsUnclockLayout = Utils.findRequiredViewAsType(source, R.id.tips_unclock, "field 'tipsUnclockLayout'", LinearLayout.class);
    target.newUserTipsLayout = Utils.findRequiredView(source, R.id.tips_read, "field 'newUserTipsLayout'");
    target.newUserUnlockTipsLayout = Utils.findRequiredView(source, R.id.tips_read_unclock, "field 'newUserUnlockTipsLayout'");
    view = Utils.findRequiredView(source, R.id.book_this_detail, "method 'setOnClick'");
    view7f080097 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.book_detail, "method 'setOnClick'");
    view7f08008a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.fl_feedback, "method 'setOnClick'");
    view7f080181 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cancel_setting, "method 'setOnClick'");
    view7f0800b6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_book_report, "method 'setOnClick'");
    view7f080690 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.facebook_share, "method 'setOnClick'");
    view7f080165 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_catalogOpen, "method 'setOnClick'");
    view7f080694 = view;
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
    view = Utils.findRequiredView(source, R.id.ll_readSettings, "method 'setOnClick'");
    view7f0806b7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_comment, "method 'setOnClick'");
    view7f080696 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_nightModeCheckBox, "method 'setOnClick'");
    view7f0806b1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setOnClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_add_shelf_cancel, "method 'setOnClick'");
    view7f08020a = view;
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
    ReadActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mReadToolbar = null;
    target.mDlSlide = null;
    target.mPvPage = null;
    target.mAblTopMenu = null;
    target.ck_down = null;
    target.ck_more = null;
    target.mLlBottomMenu = null;
    target.rl_clickToDismiss = null;
    target.iv_add_shelf_read = null;
    target.mNightModeCheckBox = null;
    target.catalogOpen = null;
    target.readSettings = null;
    target.iv_comment = null;
    target.mTvPreChapter = null;
    target.mSbChapterProgress = null;
    target.mTvNextChapter = null;
    target.book_update_cb = null;
    target.is_add_shelf = null;
    target.iv_small_cover = null;
    target.tv_add_shelf = null;
    target.iv_add_shelf = null;
    target.mCommentTag = null;
    target.fl_bulk_buy = null;
    target.ll_all = null;
    target.ll_catalog = null;
    target.mHeader = null;
    target.v_line = null;
    target.mStatus = null;
    target.mCounts = null;
    target.mOrder = null;
    target.book_cover_detail = null;
    target.book_name_chapter = null;
    target.mRecyclerView = null;
    target.rl_menu = null;
    target.ll_menu = null;
    target.book_title = null;
    target.book_cover = null;
    target.book_name = null;
    target.book_state = null;
    target.book_chapter = null;
    target.img_back = null;
    target.rl_more = null;
    target.ll_more_buy = null;
    target.current_chapter = null;
    target.auto_lock_cb = null;
    target.buy_more_coins = null;
    target.tv_coupons = null;
    target.recyclerView_more = null;
    target.start_buy = null;
    target.flBanner = null;
    target.tipsUnclockLayout = null;
    target.newUserTipsLayout = null;
    target.newUserUnlockTipsLayout = null;

    view7f08020b.setOnClickListener(null);
    view7f08020b = null;
    view7f080099.setOnClickListener(null);
    view7f080099 = null;
    view7f080209.setOnClickListener(null);
    view7f080209 = null;
    view7f08017e.setOnClickListener(null);
    view7f08017e = null;
    view7f080683.setOnClickListener(null);
    view7f080683 = null;
    view7f0807ce.setOnClickListener(null);
    view7f0807ce = null;
    view7f0801df.setOnClickListener(null);
    view7f0801df = null;
    view7f0807d0.setOnClickListener(null);
    view7f0807d0 = null;
    view7f080067.setOnClickListener(null);
    view7f080067 = null;
    view7f080852.setOnClickListener(null);
    view7f080852 = null;
    view7f080097.setOnClickListener(null);
    view7f080097 = null;
    view7f08008a.setOnClickListener(null);
    view7f08008a = null;
    view7f080181.setOnClickListener(null);
    view7f080181 = null;
    view7f0800b6.setOnClickListener(null);
    view7f0800b6 = null;
    view7f080690.setOnClickListener(null);
    view7f080690 = null;
    view7f080165.setOnClickListener(null);
    view7f080165 = null;
    view7f080694.setOnClickListener(null);
    view7f080694 = null;
    view7f0807c5.setOnClickListener(null);
    view7f0807c5 = null;
    view7f0806b7.setOnClickListener(null);
    view7f0806b7 = null;
    view7f080696.setOnClickListener(null);
    view7f080696 = null;
    view7f0806b1.setOnClickListener(null);
    view7f0806b1 = null;
    view7f08020a.setOnClickListener(null);
    view7f08020a = null;
  }
}
