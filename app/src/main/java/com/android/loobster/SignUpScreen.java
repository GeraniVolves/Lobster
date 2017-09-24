package com.android.loobster;

import android.app.Activity;
import android.os.Bundle;

public class SignUpScreen extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_sign_up);
        findViewById(R.id.login).setOnClickListener(l -> NavigateTo.login(this));
        findViewById(R.id.sign_up).setOnClickListener(l -> NavigateTo.create(this));
    }

}

