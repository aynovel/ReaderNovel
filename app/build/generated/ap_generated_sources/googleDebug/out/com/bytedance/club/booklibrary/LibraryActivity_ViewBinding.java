// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.booklibrary;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.RefreshHeaderView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LibraryActivity_ViewBinding implements Unbinder {
  private LibraryActivity target;

  @UiThread
  public LibraryActivity_ViewBinding(LibraryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LibraryActivity_ViewBinding(LibraryActivity target, View source) {
    this.target = target;

    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mRefreshHeader = Utils.findRequiredViewAsType(source, R.id.refreshHeader, "field 'mRefreshHeader'", RefreshHeaderView.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadfooter, "field 'mLoadFooter'", LoadFooterView.class);
    target.mGenderAll = Utils.findRequiredViewAsType(source, R.id.gender_all, "field 'mGenderAll'", TextView.class);
    target.mGenderMale = Utils.findRequiredViewAsType(source, R.id.gender_male, "field 'mGenderMale'", TextView.class);
    target.mGenderFemale = Utils.findRequiredViewAsType(source, R.id.gender_female, "field 'mGenderFemale'", TextView.class);
    target.mLmitAll = Utils.findRequiredViewAsType(source, R.id.limit_all, "field 'mLmitAll'", TextView.class);
    target.mLmitCharge = Utils.findRequiredViewAsType(source, R.id.limit_charge, "field 'mLmitCharge'", TextView.class);
    target.mLmitFree = Utils.findRequiredViewAsType(source, R.id.limit_free, "field 'mLmitFree'", TextView.class);
    target.mEndAll = Utils.findRequiredViewAsType(source, R.id.end_all, "field 'mEndAll'", TextView.class);
    target.mEndUncompleted = Utils.findRequiredViewAsType(source, R.id.end_uncompleted, "field 'mEndUncompleted'", TextView.class);
    target.mEndCompleted = Utils.findRequiredViewAsType(source, R.id.end_completed, "field 'mEndCompleted'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    LibraryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRefreshLayout = null;
    target.mRefreshHeader = null;
    target.mLoadFooter = null;
    target.mGenderAll = null;
    target.mGenderMale = null;
    target.mGenderFemale = null;
    target.mLmitAll = null;
    target.mLmitCharge = null;
    target.mLmitFree = null;
    target.mEndAll = null;
    target.mEndUncompleted = null;
    target.mEndCompleted = null;
    target.mRecyclerView = null;
    target.mNoneView = null;
  }
}
