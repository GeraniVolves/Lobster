package com.android.loobster.utils.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class AudioVisualizerView extends View {

    private float[] audio;
    Paint paint = new Paint() {{
        setColor(0xFFFFFFFF);
    }};

    public AudioVisualizerView(Context context) {
        super(context);
    }

    public AudioVisualizerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Random random = new Random();
        audio = new float[50];
        for (int i = 0; i < 50; i++) {
            audio[i] = Math.max(random.nextFloat(), 0.1F) * 100;
        }
    }

    private RectF rect = new RectF();

    public void setAudio(float[] audio) {
        this.audio = audio;
    }

    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float current = 0;
        float itemWidth = (float) getWidth() / 100;
        for (int i = 0; i < audio.length; i++) {
            float half = getHeight() / 2;
            rect.top = half - (half * (audio[i] / 100));
            rect.bottom = half + (half * (audio[i] / 100));
            rect.left = current;
            rect.right = current + itemWidth;
            canvas.drawRoundRect(rect, 5, 5, paint);
            current += (itemWidth + itemWidth);
        }
    }
}
