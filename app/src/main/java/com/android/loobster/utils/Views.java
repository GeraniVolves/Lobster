package com.android.loobster.utils;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Views {

    public static View inflate(@LayoutRes int layoutRes, @NonNull ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(layoutRes, parent, false);
    }

    public static void increateTopPadding(View view, int px) {
        view.setPadding(view.getPaddingLeft(),
            view.getPaddingTop() + px,
            view.getPaddingRight(),
            view.getPaddingBottom()
        );
    }
}
