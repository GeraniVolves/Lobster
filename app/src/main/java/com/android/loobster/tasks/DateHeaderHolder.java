package com.android.loobster.tasks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.loobster.NavigateTo;
import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class DateHeaderHolder extends FlexibleViewHolder {

    TextView uiMainText;
    TextView uiSecondaryText;

    ImageView uiAddNewItem;

    public DateHeaderHolder(View itemView, FlexibleAdapter adapter) {
        super(itemView, adapter, true);
        this.uiMainText = itemView.findViewById(R.id.main_text);
        this.uiSecondaryText = itemView.findViewById(R.id.secondary_text);
        this.uiAddNewItem = itemView.findViewById(R.id.add_new_item);
        uiAddNewItem.setOnClickListener(view -> NavigateTo.showCreateDialog(view.getContext()));
    }
}
