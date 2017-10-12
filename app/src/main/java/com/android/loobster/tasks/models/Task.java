package com.android.loobster.tasks.models;

import com.android.loobster.persons.Persona;

import java.util.Date;

public class Task {

    public String  backgroundColor;
    public Persona executor;
    public String  name;
    public String  type;
    public String  priority;
    public String  time;
    public Date    deadline;

    public Task(Persona executor, String name, String type, String priority, String time) {
        this.executor = executor;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.time = time;
    }
}
