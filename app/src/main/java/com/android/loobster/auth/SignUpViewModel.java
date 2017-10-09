package com.android.loobster.auth;

import android.arch.lifecycle.ViewModel;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class SignUpViewModel extends ViewModel {

    public final ObservableField<String> email    = new ObservableField<>();
    public final ObservableField<String> password = new ObservableField<>();
    public final ObservableField<String> fullName = new ObservableField<>();

    public final ObservableBoolean       showError    = new ObservableBoolean();
    public final ObservableField<String> errorMessage = new ObservableField<>();

    public SignUpViewModel() {
        // TODO investigate viewmodel lifecycle
        email.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
        password.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
        fullName.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
    }

    public void onSignUpClicked() {
        if (password.get() != null && password.get().equals("1")) {
            showError.set(true);
            errorMessage.set("This is my error");
        } else {
            showError.set(false);
        }
    }
}

