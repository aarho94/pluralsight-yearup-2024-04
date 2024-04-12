package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // chocolate costs 2.99 per bar
        // I have 20 dollars
        // buy 4 bars of chocolate
        // how much change will I get back?


// declare your variables
        double balance = 20;
        double priceOfChocolate = 2.99;
        int quantityBought = 4;
        double totalcost;
        double changeGiven;
// write the logic
        totalCost = price0fChocolate * quantityBought;
        changeGiven = balance - totalCost;
// display the output
        System.out.println();
        System.out.println("Chocolate Bar: $ " + price0fChocolate);
        System.out.println("Quantity: † + quantityBought);
        System.out.println("- ") ;
        System.out.println("Total: $ " + totalCost);
        System.out.println("Paid: $ " + balance) ;
        System.out.println("Change Given: $ " + changeGiven);

    }

    public static void question2()
    {
        // calculate the perimeter of a circle
        // for a circle with a radius of 12

        // variables
        double radius = 12;
        double perimeter;

        // calculate
        perimeter = 2 * Math.PI * radius;

        // output
        System.out.println("The perimeter of a circle with a radius of 12 is" + radius + "is" + perimeter);



    }

}

