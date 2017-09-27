package com.android.loobster.persons;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.loobster.R;

public class PersonsListScreen extends Activity {

    private String[] names = new String[]{
        "Country",
        "Sex",
        "Age",
        "Bob",
        "Big Cock",
        "Wet pussy",
        "Hey Man",
        "I'm dirty hacker",
        "Lol Kekovich",
        "Mda Mdamovich",
        "Ilya Eremin",
        "Crash",
        "Hotfix"
    };

    private Persona[] personas = new Persona[] {
        new Persona("Ilya", "Developer"),
        new Persona("Kseniya", "Junior Developer")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_do_list_screen);
        RecyclerView uiList = findViewById(R.id.list);
        uiList.setLayoutManager(new LinearLayoutManager(this));
        uiList.setAdapter(new PersonsListAdapter(names));
    }
}
