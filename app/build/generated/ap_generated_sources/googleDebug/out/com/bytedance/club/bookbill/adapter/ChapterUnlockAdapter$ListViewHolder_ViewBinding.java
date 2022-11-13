// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookbill.adapter;

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

public class ChapterUnlockAdapter$ListViewHolder_ViewBinding implements Unbinder {
  private ChapterUnlockAdapter.ListViewHolder target;

  @UiThread
  public ChapterUnlockAdapter$ListViewHolder_ViewBinding(ChapterUnlockAdapter.ListViewHolder target,
      View source) {
    this.target = target;

    target.cover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'cover'", ImageView.class);
    target.mTvName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'mTvName'", TextView.class);
    target.mTvChapter = Utils.findRequiredViewAsType(source, R.id.tv_chapter, "field 'mTvChapter'", TextView.class);
    target.mTvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'mTvTime'", TextView.class);
    target.mTvMoney = Utils.findRequiredViewAsType(source, R.id.tv_money, "field 'mTvMoney'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChapterUnlockAdapter.ListViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cover = null;
    target.mTvName = null;
    target.mTvChapter = null;
    target.mTvTime = null;
    target.mTvMoney = null;
  }
}
