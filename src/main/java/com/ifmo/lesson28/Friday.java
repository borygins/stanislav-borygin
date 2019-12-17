package com.ifmo.lesson28;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.ArrayList;
import java.util.List;

public class Friday implements TemporalQuery<Boolean> {


    public Friday() {

    }

    public static void main(String[] args) {
        Friday f13 = new Friday();
        LocalDate date = LocalDate.of(2018,1,1);
        List<LocalDate> dates = new ArrayList<>();
        for (int i = 0; i < 365; i++) {
            if (f13.queryFrom(date)){
                dates.add(date);
            }
            date = date.plusDays(1);
        }
        System.out.println(dates);
    }

    @Override
    public Boolean queryFrom(TemporalAccessor date) {

        int dayow = date.get(ChronoField.DAY_OF_WEEK);
        int day = date.get(ChronoField.DAY_OF_MONTH);
        if (dayow == DayOfWeek.FRIDAY.getValue() && day == 13)
            return true;

        return false;
    }
}
