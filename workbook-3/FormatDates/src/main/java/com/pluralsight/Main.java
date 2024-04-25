package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(ZoneId.of("GMT"));
        LocalDateTime nowLocal = LocalDateTime.now();

        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        DateTimeFormatter localTimeFormatter = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");

        System.out.println("Formatted Dates (in GMT):");
        System.out.println("MM/dd/yyyy: " + now.format(dateFormatter1));
        System.out.println("yyyy-MM-dd: " + now.format(dateFormatter2));
        System.out.println("MMMM d, yyyy: " + now.format(dateFormatter3));
        System.out.println("EEEE, MMM d, yyyy HH:mm: " + now.format(dateFormatter4));

        System.out.println("\nFormatted Date (in Local Time):");
        System.out.println("5:02 on 05-Sep-2021: " + nowLocal.format(localTimeFormatter));
    }
}

