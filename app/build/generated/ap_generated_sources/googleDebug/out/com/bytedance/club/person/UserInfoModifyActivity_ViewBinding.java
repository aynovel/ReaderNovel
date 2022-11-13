// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.person;

import android.view.View;
import android.widget.EditText;
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

public class UserInfoModifyActivity_ViewBinding implements Unbinder {
  private UserInfoModifyActivity target;

  private View view7f0801a6;

  private View view7f080802;

  private View view7f080081;

  private View view7f08085a;

  @UiThread
  public UserInfoModifyActivity_ViewBinding(UserInfoModifyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserInfoModifyActivity_ViewBinding(final UserInfoModifyActivity target, View source) {
    this.target = target;

    View view;
    target.mHead = Utils.findRequiredViewAsType(source, R.id.head, "field 'mHead'", RadiusImageView.class);
    target.mNickName = Utils.findRequiredViewAsType(source, R.id.nickName, "field 'mNickName'", EditText.class);
    target.mSex = Utils.findRequiredViewAsType(source, R.id.sex, "field 'mSex'", TextView.class);
    target.mBirthday = Utils.findRequiredViewAsType(source, R.id.birthday, "field 'mBirthday'", TextView.class);
    view = Utils.findRequiredView(source, R.id.headItem, "method 'onHeadItemClick'");
    view7f0801a6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onHeadItemClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.sexItem, "method 'onSexItemClick'");
    view7f080802 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSexItemClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.birthdayItem, "method 'onBirthdayItemClick'");
    view7f080081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBirthdayItemClick();
      }
    });
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
    UserInfoModifyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHead = null;
    target.mNickName = null;
    target.mSex = null;
    target.mBirthday = null;

    view7f0801a6.setOnClickListener(null);
    view7f0801a6 = null;
    view7f080802.setOnClickListener(null);
    view7f080802 = null;
    view7f080081.setOnClickListener(null);
    view7f080081 = null;
    view7f08085a.setOnClickListener(null);
    view7f08085a = null;
  }
}
