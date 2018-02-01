package com.android.loobster.tasks;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class TaskViewHolder extends FlexibleViewHolder {

    ImageView uiExecutorAvatar;
    TextView  uiExecutorName;
    TextView  uiTaskName;
    TextView  uiPriority;
    TextView  uiType;
    TextView  uiTime;
    ImageView uiBackground;
    View      uiRoot;

    public TaskViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        uiRoot = view.findViewById(R.id.content);
        uiBackground = view.findViewById(R.id.bg_image);
        uiExecutorAvatar = view.findViewById(R.id.executor_avatar);
        uiExecutorName = view.findViewById(R.id.executor_name);
        uiTaskName = view.findViewById(R.id.task_name);
        uiType = view.findViewById(R.id.type);
        uiPriority = view.findViewById(R.id.priority);
        uiTime = view.findViewById(R.id.time);
    }
}
