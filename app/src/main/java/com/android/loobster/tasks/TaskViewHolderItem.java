package com.android.loobster.tasks;

import android.support.annotation.NonNull;
import android.view.View;

import com.android.loobster.R;
import com.android.loobster.tasks.models.Task;
import com.android.loobster.utils.ImageLoader;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class TaskViewHolderItem extends AbstractSectionableItem<TaskViewHolder, DateHeaderItem> {

    public Task task;

    public TaskViewHolderItem(@NonNull Task task, DateHeaderItem dateHeaderItem) {
        super(dateHeaderItem);
        this.task = task;
    }

    @Override public boolean equals(Object o) {
        return task.equals(o);
    }

    @Override public int getLayoutRes() {
        return R.layout.task_swipeable_item;
    }

    @Override public TaskViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new TaskViewHolder(view, adapter);
    }

    @Override public boolean isSwipeable() {
        return true;
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, TaskViewHolder holder, int position, List payloads) {
        ImageLoader.loadCicrle(holder.uiExecutorAvatar, task.executor.avatarUrl);
        holder.uiExecutorName.setText(task.executor.name);
        holder.uiTaskName.setText(task.name);
        holder.uiPriority.setText(task.priority);
        holder.uiType.setText(task.type);
        holder.uiTime.setText(task.time);
    }
}
