package com.android.loobster.tasks;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class TaskViewHolder extends FlexibleViewHolder {

    View      frontView;
    View      uiSwipeActions;
    View      uiContainer;
    ImageView uiExecutorAvatar;
    TextView  uiExecutorName;
    TextView  uiTaskName;
    TextView  uiPriority;
    TextView  uiType;
    TextView  uiTime;

    public TaskViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);

        this.uiSwipeActions = view.findViewById(R.id.tasks_swipe_actions);
        frontView = view.findViewById(R.id.front_view);

        uiContainer = view;
        uiExecutorAvatar = view.findViewById(R.id.executor_avatar);
        uiExecutorName = view.findViewById(R.id.executor_name);
        uiTaskName = view.findViewById(R.id.task_name);
        uiType = view.findViewById(R.id.type);
        uiPriority = view.findViewById(R.id.priority);
        uiTime = view.findViewById(R.id.time);
    }

    @Override
    public View getFrontView() {
        return frontView;
    }

    @Override
    public View getRearRightView() {
        return uiSwipeActions;
    }

}
