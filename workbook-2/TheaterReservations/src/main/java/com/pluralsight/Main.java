package com.pluralsight;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
        // prompt user for full name, date of show, number of tickets
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("What date will you be coming (MM/dd/yyyy) : ");
        String date = scanner.nextLine();
        System.out.println("How many tickets would you like? ");
        int numberOfTickets = scanner.nextInt();

        // display confirmation
        String confirmation;
        if (numberOfTickets < 2){
            confirmation = String.format("1 ticket reserved for %s under %s ", date, fullName );
        } else {
            confirmation = String.format("%d tickets reserved for %s under %s", numberOfTickets, date, fullName);
        }
        System.out.println(confirmation);


        }
    }