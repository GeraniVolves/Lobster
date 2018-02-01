package com.android.loobster.tasks.note;

import android.support.annotation.NonNull;
import android.view.View;

import com.android.loobster.R;
import com.android.loobster.tasks.DateHeaderItem;
import com.android.loobster.tasks.models.Note;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class NoteItem extends AbstractSectionableItem<NoteViewHolder, DateHeaderItem> {

    private Note note;

    public NoteItem(@NonNull Note note, DateHeaderItem header) {
        super(header);
        this.note = note;
        setDraggable(true);
    }

    @Override public boolean equals(Object o) {
        return note.equals(o);
    }

    @Override public int getLayoutRes() {
        return R.layout.note_swipeable_item;
    }

    @Override public NoteViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new NoteViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, NoteViewHolder holder, int position, List payloads) {
        holder.uiText.setText(note.getText());
    }
}
