// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.taskcenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.RadiusImageView;
import com.bytedance.club.publics.weight.ReadTipView;
import com.bytedance.club.publics.weight.TaskCheckBox;
import com.bytedance.club.publics.weight.TaskScrollView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TaskCenterActivity_ViewBinding implements Unbinder {
  private TaskCenterActivity target;

  private View view7f0801c4;

  private View view7f0801d5;

  private View view7f0800be;

  private View view7f0808c1;

  @UiThread
  public TaskCenterActivity_ViewBinding(TaskCenterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TaskCenterActivity_ViewBinding(final TaskCenterActivity target, View source) {
    this.target = target;

    View view;
    target.mSignRecyclerView = Utils.findRequiredViewAsType(source, R.id.signRecyclerView, "field 'mSignRecyclerView'", RecyclerView.class);
    target.mNewRecyclerView = Utils.findRequiredViewAsType(source, R.id.newRecyclerView, "field 'mNewRecyclerView'", RecyclerView.class);
    target.mDailyRecyclerView = Utils.findRequiredViewAsType(source, R.id.dailyRecyclerView, "field 'mDailyRecyclerView'", RecyclerView.class);
    target.mImgStatusbar = Utils.findRequiredViewAsType(source, R.id.imgStatusbar, "field 'mImgStatusbar'", ImageView.class);
    target.mImgHead = Utils.findRequiredViewAsType(source, R.id.imgHead, "field 'mImgHead'", RadiusImageView.class);
    target.mNsRootView = Utils.findRequiredViewAsType(source, R.id.nsRootView, "field 'mNsRootView'", TaskScrollView.class);
    target.mTvTitle = Utils.findRequiredViewAsType(source, R.id.tvTitle, "field 'mTvTitle'", TextView.class);
    target.mImgTitleView = Utils.findRequiredViewAsType(source, R.id.imgTitleView, "field 'mImgTitleView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.imgBack, "field 'mImgBack' and method 'onClick'");
    target.mImgBack = Utils.castView(view, R.id.imgBack, "field 'mImgBack'", ImageView.class);
    view7f0801c4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.imgMask, "field 'mImgMask' and method 'onClick'");
    target.mImgMask = Utils.castView(view, R.id.imgMask, "field 'mImgMask'", ImageView.class);
    view7f0801d5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cbCardRemind, "field 'mCbCardRemind' and method 'onClick'");
    target.mCbCardRemind = Utils.castView(view, R.id.cbCardRemind, "field 'mCbCardRemind'", TaskCheckBox.class);
    view7f0800be = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mTvRemainTip = Utils.findRequiredViewAsType(source, R.id.tvRemainTip, "field 'mTvRemainTip'", TextView.class);
    target.mTvCardTitle = Utils.findRequiredViewAsType(source, R.id.tvCardTitle, "field 'mTvCardTitle'", TextView.class);
    target.mTvBonusNum = Utils.findRequiredViewAsType(source, R.id.tvBonusNum, "field 'mTvBonusNum'", TextView.class);
    target.mReadTipView = Utils.findRequiredViewAsType(source, R.id.readTipView, "field 'mReadTipView'", ReadTipView.class);
    target.mCardNewView = Utils.findRequiredViewAsType(source, R.id.cardNew, "field 'mCardNewView'", CardView.class);
    target.mTvDailyTitle = Utils.findRequiredViewAsType(source, R.id.tvDailyTitle, "field 'mTvDailyTitle'", TextView.class);
    target.mTvNewTitle = Utils.findRequiredViewAsType(source, R.id.tvNewTitle, "field 'mTvNewTitle'", TextView.class);
    target.mTvReadContent = Utils.findRequiredViewAsType(source, R.id.tvReadContent, "field 'mTvReadContent'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tvDetail, "method 'onClick'");
    view7f0808c1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TaskCenterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSignRecyclerView = null;
    target.mNewRecyclerView = null;
    target.mDailyRecyclerView = null;
    target.mImgStatusbar = null;
    target.mImgHead = null;
    target.mNsRootView = null;
    target.mTvTitle = null;
    target.mImgTitleView = null;
    target.mImgBack = null;
    target.mImgMask = null;
    target.mCbCardRemind = null;
    target.mTvRemainTip = null;
    target.mTvCardTitle = null;
    target.mTvBonusNum = null;
    target.mReadTipView = null;
    target.mCardNewView = null;
    target.mTvDailyTitle = null;
    target.mTvNewTitle = null;
    target.mTvReadContent = null;

    view7f0801c4.setOnClickListener(null);
    view7f0801c4 = null;
    view7f0801d5.setOnClickListener(null);
    view7f0801d5 = null;
    view7f0800be.setOnClickListener(null);
    view7f0800be = null;
    view7f0808c1.setOnClickListener(null);
    view7f0808c1 = null;
  }
}
