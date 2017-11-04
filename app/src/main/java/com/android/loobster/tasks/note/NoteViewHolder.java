package com.android.loobster.tasks.note;

import android.view.View;
import android.widget.TextView;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

public class NoteViewHolder extends FlexibleViewHolder {

    TextView uiText;

    public NoteViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        this.uiText = (TextView) view;
    }
}
