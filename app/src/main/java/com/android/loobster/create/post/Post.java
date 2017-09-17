package com.android.loobster.create.post;

public class Post {

    public String imageUrl;
    public String text;

    public boolean hasImage() {
        return imageUrl != null;
    }
}
