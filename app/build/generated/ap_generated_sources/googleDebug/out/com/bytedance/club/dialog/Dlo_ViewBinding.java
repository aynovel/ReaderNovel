// Generated code from Butter Knife. Do not modify!
package com.bytedance.club.dialog;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
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

public class Dlo_ViewBinding implements Unbinder {
  private Dlo target;

  private View view7f080836;

  private View view7f080645;

  private View view7f08067b;

  private View view7f08067a;

  private View view7f08007c;

  private View view7f08007d;

  private View view7f08007e;

  private View view7f08007f;

  @UiThread
  public Dlo_ViewBinding(Dlo target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Dlo_ViewBinding(final Dlo target, View source) {
    this.target = target;

    View view;
    target.layout_setting = Utils.findRequiredViewAsType(source, R.id.layout_setting, "field 'layout_setting'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.smallerFont, "field 'smallerFont' and method 'onSmallerClick'");
    target.smallerFont = Utils.castView(view, R.id.smallerFont, "field 'smallerFont'", ImageView.class);
    view7f080836 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSmallerClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.largerFont, "field 'largerFont' and method 'onLineLargerClick'");
    target.largerFont = Utils.castView(view, R.id.largerFont, "field 'largerFont'", ImageView.class);
    view7f080645 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLineLargerClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.line_small, "field 'line_small' and method 'onLineSmallClick'");
    target.line_small = Utils.castView(view, R.id.line_small, "field 'line_small'", ImageView.class);
    view7f08067b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLineSmallClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.line_larger, "field 'line_larger' and method 'onLargerClick'");
    target.line_larger = Utils.castView(view, R.id.line_larger, "field 'line_larger'", ImageView.class);
    view7f08067a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLargerClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.bgColor1, "field 'bgColor1' and method 'onBgColor1Click'");
    target.bgColor1 = Utils.castView(view, R.id.bgColor1, "field 'bgColor1'", TextView.class);
    view7f08007c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBgColor1Click();
      }
    });
    view = Utils.findRequiredView(source, R.id.bgColor2, "field 'bgColor2' and method 'onBgColor2Click'");
    target.bgColor2 = Utils.castView(view, R.id.bgColor2, "field 'bgColor2'", TextView.class);
    view7f08007d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBgColor2Click();
      }
    });
    view = Utils.findRequiredView(source, R.id.bgColor3, "field 'bgColor3' and method 'onBgColor3Click'");
    target.bgColor3 = Utils.castView(view, R.id.bgColor3, "field 'bgColor3'", TextView.class);
    view7f08007e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBgColor3Click();
      }
    });
    view = Utils.findRequiredView(source, R.id.bgColor4, "field 'bgColor4' and method 'onBgColor4Click'");
    target.bgColor4 = Utils.castView(view, R.id.bgColor4, "field 'bgColor4'", TextView.class);
    view7f08007f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBgColor4Click();
      }
    });
    target.mIvBrightnessMinus = Utils.findRequiredViewAsType(source, R.id.read_setting_iv_brightness_minus, "field 'mIvBrightnessMinus'", ImageView.class);
    target.mSbBrightness = Utils.findRequiredViewAsType(source, R.id.read_setting_sb_brightness, "field 'mSbBrightness'", SeekBar.class);
    target.mIvBrightnessPlus = Utils.findRequiredViewAsType(source, R.id.read_setting_iv_brightness_plus, "field 'mIvBrightnessPlus'", ImageView.class);
    target.mCbBrightnessAuto = Utils.findRequiredViewAsType(source, R.id.read_setting_cb_brightness_auto, "field 'mCbBrightnessAuto'", CheckBox.class);
    target.read_setting_typeface_a = Utils.findRequiredViewAsType(source, R.id.read_setting_typeface_a, "field 'read_setting_typeface_a'", RadioButton.class);
    target.read_setting_typeface_b = Utils.findRequiredViewAsType(source, R.id.read_setting_typeface_b, "field 'read_setting_typeface_b'", RadioButton.class);
    target.mRgPageMode = Utils.findRequiredViewAsType(source, R.id.read_setting_rg_page_mode, "field 'mRgPageMode'", RadioGroup.class);
    target.mRbSimulation = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_simulation, "field 'mRbSimulation'", RadioButton.class);
    target.mRbCover = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_cover, "field 'mRbCover'", RadioButton.class);
    target.mRbSlide = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_slide, "field 'mRbSlide'", RadioButton.class);
    target.mRbScroll = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_scroll, "field 'mRbScroll'", RadioButton.class);
    target.mRbNone = Utils.findRequiredViewAsType(source, R.id.read_setting_rb_none, "field 'mRbNone'", RadioButton.class);
    target.mRvBg = Utils.findRequiredViewAsType(source, R.id.read_setting_rv_bg, "field 'mRvBg'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Dlo target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.layout_setting = null;
    target.smallerFont = null;
    target.largerFont = null;
    target.line_small = null;
    target.line_larger = null;
    target.bgColor1 = null;
    target.bgColor2 = null;
    target.bgColor3 = null;
    target.bgColor4 = null;
    target.mIvBrightnessMinus = null;
    target.mSbBrightness = null;
    target.mIvBrightnessPlus = null;
    target.mCbBrightnessAuto = null;
    target.read_setting_typeface_a = null;
    target.read_setting_typeface_b = null;
    target.mRgPageMode = null;
    target.mRbSimulation = null;
    target.mRbCover = null;
    target.mRbSlide = null;
    target.mRbScroll = null;
    target.mRbNone = null;
    target.mRvBg = null;

    view7f080836.setOnClickListener(null);
    view7f080836 = null;
    view7f080645.setOnClickListener(null);
    view7f080645 = null;
    view7f08067b.setOnClickListener(null);
    view7f08067b = null;
    view7f08067a.setOnClickListener(null);
    view7f08067a = null;
    view7f08007c.setOnClickListener(null);
    view7f08007c = null;
    view7f08007d.setOnClickListener(null);
    view7f08007d = null;
    view7f08007e.setOnClickListener(null);
    view7f08007e = null;
    view7f08007f.setOnClickListener(null);
    view7f08007f = null;
  }
}
