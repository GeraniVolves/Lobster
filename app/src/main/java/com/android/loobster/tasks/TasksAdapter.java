package com.android.loobster.tasks;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.IFlexible;

public class TasksAdapter<T extends IFlexible> extends FlexibleAdapter<T> {
    private final ViewBinderHelper viewBinderHelper = new ViewBinderHelper();

    public TasksAdapter(@Nullable List<T> items) {
        super(items);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, List payloads) {
        Object item = getItem(position);
        if (item instanceof TaskItemHeader) {
            viewBinderHelper.bind((SwipeRevealLayout) holder.itemView, item.toString());
        }
        super.onBindViewHolder(holder, position, payloads);
    }
}
