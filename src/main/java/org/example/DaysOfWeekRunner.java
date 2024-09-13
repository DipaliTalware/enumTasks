package org.example;

public class DaysOfWeekRunner {
    public static String weekDayOrWeekendChecker(DayOfWeek day) {
        if (day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY)) {
            return "Weekend";
        }
        return day.name();
    }
}
