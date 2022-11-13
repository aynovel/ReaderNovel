// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.comments;

import android.view.View;
import android.widget.ImageView;
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

public class BookDetailDirectoryFragment_ViewBinding implements Unbinder {
  private BookDetailDirectoryFragment target;

  private View view7f080747;

  @UiThread
  public BookDetailDirectoryFragment_ViewBinding(final BookDetailDirectoryFragment target,
      View source) {
    this.target = target;

    View view;
    target.mStatus = Utils.findRequiredViewAsType(source, R.id.status, "field 'mStatus'", TextView.class);
    target.mCounts = Utils.findRequiredViewAsType(source, R.id.counts, "field 'mCounts'", TextView.class);
    view = Utils.findRequiredView(source, R.id.order, "field 'mOrder' and method 'onOrderClick'");
    target.mOrder = Utils.castView(view, R.id.order, "field 'mOrder'", ImageView.class);
    view7f080747 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOrderClick();
      }
    });
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BookDetailDirectoryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatus = null;
    target.mCounts = null;
    target.mOrder = null;
    target.mRecyclerView = null;

    view7f080747.setOnClickListener(null);
    view7f080747 = null;
  }
}
