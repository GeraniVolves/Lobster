package com.android.loobster.tasks.models;

import com.android.loobster.persons.Persona;

public class Task {

    public Task(Persona executor, String name, String type, String priority, String time) {
        this.executor = executor;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.time = time;
    }

    public String  backgroundColor;
    public Persona executor;
    public String  name;
    public String  type;
    public String  priority;
    public String  time;
}
