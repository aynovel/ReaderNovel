// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.bookdetail;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.club.R;
import com.bytedance.club.publics.weight.WrapListView;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommentReportActivity_ViewBinding implements Unbinder {
  private CommentReportActivity target;

  private View view7f08067e;

  private View view7f08014e;

  private TextWatcher view7f08014eTextWatcher;

  private View view7f08085a;

  @UiThread
  public CommentReportActivity_ViewBinding(CommentReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CommentReportActivity_ViewBinding(final CommentReportActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.listView, "field 'mListView' and method 'onItemClick'");
    target.mListView = Utils.castView(view, R.id.listView, "field 'mListView'", WrapListView.class);
    view7f08067e = view;
    ((AdapterView<?>) view).setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onItemClick(p2);
      }
    });
    view = Utils.findRequiredView(source, R.id.editText, "field 'mEditText' and method 'afterTextChange'");
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
        target.afterTextChange(p0);
      }
    };
    ((TextView) view).addTextChangedListener(view7f08014eTextWatcher);
    target.mWordCount = Utils.findRequiredViewAsType(source, R.id.wordCount, "field 'mWordCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.submit, "method 'onSubmitClick'");
    view7f08085a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmitClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mListView = null;
    target.mEditText = null;
    target.mWordCount = null;

    ((AdapterView<?>) view7f08067e).setOnItemClickListener(null);
    view7f08067e = null;
    ((TextView) view7f08014e).removeTextChangedListener(view7f08014eTextWatcher);
    view7f08014eTextWatcher = null;
    view7f08014e = null;
    view7f08085a.setOnClickListener(null);
    view7f08085a = null;
  }
}
