package com.android.loobster.tasks.models;

public class SeveralTask {

    public String imageUrl;


    public SeveralTask(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public boolean hasImage() {
        return imageUrl != null;
    }
}