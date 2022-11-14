package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (long i = 0; i <1000_000_000L ; i++) {
        }
        long end = System.currentTimeMillis();
        System.out.println(start-end);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println(formatted);

        Calendar calendar = new GregorianCalendar();
        calendar.set(2022,11,14);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName()+" "+timeZone.getID());
    }
}
