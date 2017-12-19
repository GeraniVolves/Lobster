package com.android.loobster.auth;

import android.arch.lifecycle.ViewModel;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class RecoverAccountViewModel extends ViewModel {

    public final ObservableField<String> email = new ObservableField<>();

    public final ObservableBoolean       showError    = new ObservableBoolean();
    public final ObservableField<String> errorMessage = new ObservableField<>();

    public RecoverAccountViewModel() {
        email.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override public void onPropertyChanged(Observable observable, int i) {
                showError.set(false);
            }
        });
    }

    public void onRecoverClicked() {
        if (email.get() != null && email.get().equals("q")) {
            showError.set(true);
            errorMessage.set("This is my error");
        } else {
            showError.set(false);
        }
    }
}
