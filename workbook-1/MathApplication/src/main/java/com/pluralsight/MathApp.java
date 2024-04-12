package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        double bobSalary;
        double garySalary;
        double highestSalary;
        bobSalary = 120000;
        garySalary = 145000;
        highestSalary = Math.max(bobSalary, garySalary);

        // code the logic to the problem here

        System.out.println("The highest salary is " + highestSalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        double carPrice;
        double truckPrice;
        double smallestValue;
        carPrice = 30000;
        truckPrice = 80000;
        smallestValue = Math.min(carPrice, truckPrice);

        // code the logic to the problem here
        System.out.println("The less expensive vehicle option costs " + smallestValue);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        // code the logic to the problem here
        System.out.println("The area of the circle is " + areaOfCircle);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double squareRoot;
        double variable;
        variable = 5.0;
        squareRoot = Math.sqrt(variable);


        // code the logic to the problem here
        System.out.println("The square root of 5.0 is " + squareRoot);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here
        int a = 80;
        int b = 40;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        // code the logic to the problem here
        System.out.println("The distance between plot points is " + c);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here
        double setVariable = -3.8;
        double absoluteVariable = Math.abs(setVariable);

        // code the logic to the problem here
        System.out.println("The absolute value is " + absoluteVariable);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here
        double randomNumber = Math.random();

        // code the logic to the problem here
        System.out.println("Random number between 0 and 1: " + randomNumber);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }
}