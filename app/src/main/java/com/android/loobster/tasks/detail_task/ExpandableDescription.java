package com.android.loobster.tasks.detail_task;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.loobster.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ExpandableDescription extends AppCompatActivity {

    private Activity rootView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_description);

    ExpandableTextView expTv1 = (ExpandableTextView)rootView.findViewById(R.id.description)
        .findViewById(R.id.expand_text_view);

        expTv1.setText(getString(R.string.description_text));
}
}
