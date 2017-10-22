package com.android.loobster.tasks.models;

import com.android.loobster.persons.Persona;

public class Task {

    public Persona executor;
    public String  name;
    public String  type;
    public String  priority;
    public String  time;
    public String textColor;
    public String  bgColorLeft;
    public String  bgColorRight;
    public String imageUrl;

    public Task(Persona executor, String name, String type, String priority, String time, String bgColorLeft, String bgColorRight, String textColor) {
        this.executor = executor;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.time = time;
        this.bgColorLeft = bgColorLeft;
        this.bgColorRight = bgColorRight;
        this.textColor = textColor;
    }

    public Task(Persona executor, String name, String type, String priority, String time, String bgColorLeft, String bgColorRight, String textColor, String imageUrl) {
        this.bgColorLeft = bgColorLeft;
        this.bgColorRight = bgColorRight;
        this.executor = executor;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.time = time;
        this.textColor = textColor;
        this.imageUrl = imageUrl;
    }

    public boolean hasImage() {
        return imageUrl != null;
    }
}
