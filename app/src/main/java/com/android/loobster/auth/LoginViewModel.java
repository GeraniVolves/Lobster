package com.android.loobster.auth;

import android.arch.lifecycle.ViewModel;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class LoginViewModel extends ViewModel {

    public final ObservableField<String> login    = new ObservableField<>();
    public final ObservableField<String> password = new ObservableField<>();

    public final ObservableBoolean       showError    = new ObservableBoolean();
    public final ObservableField<String> errorMessage = new ObservableField<>();

    public LoginViewModel() {
        // TODO investigate viewmodel lifecycle
        login.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
        password.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
    }

    public void onLoginClicked() {
        if (password.get() != null && password.get().equals("1")) {
            showError.set(true);
            errorMessage.set("This is my error");
        } else {
            showError.set(false);
        }
    }
}
