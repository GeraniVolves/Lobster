package com.android.loobster.utils;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Views {

    public static View inflateWithoutParent(@LayoutRes int layoutRes, @NonNull Context context) {
        return LayoutInflater.from(context).inflate(layoutRes, null, false);
    }

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
