package com.android.loobster;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.utils.Animations;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Views;

public class LoginScreen extends AppCompatActivity {

    private TextView uiError;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);
        uiError = findViewById(R.id.login_error);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            Views.increateTopPadding(uiError, Dps.toPixel(24, this));
        }
        uiError.setVisibility(View.GONE);
        findViewById(R.id.sign_up).setOnClickListener(l -> NavigateTo.signup(this));
        findViewById(R.id.forgot_password).setOnClickListener(l -> NavigateTo.recoverAccount(this));
        findViewById(R.id.login).setOnClickListener(v -> {
            if (((TextView) findViewById(R.id.password)).getText().toString().equals("1")) {
                Animations.fromTopToBottomSlide(uiError);
            } else {
                NavigateTo.main(this);
            }
        });
    }

    @Override protected void onResume() {
        super.onResume();
        uiError.setVisibility(View.GONE);
    }
}
