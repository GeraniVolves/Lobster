package com.android.loobster.tasks.models;

public class ToDo {

    private String  text;
    private boolean done;

    public ToDo(String text, boolean done) {
        this.text = text;
        this.done = done;
    }

    public String getText() {
        return text;
    }
}
