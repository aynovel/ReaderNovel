// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AutoBuyManagerActivity_ViewBinding implements Unbinder {
  private AutoBuyManagerActivity target;

  private View view7f080743;

  private View view7f0800e4;

  @UiThread
  public AutoBuyManagerActivity_ViewBinding(AutoBuyManagerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AutoBuyManagerActivity_ViewBinding(final AutoBuyManagerActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.openAll, "field 'mOpenAll' and method 'OnOpenClick'");
    target.mOpenAll = view;
    view7f080743 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnOpenClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.closeAll, "field 'mCloseAll' and method 'OnCloseClick'");
    target.mCloseAll = view;
    view7f0800e4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnCloseClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AutoBuyManagerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mOpenAll = null;
    target.mCloseAll = null;

    view7f080743.setOnClickListener(null);
    view7f080743 = null;
    view7f0800e4.setOnClickListener(null);
    view7f0800e4 = null;
  }
}
