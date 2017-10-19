package com.android.loobster.tasks;


import android.view.View;

import com.android.loobster.R;
import com.android.loobster.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;

public class DateHeaderItem extends AbstractHeaderItem<DateHeaderHolder> {

    private final static SimpleDateFormat WEEKDAY_MONTH_DAY_DATE_FORMAT = new SimpleDateFormat("EEEE, MMM dd", Locale.US);
    private final static SimpleDateFormat MONTH_DAY_DATE_FORMAT         = new SimpleDateFormat("MMM dd", Locale.US);
    private final static SimpleDateFormat WEEKDAY_DATE_FORMAT           = new SimpleDateFormat("EEEE", Locale.US);

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
            holder.uiSecondaryText.setText(WEEKDAY_MONTH_DAY_DATE_FORMAT.format(date));
        } else if (com.android.loobster.utils.DateUtils.isTomorrow(time)){
            holder.uiMainText.setText(R.string.tomorrow);
            holder.uiSecondaryText.setText(WEEKDAY_MONTH_DAY_DATE_FORMAT.format(date));
        }
        else {
            holder.uiMainText.setText(WEEKDAY_DATE_FORMAT.format(date));
            holder.uiSecondaryText.setText(MONTH_DAY_DATE_FORMAT.format(date));
        }
    }

}
