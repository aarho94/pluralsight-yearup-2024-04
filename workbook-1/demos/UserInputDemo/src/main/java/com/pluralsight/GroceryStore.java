package com.pluralsight;

// ask user for their name
// display the product & price
// ask for quantity
// calculate total and display
// ask for money
// give change back

import javax.swing.*;

public class GroceryStore
{
    public static void main(String[] args)
    {

        // declare constants
        final String PRODUCT = "Milka Aplenilch";
        final double PRICE = 2.99;
        // input variables
        String customerName;
        int quantity;
        double cashReceived;
        // calculated
        double totalPrice;
        double changeReturned;


        // get user input
        customerName = "Bob";
        quantity = 5;

        // calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;

        // display the receipt
        System.out.println();

        String message = String.format("Total: %.2f \n", totalPrice);
        System.out.printf("Total: $ %.2f \n", totalPrice);
        System.out.printf("Cash: $ %.2f \n", cashReceived);
        System.out.printf("Change: $ %.2f \n", changeReturned);

    }
}