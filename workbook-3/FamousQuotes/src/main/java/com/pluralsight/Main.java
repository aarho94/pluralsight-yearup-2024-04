package com.pluralsight;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        String[] quotes = {
                "If you never bleed, you're never gonna grow. - Taylor Swift",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "It does not matter how slowly you go as long as you do not stop. - Confucius",
                "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "Strive not to be a success, but rather to be of value. - Albert Einstein",
                "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
                "The journey of a thousand miles begins with one step. - Lao Tzu",
                "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                "Stay hungry, stay foolish. - Steve Jobs"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a number from 1 to 10 to display a quote:");
        try {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();

            if (userInput >= 1 && userInput <= 10) {
                System.out.println("Quote " + userInput + ": " + quotes[userInput - 1]);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number 1-10.");
        }
    }
}
