package com.android.loobster.auth;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.NavigateTo;
import com.android.loobster.R;
import com.android.loobster.databinding.RecoverAccountScreenBinding;
import com.android.loobster.utils.Animations;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Views;

public class RecoverAccountScreen extends AppCompatActivity {

    private RecoverAccountViewModel recoverViewModel;

    private TextView uiError;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recover_account_screen);
        recoverViewModel = ViewModelProviders.of(this).get(RecoverAccountViewModel.class);
        RecoverAccountScreenBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.recover_account_screen);
        viewDataBinding.setVm(recoverViewModel);

        uiError = viewDataBinding.recoverError;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            Views.increateTopPadding(uiError, Dps.toPixel(24, this));
        }
        findViewById(R.id.close).setOnClickListener(l -> finish());

        findViewById(R.id.recover_btn).setOnClickListener(v -> {
            if (((TextView) findViewById(R.id.email)).getText().toString().equals("q")) {
                Animations.fromTopToBottomSlide(uiError);
            } else {
                NavigateTo.recoverSuccess(this);
            }
        });
    }
}
