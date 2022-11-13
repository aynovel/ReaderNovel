// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.homepage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.RadiusImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookShelfFragment_ViewBinding implements Unbinder {
  private BookShelfFragment target;

  private View view7f08064a;

  private View view7f080981;

  @UiThread
  public BookShelfFragment_ViewBinding(final BookShelfFragment target, View source) {
    this.target = target;

    View view;
    target.mNoneView = Utils.findRequiredView(source, R.id.noneView, "field 'mNoneView'");
    target.mRlLibraryHint = Utils.findRequiredViewAsType(source, R.id.rl_library_hint, "field 'mRlLibraryHint'", RelativeLayout.class);
    target.mImgSign = Utils.findRequiredViewAsType(source, R.id.img_sign, "field 'mImgSign'", ImageView.class);
    target.mImgSearch = Utils.findRequiredViewAsType(source, R.id.img_search, "field 'mImgSearch'", ImageView.class);
    target.mImgManage = Utils.findRequiredViewAsType(source, R.id.img_manage, "field 'mImgManage'", ImageView.class);
    target.mComplete = Utils.findRequiredViewAsType(source, R.id.complete, "field 'mComplete'", TextView.class);
    target.mTvLeft = Utils.findRequiredViewAsType(source, R.id.tv_left, "field 'mTvLeft'", TextView.class);
    target.mRadiusImageView = Utils.findRequiredViewAsType(source, R.id.head, "field 'mRadiusImageView'", RadiusImageView.class);
    view = Utils.findRequiredView(source, R.id.layout_bookshelf_rec, "field 'mLayoutBookShelfRec' and method 'BookShelfRecOnClick'");
    target.mLayoutBookShelfRec = Utils.castView(view, R.id.layout_bookshelf_rec, "field 'mLayoutBookShelfRec'", LinearLayout.class);
    view7f08064a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.BookShelfRecOnClick();
      }
    });
    target.mCover = Utils.findRequiredViewAsType(source, R.id.cover, "field 'mCover'", ImageView.class);
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mInfo = Utils.findRequiredViewAsType(source, R.id.info, "field 'mInfo'", TextView.class);
    target.mImgBr1 = Utils.findRequiredViewAsType(source, R.id.imgBr1, "field 'mImgBr1'", ImageView.class);
    target.mImgBr2 = Utils.findRequiredViewAsType(source, R.id.imgBr2, "field 'mImgBr2'", ImageView.class);
    target.mImgBr3 = Utils.findRequiredViewAsType(source, R.id.imgBr3, "field 'mImgBr3'", ImageView.class);
    target.mImgBr4 = Utils.findRequiredViewAsType(source, R.id.imgBr4, "field 'mImgBr4'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.visitStore, "method 'onVisitStoreClick'");
    view7f080981 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onVisitStoreClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BookShelfFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNoneView = null;
    target.mRlLibraryHint = null;
    target.mImgSign = null;
    target.mImgSearch = null;
    target.mImgManage = null;
    target.mComplete = null;
    target.mTvLeft = null;
    target.mRadiusImageView = null;
    target.mLayoutBookShelfRec = null;
    target.mCover = null;
    target.mTitle = null;
    target.mInfo = null;
    target.mImgBr1 = null;
    target.mImgBr2 = null;
    target.mImgBr3 = null;
    target.mImgBr4 = null;

    view7f08064a.setOnClickListener(null);
    view7f08064a = null;
    view7f080981.setOnClickListener(null);
    view7f080981 = null;
  }
}
