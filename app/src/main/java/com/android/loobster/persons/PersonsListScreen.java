package com.android.loobster.persons;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.loobster.R;

public class PersonsListScreen extends Activity {

    private String[] myDataset = new String[]{
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_do_list_screen);
        RecyclerView uiList = findViewById(R.id.list);
        uiList.setLayoutManager(new LinearLayoutManager(this));
        uiList.setAdapter(new PersonsListAdapter(myDataset));
    }
}
