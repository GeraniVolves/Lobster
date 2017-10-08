package com.android.loobster.utils;

import android.databinding.BindingAdapter;
import android.view.View;
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

    @BindingAdapter("showError")
    public static void showError(View view, boolean showError) {
        if (showError) {
            Animations.fromTopToBottomSlide(view);
        } else {
            Animations.fromBottomToTopSlideAndGone(view);
        }
    }
}
