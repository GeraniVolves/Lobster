package com.android.loobster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);
        findViewById(R.id.create).setOnClickListener(l -> NavigateTo.create(this));

    }
}
