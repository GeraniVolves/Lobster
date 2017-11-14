package com.android.loobster.tasks.several_task;

import android.view.View;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem;

public class Item extends AbstractFlexibleItem<SeveralTaskViewHolder> {

    @Override public boolean equals(Object o) {
        return false;
    }

    @Override public int getLayoutRes() {
        // TODO insert proper layout resource id
        return 0;
    }

    @Override public SeveralTaskViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return null;
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, SeveralTaskViewHolder holder, int position, List payloads) {
    }
}
