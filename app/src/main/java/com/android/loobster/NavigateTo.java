package com.android.loobster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.android.loobster.auth.LoginScreen;
import com.android.loobster.auth.RecoverAccountScreen;
import com.android.loobster.auth.RecoverAccountSuccessScreen;
import com.android.loobster.auth.SignUpScreen;
import com.android.loobster.create.CreateScreen;
import com.android.loobster.persons.PersonsListScreen;
import com.android.loobster.tasks.CreateDialog;
import com.android.loobster.tasks.detail_task.DetailTaskScreen;

public class NavigateTo {

    public static void signup(@NonNull Context context) {
        context.startActivity(new Intent(context, SignUpScreen.class));
    }

    public static void login(@NonNull Context context) {
        Intent intent = new Intent(context, LoginScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void recoverAccount(@NonNull Context context) {
        context.startActivity(new Intent(context, RecoverAccountScreen.class));
    }

    public static void create(@NonNull Context context) {
        context.startActivity(new Intent(context, CreateScreen.class));
    }

    public static void main(@NonNull Context context) {
        context.startActivity(new Intent(context, MainScreen.class));
    }

    public static void recoverSuccess(@NonNull Context context) {
        context.startActivity(new Intent(context, RecoverAccountSuccessScreen.class));
    }

    public static void personsList(@NonNull Context context) {
        context.startActivity(new Intent(context, PersonsListScreen.class));
    }

    public static void showCreateDialog(@NonNull Context context) {
        CreateDialog.showAddItem(context);
    }

    public static void detailTaskScreen (@NonNull Context context) {
        context.startActivity(new Intent(context, DetailTaskScreen.class));
    }

    public static void showChangeStatus (@NonNull Context context) {
        CreateDialog.showChangeStatus(context);
    }
}
