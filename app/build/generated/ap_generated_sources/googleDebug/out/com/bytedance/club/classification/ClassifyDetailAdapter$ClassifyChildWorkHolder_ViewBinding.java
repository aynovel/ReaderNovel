// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.classification;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ClassifyDetailAdapter$ClassifyChildWorkHolder_ViewBinding implements Unbinder {
  private ClassifyDetailAdapter.ClassifyChildWorkHolder target;

  @UiThread
  public ClassifyDetailAdapter$ClassifyChildWorkHolder_ViewBinding(
      ClassifyDetailAdapter.ClassifyChildWorkHolder target, View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.description, "field 'description'", TextView.class);
    target.author = Utils.findRequiredViewAsType(source, R.id.author, "field 'author'", TextView.class);
    target.classify = Utils.findRequiredViewAsType(source, R.id.classify, "field 'classify'", TextView.class);
    target.clickCount = Utils.findRequiredViewAsType(source, R.id.clickCount, "field 'clickCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ClassifyDetailAdapter.ClassifyChildWorkHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.title = null;
    target.description = null;
    target.author = null;
    target.classify = null;
    target.clickCount = null;
  }
}
