package com.android.loobster.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class DataBindingImageView {

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        if (url == null) {
            imageView.setImageDrawable(null);
        } else {
            ImageLoader.load(imageView, url);
        }
    }

}
