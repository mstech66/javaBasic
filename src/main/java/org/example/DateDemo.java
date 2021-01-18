package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * New Date Time API in JAVA 8
 * 
 * Old one was not thread safe ~ meaning if there are simultaneous parallel
 * access then it may misbehave. Old API had less operations whereas New Date
 * Time API provides so many different features such as zone/location based
 * date.
 * 
 * There are two classes: Local and Zoned
 * Local for local dateTime and Zoned for Zoned DateTime Operations
 */

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println(formattedDateTime);

        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int year = dateTime.getYear();
        System.out.println("Date is " + day + " Month is " + month + " Year is " + year);

        String localDate = LocalDate.of(1947, 8, 15).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(localDate);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Asia/Jakarta");
        ZonedDateTime zDateTime = zonedDateTime.withZoneSameInstant(zoneId);
        System.out.println(zDateTime);

        Duration duration = Duration.ofHours(1);
        Duration gap = Duration.between(zonedDateTime, zDateTime);
        System.out.println(gap + " between Jakarta and India");

    }
}