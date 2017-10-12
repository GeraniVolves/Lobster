package com.android.loobster.tasks;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.loobster.R;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;

public class DateHeaderItem extends AbstractHeaderItem {

    private int date;

    public DateHeaderItem(int date) {
        this.date = date;
    }

    @Override public boolean equals(Object o) {
        return o != null && o instanceof DateHeaderItem && ((DateHeaderItem) o).date == date;
    }

    @Override public int getLayoutRes() {
        return R.layout.header_date;
    }

    @Override public RecyclerView.ViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new DateHeaderHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, RecyclerView.ViewHolder holder, int position, List payloads) {

    }
}
