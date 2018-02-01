package com.android.loobster.tasks.detail_task;

import android.view.View;
import android.widget.TextView;

import com.android.loobster.R;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;

public class DetailTaskItem extends AbstractHeaderItem<DetailTaskHolder> {

    private TextView status;

    public DetailTaskItem (TextView status) {this.status = status;}

    @Override public boolean equals(Object o) {
        return false;
    }

    @Override public int getLayoutRes() {
        return R.layout.detail_task_screen;
    }

    @Override public DetailTaskHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new DetailTaskHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, DetailTaskHolder holder, int position, List payloads) {

    }
}
