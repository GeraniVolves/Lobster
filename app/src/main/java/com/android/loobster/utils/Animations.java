package com.android.loobster.utils;

import android.support.annotation.NonNull;
import android.view.View;

public class Animations {

    public static void fromTopToBottomSlide(@NonNull View view) {
        view.setVisibility(View.VISIBLE);
        int viewHeight = view.getHeight();
        view.setTranslationY(viewHeight == 0 ? -Dps.toPixel(72, view.getContext()) : -viewHeight);
        view.animate().translationY(0).start();
    }
}
