package com.android.loobster.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DataBindingImageView {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        if (url == null) {
            imageView.setImageDrawable(null);
        } else {
            Glide.with(imageView).load(url).apply(RequestOptions.centerCropTransform())
                .into(imageView);
        }
    }
}
