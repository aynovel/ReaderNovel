// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.adapter.person.personcenter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class JoinUsActivity_ViewBinding implements Unbinder {
  private JoinUsActivity target;

  @UiThread
  public JoinUsActivity_ViewBinding(JoinUsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public JoinUsActivity_ViewBinding(JoinUsActivity target, View source) {
    this.target = target;

    target.mVersion = Utils.findRequiredViewAsType(source, R.id.version, "field 'mVersion'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    JoinUsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mVersion = null;
  }
}
