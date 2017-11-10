package com.android.loobster.tasks;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.view.View;

import com.android.loobster.R;
import com.android.loobster.tasks.models.Task;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.ImageLoader;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class TaskItem extends AbstractSectionableItem<TaskViewHolder, DateHeaderItem> {

    public Task task;

    public TaskItem(@NonNull Task task, DateHeaderItem dateHeaderItem) {
        super(dateHeaderItem);
        this.task = task;
        setDraggable(true);
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

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, TaskViewHolder holder, int position, List payloads) {
        ImageLoader.loadCicrle(holder.uiExecutorAvatar, task.executor.avatarUrl);
        holder.uiExecutorName.setText(task.executor.name);
        holder.uiTaskName.setText(task.name);
        holder.uiPriority.setText(task.priority);
        holder.uiType.setText(task.type);
        holder.uiTime.setText(task.time);

        holder.uiExecutorName.setTextColor(Color.parseColor(task.textColor));
        holder.uiTaskName.setTextColor(Color.parseColor(task.textColor));
        holder.uiPriority.setTextColor(Color.parseColor(task.textColor));
        holder.uiType.setTextColor(Color.parseColor(task.textColor));
        holder.uiTime.setTextColor(Color.parseColor(task.textColor));

        holder.uiTaskName.invalidate();

        if (task.hasImage()) {
            ImageLoader.load(holder.uiBackground, task.imageUrl);
        } else {
            applyGradient(holder);
        }
    }

    private void applyGradient(TaskViewHolder holder) {
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(task.bgColorLeft), Color.parseColor(task.bgColorRight)});
        gd.setCornerRadius(Dps.toPixel(8, holder.itemView.getContext()));
        holder.uiBackground.setBackgroundDrawable(gd);
    }
}
