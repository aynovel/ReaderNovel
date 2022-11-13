// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.booktopup;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.viewweb.Wei1;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TopUpActivity_ViewBinding implements Unbinder {
  private TopUpActivity target;

  private View view7f080658;

  private View view7f080213;

  private View view7f080931;

  private View view7f080947;

  private View view7f080946;

  @UiThread
  public TopUpActivity_ViewBinding(TopUpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TopUpActivity_ViewBinding(final TopUpActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mLayoutInfo = Utils.findRequiredViewAsType(source, R.id.layout_info, "field 'mLayoutInfo'", LinearLayout.class);
    target.ll_all_close = Utils.findRequiredViewAsType(source, R.id.ll_all_close, "field 'll_all_close'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.layout_pay_methed, "field 'layout_pay_methed' and method 'layoutPayClick'");
    target.layout_pay_methed = Utils.castView(view, R.id.layout_pay_methed, "field 'layout_pay_methed'", RelativeLayout.class);
    view7f080658 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.layoutPayClick();
      }
    });
    target.ll_pay_mothed = Utils.findRequiredViewAsType(source, R.id.ll_pay_mothed, "field 'll_pay_mothed'", LinearLayout.class);
    target.webview = Utils.findRequiredViewAsType(source, R.id.webview, "field 'webview'", Wei1.class);
    target.webview1 = Utils.findRequiredViewAsType(source, R.id.webview1, "field 'webview1'", Wei1.class);
    view = Utils.findRequiredView(source, R.id.iv_close, "field 'iv_close' and method 'close'");
    target.iv_close = Utils.castView(view, R.id.iv_close, "field 'iv_close'", ImageView.class);
    view7f080213 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.close();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_restore, "method 'restoreClick' and method 'reCheckOrder'");
    view7f080931 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.restoreClick();
        target.reCheckOrder();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_top_help, "method 'TopHelpClick'");
    view7f080947 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.TopHelpClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_top_feedback, "method 'TopFeedBackClick'");
    view7f080946 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.TopFeedBackClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TopUpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mLayoutInfo = null;
    target.ll_all_close = null;
    target.layout_pay_methed = null;
    target.ll_pay_mothed = null;
    target.webview = null;
    target.webview1 = null;
    target.iv_close = null;

    view7f080658.setOnClickListener(null);
    view7f080658 = null;
    view7f080213.setOnClickListener(null);
    view7f080213 = null;
    view7f080931.setOnClickListener(null);
    view7f080931 = null;
    view7f080947.setOnClickListener(null);
    view7f080947 = null;
    view7f080946.setOnClickListener(null);
    view7f080946 = null;
  }
}
