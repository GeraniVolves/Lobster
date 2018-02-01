package com.android.loobster.tasks.checkbox;

import android.view.View;
import android.widget.CheckBox;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

public class CheckViewHolder extends FlexibleViewHolder {

    CheckBox uiCheckBox;

    public CheckViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        uiCheckBox = view.findViewById(R.id.content) ;
    }
}
