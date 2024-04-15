package com.pluralsight;
import java.util.Scanner;
public class FullNameParser
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name
        System.out.print("Enter the name (format: 'first last' or 'first middle last'): ");
        String fullName = scanner.nextLine().trim(); // Trim leading and trailing spaces

        // Split the name into individual parts
        String[] nameParts = fullName.split("\\s+");

        // Display individual pieces of the name
        System.out.println("First Name: " + nameParts[0]);
        if (nameParts.length == 3) {
            System.out.println("Middle Name: " + nameParts[1]);
            System.out.println("Last Name: " + nameParts[2]);
        } else if (nameParts.length == 2) {
            System.out.println("Last Name: " + nameParts[1]);
        } else {
            System.out.println("Invalid name format");
        }

        scanner.close();


    }
}