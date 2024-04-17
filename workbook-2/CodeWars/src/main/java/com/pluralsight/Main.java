package com.pluralsight;

public class Main
{
    public static double calculate(char operation, double value1, double value2) {
        switch(operation) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                if (value2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return value1 / value2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    public static void main(String[] args) {
        char operation = '+';
        double value1 = 10.0;
        double value2 = 5.0;
        double result = calculate(operation, value1, value2);
        System.out.println("Result: " + result);
    }
}
