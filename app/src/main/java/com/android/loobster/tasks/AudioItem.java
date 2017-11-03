package com.android.loobster.tasks;

import android.support.annotation.NonNull;
import android.view.View;

import com.android.loobster.R;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class AudioItem extends AbstractSectionableItem<AudioViewHolder, DateHeaderItem> {

    private final Audio audio;

    public AudioItem(@NonNull Audio audio, DateHeaderItem header) {
        super(header);
        this.audio = audio;
        setDraggable(true);
    }

    @Override public boolean equals(Object o) {
        return false;
    }

    @Override public int getLayoutRes() {
        return R.layout.voice_message_view;
    }

    @Override public AudioViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new AudioViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, AudioViewHolder holder, int position, List payloads) {

    }
}
