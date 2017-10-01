package com.android.loobster;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.utils.Animations;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Views;

public class RecoverAccountScreen extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recover_account_screen);
        TextView uiError = findViewById(R.id.recover_error);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            Views.increateTopPadding(uiError, Dps.toPixel(24, this));
        }
        uiError.setVisibility(View.GONE);
        findViewById(R.id.close).setOnClickListener(l -> finish());
        findViewById(R.id.recover_btn).setOnClickListener(v -> {
            if (((TextView) findViewById(R.id.email)).getText().toString().equals("1")) {
                Animations.fromTopToBottomSlide(uiError);
            } else {
                NavigateTo.recoverSuccess(this);
            }
        });
    }
}
