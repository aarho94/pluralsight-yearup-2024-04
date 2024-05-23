package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Testing FixedList with Integer
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);

        try {
            numbers.add(43); // this line should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of items in numbers: " + numbers.getItems().size());

        // Testing FixedList with LocalDate
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        try {
            dates.add(LocalDate.now().plusDays(1)); // this line should fail
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of items in dates: " + dates.getItems().size());
    }
}