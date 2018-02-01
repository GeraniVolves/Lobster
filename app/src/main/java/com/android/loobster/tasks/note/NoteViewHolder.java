package com.android.loobster.tasks.note;

import android.view.View;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class NoteViewHolder extends FlexibleViewHolder {

    TextView uiText;

    public NoteViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        uiText = view.findViewById(R.id.content);
    }
}
