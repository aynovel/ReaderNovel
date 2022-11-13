// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.publics.weight;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class KOL_ViewBinding implements Unbinder {
  private KOL target;

  @UiThread
  public KOL_ViewBinding(KOL target) {
    this(target, target);
  }

  @UiThread
  public KOL_ViewBinding(KOL target, View source) {
    this.target = target;

    target.root = Utils.findRequiredView(source, R.id.root, "field 'root'");
    target.mItemIcon = Utils.findRequiredViewAsType(source, R.id.itemIcon, "field 'mItemIcon'", ImageView.class);
    target.mItemTitle = Utils.findRequiredViewAsType(source, R.id.itemTitle, "field 'mItemTitle'", TextView.class);
    target.mItemSubTitle = Utils.findRequiredViewAsType(source, R.id.itemSubTitle, "field 'mItemSubTitle'", TextView.class);
    target.mButton = Utils.findRequiredViewAsType(source, R.id.button, "field 'mButton'", TextView.class);
    target.mTipGroup = Utils.findRequiredViewAsType(source, R.id.tipGroup, "field 'mTipGroup'", LinearLayout.class);
    target.mTip = Utils.findRequiredViewAsType(source, R.id.tip, "field 'mTip'", TextView.class);
    target.mCheckBox = Utils.findRequiredViewAsType(source, R.id.checkBox, "field 'mCheckBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    KOL target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.root = null;
    target.mItemIcon = null;
    target.mItemTitle = null;
    target.mItemSubTitle = null;
    target.mButton = null;
    target.mTipGroup = null;
    target.mTip = null;
    target.mCheckBox = null;
  }
}
