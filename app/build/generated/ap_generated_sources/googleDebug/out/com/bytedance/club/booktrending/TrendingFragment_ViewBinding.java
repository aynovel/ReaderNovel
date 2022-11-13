// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.booktrending;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.FeaturedRefreshHeaderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TrendingFragment_ViewBinding implements Unbinder {
  private TrendingFragment target;

  @UiThread
  public TrendingFragment_ViewBinding(TrendingFragment target, View source) {
    this.target = target;

    target.mRefreshHeader = Utils.findRequiredViewAsType(source, R.id.refreshHeader, "field 'mRefreshHeader'", FeaturedRefreshHeaderView.class);
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    TrendingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRefreshHeader = null;
    target.mNoneView = null;
  }
}
