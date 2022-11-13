// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import android.widget.EditText;
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

public class ReportActivity_ViewBinding implements Unbinder {
  private ReportActivity target;

  private View view7f08016c;

  private View view7f080682;

  @UiThread
  public ReportActivity_ViewBinding(ReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReportActivity_ViewBinding(final ReportActivity target, View source) {
    this.target = target;

    View view;
    target.mEditText = Utils.findRequiredViewAsType(source, R.id.et_content, "field 'mEditText'", EditText.class);
    target.mWordCount = Utils.findRequiredViewAsType(source, R.id.id_font_count, "field 'mWordCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.feedback_send, "field 'feedback_send' and method 'onClick'");
    target.feedback_send = Utils.castView(view, R.id.feedback_send, "field 'feedback_send'", TextView.class);
    view7f08016c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mPhotoRecyclerview = Utils.findRequiredViewAsType(source, R.id.photoRecyclerview, "field 'mPhotoRecyclerview'", RecyclerView.class);
    target.mTvPhotoNum = Utils.findRequiredViewAsType(source, R.id.tvPhotoNum, "field 'mTvPhotoNum'", TextView.class);
    target.mTvType = Utils.findRequiredViewAsType(source, R.id.tvType, "field 'mTvType'", TextView.class);
    view = Utils.findRequiredView(source, R.id.llType, "method 'onClick'");
    view7f080682 = view;
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
    ReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEditText = null;
    target.mWordCount = null;
    target.feedback_send = null;
    target.mPhotoRecyclerview = null;
    target.mTvPhotoNum = null;
    target.mTvType = null;

    view7f08016c.setOnClickListener(null);
    view7f08016c = null;
    view7f080682.setOnClickListener(null);
    view7f080682 = null;
  }
}
