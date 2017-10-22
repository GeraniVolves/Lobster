package com.android.loobster.tasks;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;

public class TasksAdapter extends FlexibleAdapter<TaskViewHolderItem> {
    private final ViewBinderHelper viewBinderHelper = new ViewBinderHelper();

    public TasksAdapter(@Nullable List<TaskViewHolderItem> items) {
        super(items);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, List payloads) {
        super.onBindViewHolder(holder, position, payloads);
        Object item = getItem(position);
        if (item instanceof TaskViewHolderItem) {
            viewBinderHelper.bind((SwipeRevealLayout) holder.itemView, item.toString());
        }
    }
}
