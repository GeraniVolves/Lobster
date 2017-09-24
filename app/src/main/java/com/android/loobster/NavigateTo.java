package com.android.loobster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.android.loobster.create.CreateScreen;
import com.android.loobster.create.CreateTaskFragment;

class NavigateTo {

    static void signup(@NonNull Context context) {
        context.startActivity(new Intent(context, SignUpScreen.class));
    }

    static void login(@NonNull Context context) {
        Intent intent = new Intent(context, LoginScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    static void recoverAccount(@NonNull Context context) {
        context.startActivity(new Intent(context, RecoverAccountScreen.class));
    }

    public static void create(@NonNull Context context) {
        context.startActivity(new Intent(context, CreateScreen.class));
    }

    public static void main(@NonNull Context context) {
        context.startActivity(new Intent(context, MainScreen.class));
    }

}
