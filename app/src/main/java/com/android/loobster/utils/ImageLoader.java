package com.android.loobster.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageLoader {
    public static void load(ImageView imageView, String url) {
        Glide.with(imageView).load(url).apply(RequestOptions.centerCropTransform())
            .into(imageView);
    }

    public static void loadCicrle(ImageView imageView, String url) {
        Glide.with(imageView).load(url).apply(RequestOptions.circleCropTransform())
            .into(imageView);
    }
}
