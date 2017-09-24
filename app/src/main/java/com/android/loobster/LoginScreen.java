package com.android.loobster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);
        findViewById(R.id.sign_up).setOnClickListener(l -> Navigator.signup(this));
        findViewById(R.id.forgot_password).setOnClickListener(l -> Navigator.recoverAccount(this));
        findViewById(R.id.login).setOnClickListener(l -> Navigator.create(this));
    }
}