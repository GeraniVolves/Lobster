package com.android.loobster.auth;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.loobster.NavigateTo;
import com.android.loobster.R;
import com.android.loobster.databinding.ScreenSignUpBinding;
import com.android.loobster.utils.Animations;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Views;

public class SignUpScreen extends AppCompatActivity {

    private SignUpViewModel signupViewModel;

    private TextView uiError;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        signupViewModel = ViewModelProviders.of(this).get(SignUpViewModel.class);
        ScreenSignUpBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.screen_sign_up);
        viewDataBinding.setVm(signupViewModel);

        uiError = viewDataBinding.signupError;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            Views.increateTopPadding(uiError, Dps.toPixel(24, this));
        }
        findViewById(R.id.login).setOnClickListener(v -> NavigateTo.login(this));
    }

    @Override protected void onResume() {
        super.onResume();
        uiError.setVisibility(View.GONE);
    }
}

