package com.android.loobster.create;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.android.loobster.R;

public class CreateScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_activity);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CreatePager(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        findViewById(R.id.close).setOnClickListener(v -> finish());
    }
}

