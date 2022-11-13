// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.TaskCheckBox;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PushUpdateManagerActivity_ViewBinding implements Unbinder {
  private PushUpdateManagerActivity target;

  private View view7f0801d5;

  private View view7f0800be;

  @UiThread
  public PushUpdateManagerActivity_ViewBinding(PushUpdateManagerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PushUpdateManagerActivity_ViewBinding(final PushUpdateManagerActivity target,
      View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
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
    target.mLlNotifyRootView = Utils.findRequiredViewAsType(source, R.id.ll_notify, "field 'mLlNotifyRootView'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PushUpdateManagerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mImgMask = null;
    target.mCbCardRemind = null;
    target.mLlNotifyRootView = null;

    view7f0801d5.setOnClickListener(null);
    view7f0801d5 = null;
    view7f0800be.setOnClickListener(null);
    view7f0800be = null;
  }
}
