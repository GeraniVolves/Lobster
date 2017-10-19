package com.android.loobster.utils;

public class DateUtils {

    public static boolean isTomorrow(long time) {
        return isToday(time - 1000 * 60 * 60 * 24);
    }

    public static boolean isToday(long time) {
        return android.text.format.DateUtils.isToday(time);
    }
}
