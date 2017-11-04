package com.android.loobster.tasks.checkbox;

import android.view.View;
import android.widget.CheckBox;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

public class CheckViewHolder extends FlexibleViewHolder {

    CheckBox uiCheckBox;

    public CheckViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        this.uiCheckBox = (CheckBox) view;
    }
}
