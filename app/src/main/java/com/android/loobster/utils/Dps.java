package com.android.loobster.utils;

import android.content.Context;
import android.support.annotation.NonNull;

public class Dps {
    public static int toPixel(int dp, @NonNull Context context) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}
