package com.android.loobster.tasks;

import android.text.format.DateUtils;
import android.view.View;

import com.android.loobster.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;

public class DateHeaderItem extends AbstractHeaderItem<DateHeaderHolder> {

    private final static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMM dd", Locale.US);

    private Date date;

    public DateHeaderItem(Date date) {
        this.date = date;
    }

    @Override public boolean equals(Object o) {
        return o == this;
    }

    @Override public int getLayoutRes() {
        return R.layout.header_date;
    }

    @Override public DateHeaderHolder createViewHolder(View view, FlexibleAdapter adapter) {
        return new DateHeaderHolder(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, DateHeaderHolder holder, int position, List payloads) {
        long time = date.getTime();
        if (DateUtils.isToday(time)) {
            holder.uiMainText.setText(R.string.today);
            holder.uiSecondaryText.setText(simpleDateFormat.format(date));
        } else {
            holder.uiMainText.setText("Not Today");
        }
    }
}
