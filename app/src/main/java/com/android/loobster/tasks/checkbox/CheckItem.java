package com.android.loobster.tasks.checkbox;

import android.support.annotation.NonNull;
import android.view.View;

import com.android.loobster.R;
import com.android.loobster.tasks.DateHeaderItem;
import com.android.loobster.tasks.models.ToDo;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;

public class CheckItem extends AbstractSectionableItem<CheckViewHolder, DateHeaderItem> {

    private ToDo toDo;

    public CheckItem(@NonNull ToDo toDo, DateHeaderItem header) {
        super(header);
        this.toDo = toDo;
        setDraggable(true);
    }

    @Override public boolean equals(Object o) {
        return toDo.equals(o);
    }

    @Override public int getLayoutRes() {
        return R.layout.check_box_swipeable;
    }

    @Override public CheckViewHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new CheckViewHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, CheckViewHolder holder, int position, List payloads) {
        holder.uiCheckBox.setText(toDo.getText());
    }
}
