package com.android.loobster.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.view.View;

public class Animations {

    public static void fromTopToBottomSlide(@NonNull View view) {
        view.setVisibility(View.VISIBLE);
        int viewHeight = view.getHeight();
        view.setTranslationY(viewHeight == 0 ? -Dps.toPixel(72, view.getContext()) : -viewHeight);
        view.animate().translationY(0).setListener(null).start();
    }

    public static void fromBottomToTopSlideAndGone(@NonNull View view) {
        int viewHeight = view.getHeight();
        view.setTranslationY(0);
        view.animate().setListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                view.setVisibility(View.GONE);
            }
        }).translationY(-viewHeight).start();
    }
}
