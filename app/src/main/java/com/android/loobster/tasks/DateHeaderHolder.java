package com.android.loobster.tasks;

import android.view.View;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class DateHeaderHolder extends FlexibleViewHolder {

    TextView uiMainText;
    TextView uiSecondaryText;

    public DateHeaderHolder(View itemView, FlexibleAdapter adapter) {
        super(itemView, adapter, true);
        this.uiMainText = itemView.findViewById(R.id.main_text);
        this.uiSecondaryText = itemView.findViewById(R.id.secondary_text);
    }
}
