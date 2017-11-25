package com.android.loobster.tasks.detail_task;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class DetailTaskViewHolder extends FlexibleViewHolder {

    ImageView uiImage;
    TextView  uiFile;

    public DetailTaskViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        uiImage = view.findViewById(R.id.several_image);
        uiFile = view.findViewById(R.id.files_task);
    }
}
