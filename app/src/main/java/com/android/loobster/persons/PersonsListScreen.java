package com.android.loobster.persons;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.loobster.R;

public class PersonsListScreen extends Activity {

    private RecyclerView               mRecyclerView;
    private RecyclerView.Adapter       mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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
        mRecyclerView = findViewById(R.id.list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new PersonsListAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }


}
