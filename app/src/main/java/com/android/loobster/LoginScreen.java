package com.android.loobster;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.utils.Dps;

public class LoginScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);
        TextView uiLoginError = findViewById(R.id.login_error);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            uiLoginError.setPadding(uiLoginError.getPaddingLeft(),
                uiLoginError.getPaddingTop() + Dps.toPixel(24, this),
                uiLoginError.getPaddingRight(),
                uiLoginError.getPaddingBottom()
            );
        }
        uiLoginError.setVisibility(View.GONE);
        findViewById(R.id.sign_up).setOnClickListener(l -> NavigateTo.signup(this));
        findViewById(R.id.forgot_password).setOnClickListener(l -> NavigateTo.recoverAccount(this));
        findViewById(R.id.login).setOnClickListener(v -> {
            if (((TextView) findViewById(R.id.password)).getText().toString().equals("1")) {
                uiLoginError.setVisibility(View.VISIBLE);
                uiLoginError.setTranslationY(-100);
                uiLoginError.animate().translationY(0).start();
            } else {
                NavigateTo.main(this);
            }
        });
    }
}
