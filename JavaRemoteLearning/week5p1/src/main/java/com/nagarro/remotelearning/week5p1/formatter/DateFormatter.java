package com.nagarro.remotelearning.week5p1.formatter;

import com.nagarro.remotelearning.week5p1.model.Day;
import com.nagarro.remotelearning.week5p1.model.Month;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public String formatDate(String date) throws Exception {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int dayOfWeek = localDate.getDayOfWeek().getValue();
        int monthOfYear = localDate.getMonth().getValue();

        Day day = Day.SUNDAY;
        Month month = Month.JANUARY;

        return day.getDayAtIndex(dayOfWeek) + " " + month.getMonthAtIndex(monthOfYear) + " "
                + localDate.getYear();
    }
}
