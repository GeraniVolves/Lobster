package com.android.loobster.tasks.detail_task;

import android.view.View;
import android.widget.TextView;

import com.android.loobster.NavigateTo;
import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class DetailTaskHolder extends FlexibleViewHolder {

    TextView uiTitle;
    TextView uiChangeStatus;

    public DetailTaskHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter, true);
        this.uiTitle = itemView.findViewById(R.id.title);
        this.uiChangeStatus = itemView.findViewById(R.id.change_status);
        uiChangeStatus.setOnClickListener(v -> NavigateTo.showChangeStatus(view.getContext()));
    }
}
