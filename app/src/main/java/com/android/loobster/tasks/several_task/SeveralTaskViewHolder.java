package com.android.loobster.tasks.several_task;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.loobster.R;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.viewholders.FlexibleViewHolder;

class SeveralTaskViewHolder extends FlexibleViewHolder {

    ImageView uiImage;
    TextView  uiFile;

    public SeveralTaskViewHolder(View view, FlexibleAdapter adapter) {
        super(view, adapter);
        uiImage = view.findViewById(R.id.several_image);
        uiFile = view.findViewById(R.id.files_task);
    }
}
