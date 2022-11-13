// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PublishWorkCommentActivity_ViewBinding implements Unbinder {
  private PublishWorkCommentActivity target;

  private View view7f08014e;

  private TextWatcher view7f08014eTextWatcher;

  @UiThread
  public PublishWorkCommentActivity_ViewBinding(PublishWorkCommentActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PublishWorkCommentActivity_ViewBinding(final PublishWorkCommentActivity target,
      View source) {
    this.target = target;

    View view;
    target.mRatingBar = Utils.findRequiredViewAsType(source, R.id.ratingBar, "field 'mRatingBar'", RatingBar.class);
    view = Utils.findRequiredView(source, R.id.editText, "field 'mEditText' and method 'afterTextChanged'");
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
        target.afterTextChanged(p0);
      }
    };
    ((TextView) view).addTextChangedListener(view7f08014eTextWatcher);
    target.mWordCount = Utils.findRequiredViewAsType(source, R.id.wordCount, "field 'mWordCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PublishWorkCommentActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRatingBar = null;
    target.mEditText = null;
    target.mWordCount = null;

    ((TextView) view7f08014e).removeTextChangedListener(view7f08014eTextWatcher);
    view7f08014eTextWatcher = null;
    view7f08014e = null;
  }
}
