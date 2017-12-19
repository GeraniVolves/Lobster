package com.android.loobster.tasks.detail_task;

import android.view.View;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem;

public class Item extends AbstractFlexibleItem<DetailTaskViewHolder> {

    @Override public boolean equals(Object o) {
        return false;
    }

    @Override public int getLayoutRes() {
        // TODO insert proper layout resource id
        return 0;
    }

    @Override public DetailTaskViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return null;
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, DetailTaskViewHolder holder, int position, List payloads) {
    }
}
