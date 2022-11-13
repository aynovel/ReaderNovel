// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookmessage.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MessageDetailActivity_ViewBinding implements Unbinder {
  private MessageDetailActivity target;

  private View view7f0801ea;

  private View view7f0801e8;

  @UiThread
  public MessageDetailActivity_ViewBinding(MessageDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MessageDetailActivity_ViewBinding(final MessageDetailActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mLayoutSent = Utils.findRequiredViewAsType(source, R.id.layout_sent, "field 'mLayoutSent'", LinearLayout.class);
    target.mEtSentInfo = Utils.findRequiredViewAsType(source, R.id.et_sent_info, "field 'mEtSentInfo'", EditText.class);
    view = Utils.findRequiredView(source, R.id.img_send, "field 'mImgSend' and method 'onSend'");
    target.mImgSend = Utils.castView(view, R.id.img_send, "field 'mImgSend'", ImageView.class);
    view7f0801ea = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSend();
      }
    });
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
    view = Utils.findRequiredView(source, R.id.img_photo, "method 'onChoosePhoto'");
    view7f0801e8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onChoosePhoto();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MessageDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mLayoutSent = null;
    target.mEtSentInfo = null;
    target.mImgSend = null;
    target.mNoneView = null;

    view7f0801ea.setOnClickListener(null);
    view7f0801ea = null;
    view7f0801e8.setOnClickListener(null);
    view7f0801e8 = null;
  }
}
