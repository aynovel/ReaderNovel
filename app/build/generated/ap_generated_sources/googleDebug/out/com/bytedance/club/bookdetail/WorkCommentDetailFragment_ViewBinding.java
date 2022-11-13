// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.text.Editable;
import android.text.TextWatcher;
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
import com.bytedance.club.publics.fresh.LoadFooterView;
import com.bytedance.club.publics.fresh.RefreshHeaderView;
import com.bytedance.club.publics.fresh.weight.PullRefreshLayout;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WorkCommentDetailFragment_ViewBinding implements Unbinder {
  private WorkCommentDetailFragment target;

  private View view7f08014e;

  private TextWatcher view7f08014eTextWatcher;

  private View view7f0807fe;

  @UiThread
  public WorkCommentDetailFragment_ViewBinding(final WorkCommentDetailFragment target,
      View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mRefreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'mRefreshLayout'", PullRefreshLayout.class);
    target.mRefreshHeader = Utils.findRequiredViewAsType(source, R.id.refreshHeader, "field 'mRefreshHeader'", RefreshHeaderView.class);
    target.mLoadFooter = Utils.findRequiredViewAsType(source, R.id.loadFooter, "field 'mLoadFooter'", LoadFooterView.class);
    view = Utils.findRequiredView(source, R.id.editText, "field 'mEditText' and method 'afterCommentEditChange'");
    target.mEditText = Utils.castView(view, R.id.editText, "field 'mEditText'", EditText.class);
    view7f08014e = view;
    view7f08014eTextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
        target.afterCommentEditChange(p0);
      }
    };
    ((TextView) view).addTextChangedListener(view7f08014eTextWatcher);
    view = Utils.findRequiredView(source, R.id.send, "field 'mSend' and method 'onSendClick'");
    target.mSend = Utils.castView(view, R.id.send, "field 'mSend'", TextView.class);
    view7f0807fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSendClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WorkCommentDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mRefreshLayout = null;
    target.mRefreshHeader = null;
    target.mLoadFooter = null;
    target.mEditText = null;
    target.mSend = null;

    ((TextView) view7f08014e).removeTextChangedListener(view7f08014eTextWatcher);
    view7f08014eTextWatcher = null;
    view7f08014e = null;
    view7f0807fe.setOnClickListener(null);
    view7f0807fe = null;
  }
}
