// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.ui.other.dialog;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShowCommentPop_ViewBinding implements Unbinder {
  private ShowCommentPop target;

  @UiThread
  public ShowCommentPop_ViewBinding(ShowCommentPop target, View source) {
    this.target = target;

    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mListView = Utils.findRequiredViewAsType(source, R.id.listView, "field 'mListView'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowCommentPop target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRefreshLayout = null;
    target.mLoadFooter = null;
    target.mListView = null;
  }
}
