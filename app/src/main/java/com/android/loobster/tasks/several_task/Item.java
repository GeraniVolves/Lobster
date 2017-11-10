package com.android.loobster.tasks.several_task;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class Item extends AbstractSectionableItem<SeveralTaskViewHolder> {
    @Override public boolean equals(Object o) {
        return false;
    }

    @Override public int getLayoutRes() {
        return 0;
    }

    @Override public RecyclerView.ViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return null;
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, RecyclerView.ViewHolder holder, int position, List payloads) {

    }
}
