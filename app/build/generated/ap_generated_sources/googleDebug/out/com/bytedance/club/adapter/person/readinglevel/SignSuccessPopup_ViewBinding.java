// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.readinglevel;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignSuccessPopup_ViewBinding implements Unbinder {
  private SignSuccessPopup target;

  private View view7f08013e;

  @UiThread
  public SignSuccessPopup_ViewBinding(final SignSuccessPopup target, View source) {
    this.target = target;

    View view;
    target.mReward = Utils.findRequiredViewAsType(source, R.id.reward, "field 'mReward'", TextView.class);
    target.mSignDays = Utils.findRequiredViewAsType(source, R.id.signDays, "field 'mSignDays'", TextView.class);
    target.mNextReward = Utils.findRequiredViewAsType(source, R.id.nextReward, "field 'mNextReward'", TextView.class);
    view = Utils.findRequiredView(source, R.id.doTask, "method 'onDoTaskClick'");
    view7f08013e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDoTaskClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SignSuccessPopup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mReward = null;
    target.mSignDays = null;
    target.mNextReward = null;

    view7f08013e.setOnClickListener(null);
    view7f08013e = null;
  }
}
