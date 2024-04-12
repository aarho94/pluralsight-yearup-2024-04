package com.pluralsight;

import java.util.Scanner;
public class PayrollCalculator
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Prompt the user to enter pay rate
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        // Calculate the total pay
        double totalPay = hoursWorked * payRate;

        // Display the payroll information
        System.out.println("\nPayroll Information:");
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate + " per hour");
        System.out.println("Total Pay: $" + totalPay);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

