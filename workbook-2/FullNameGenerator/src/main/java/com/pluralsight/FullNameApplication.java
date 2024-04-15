package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // prompt user to enter name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your middle name (if you do not have a middle name, leave blank): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter suffix (if applicable): ");
        String suffix = scanner.nextLine().trim();

        // build the name
        StringBuilder nameComponents = new StringBuilder();
        nameComponents.append(firstName);
        nameComponents.append(" ");
        if (!middleName.isEmpty()) {
            nameComponents.append(middleName);
            nameComponents.append(" ");
        }
        nameComponents.append(lastName);
        if (!suffix.isEmpty()) {
            nameComponents.append(", ");
            nameComponents.append(suffix);
        }

        String fullName = nameComponents.toString();

        // print the name
        System.out.println("Full name: " + fullName);

        scanner.close();
    }

}