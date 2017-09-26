package com.android.loobster;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class RecoverAccountScreen extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recover_account_screen);
        findViewById(R.id.close).setOnClickListener(l -> finish());
        findViewById(R.id.recover_output).setOnClickListener(l -> NavigateTo.success(this));
    }
}
