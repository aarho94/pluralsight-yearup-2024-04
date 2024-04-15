package com.pluralsight;

import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompting the user for the size of the sandwich
    System.out.println("Choose the size of the sandwich:");
    System.out.println("1) Regular: base price $5.45");
    System.out.println("2) Large: base price $8.95");
    System.out.print("Enter your choice (1 or 2): ");
    int sandwichSize = scanner.nextInt();

    // Prompting the user for their age
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    // Calculating the base price based on sandwich size
    double basePrice = 0;
    if (sandwichSize == 1) {
    basePrice = 5.45;
    } else if (sandwichSize == 2) {
    basePrice = 8.95;
    } else {
    System.out.println("Invalid choice. Please choose 1 or 2.");
    return;
}

    // Applying discount based on age
    double discountedPrice = basePrice;
    if (age <= 17) {
    // 10% discount for ages 17 and younger
    discountedPrice *= 0.9;
    } else if (age >= 65) {
    // 20% discount for ages 65 and older
    discountedPrice *= 0.8;
}

    // Displaying the cost of the sandwich
    System.out.println("Cost of the sandwich: $" + discountedPrice);

    // Closing the scanner
    scanner.close();
}
}