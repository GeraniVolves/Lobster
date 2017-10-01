package com.android.loobster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SignUpScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_sign_up);
        findViewById(R.id.login).setOnClickListener(l -> NavigateTo.login(this));
        findViewById(R.id.sign_up).setOnClickListener(l -> NavigateTo.create(this));
    }

}

