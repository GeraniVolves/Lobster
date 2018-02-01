package com.android.loobster.tasks.detail_task;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.loobster.R;

public class DetailTaskScreen extends AppCompatActivity {


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_task_screen);

        String DescriptionText = "Last month, my wife, Anne Doe, took me to Las Vegas because she had to go for a business convention. Last month, my wife, Anne Doe, took me to Las Vegas because she had to go for a business conv…";

        ExpandableTextView expandableTextView = findViewById(R.id.expandable_description);
        expandableTextView.setText(DescriptionText);

    }

}

