package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i <= 20; i++) { // Loop runs 20 times
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);

            int sum = roll1 + roll2;
            System.out.println("Sum: " + sum);

            switch (sum) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }
        }

        // Print the counters after the loop
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);
    }
}
