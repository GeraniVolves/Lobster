package com.android.loobster.auth;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.NavigateTo;
import com.android.loobster.R;
import com.android.loobster.databinding.ScreenLoginBinding;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Views;

public class LoginScreen extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    private TextView uiError;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        ScreenLoginBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.screen_login);
        viewDataBinding.setVm(loginViewModel);

        uiError = viewDataBinding.loginError;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            Views.increateTopPadding(uiError, Dps.toPixel(24, this));
        }

        findViewById(R.id.sign_up).setOnClickListener(l -> NavigateTo.signup(this));
        findViewById(R.id.forgot_password).setOnClickListener(l -> NavigateTo.recoverAccount(this));
    }
}
