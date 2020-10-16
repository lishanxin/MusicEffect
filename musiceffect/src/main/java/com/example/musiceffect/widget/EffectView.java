package com.example.musiceffect.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.musiceffect.drawble.AncientEffectDrawable;
import com.example.musiceffect.drawble.BaseEffectDrawable;
import com.example.musiceffect.drawble.BlastBassEffectDrawable;
import com.example.musiceffect.drawble.ElectronicEffectDrawable;
import com.example.musiceffect.drawble.HistogramEffectDrawable;
import com.example.musiceffect.drawble.LonelyEffectDrawable;
import com.example.musiceffect.drawble.ReverberationEffectDrawable;
import com.example.musiceffect.drawble.ReverberationEffectDrawableOld;
import com.example.musiceffect.drawble.SurroundEffectDrawable;
import com.example.musiceffect.drawble.TestDrawable;
import com.example.musiceffect.drawble.ValveEffectDrawable;

public class EffectView extends ImageView {

    private int mPaintColor = Color.parseColor("#CABFA3");
    private int[] mPaintColors;

    public EffectView(Context context) {
        super(context);
        init();
    }

    public EffectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EffectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    private BaseEffectDrawable mDrawable;

    private void initDrawable(BaseEffectDrawable drawable) {
        mDrawable = drawable;
        setImageDrawable(mDrawable);
        setColor();
    }

    public void setAncientEffectDrawable() {
        initDrawable(new AncientEffectDrawable(getContext()));
    }

    public void setReverberationEffectDrawable() {
        initDrawable(new ReverberationEffectDrawable(getContext()));
    }

    public void setBlastBassEffectDrawable() {
        initDrawable(new BlastBassEffectDrawable(getContext()));
    }

    public void setElectronicEffectDrawable() {
        initDrawable(new ElectronicEffectDrawable(getContext()));
    }

    public void setSurroundEffectDrawable() {
        initDrawable(new SurroundEffectDrawable(getContext()));
    }

    public void setLonelyEffectDrawable() {
        initDrawable(new LonelyEffectDrawable(getContext()));
    }

    public void setValveEffectDrawable() {
        initDrawable(new ValveEffectDrawable(getContext()));
    }

    public void setHistogramEffectDrawablee() {
        initDrawable(new HistogramEffectDrawable(getContext()));
    }

    @Deprecated
    public void setTestDrawable() {
        initDrawable(new TestDrawable(getContext()));
    }

    @Deprecated
    public void setAncientEffectDrawable3() {
        initDrawable(new ReverberationEffectDrawableOld(getContext()));
    }

    public void setColor() {
        if (mDrawable != null) {
            mDrawable.setColor(mPaintColor);
            mDrawable.setColors(mPaintColors);
        }
    }

    public void setColor(int color) {
        mPaintColor = color;
        if (mDrawable != null) {
            mDrawable.setColor(color);
        }
    }

    public void setColors(int[] colors) {
        mPaintColors = colors;
        if (mDrawable != null) {
            mDrawable.setColors(colors);
        }
    }

    public void onCall(final byte[] data) {
//        if (data != null) {
//            Log.e("yijunwu", (int) data[0] + " " + (int) data[1]);
//        }
        if (mDrawable != null) {
            mDrawable.onCall(data);
        }
    }

    public void onWaveCall(byte[] data) {
        if (mDrawable != null) {
            mDrawable.onWaveCall(data);
        }
    }
}
