// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.classification;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ClassifyDetailActivity_ViewBinding implements Unbinder {
  private ClassifyDetailActivity target;

  private View view7f0807b0;

  private View view7f0800fc;

  @UiThread
  public ClassifyDetailActivity_ViewBinding(ClassifyDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ClassifyDetailActivity_ViewBinding(final ClassifyDetailActivity target, View source) {
    this.target = target;

    View view;
    target.mConditionRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mConditionRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.reset, "field 'mReset' and method 'onResetClick'");
    target.mReset = Utils.castView(view, R.id.reset, "field 'mReset'", TextView.class);
    view7f0807b0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onResetClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.complete, "field 'mComplete' and method 'onCompleteClick'");
    target.mComplete = Utils.castView(view, R.id.complete, "field 'mComplete'", TextView.class);
    view7f0800fc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCompleteClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ClassifyDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mConditionRecyclerView = null;
    target.mReset = null;
    target.mComplete = null;

    view7f0807b0.setOnClickListener(null);
    view7f0807b0 = null;
    view7f0800fc.setOnClickListener(null);
    view7f0800fc = null;
  }
}
