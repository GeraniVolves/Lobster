package com.android.loobster.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Keyboard {
    public static void hide(@NonNull Activity activity) {
        InputMethodManager inputManager = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        View view = activity.getCurrentFocus();
        if (view != null) {
            assert inputManager != null;
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
