package com.android.loobster.tasks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;

import com.android.loobster.R;
import com.android.loobster.utils.Views;

public class CreateDialog {

    public static void showAddItem(@NonNull Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.DialogSlideAnim);
        builder.setView(Views.inflateWithoutParent(R.layout.tasks_add_new_item, context));
        AlertDialog dialog = builder.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
    }

    public static void showChangeStatus(@NonNull Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.DialogSlideAnim);
        builder.setView(Views.inflateWithoutParent(R.layout.change_status_task, context));
        AlertDialog dialog = builder.create();
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
    }

}
