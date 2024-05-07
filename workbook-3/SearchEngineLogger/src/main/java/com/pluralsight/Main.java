package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void logAction(String action) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("logs.txt", true))) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            writer.println(formattedTime + " " + action);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Log launching the application
        logAction("launch");

        System.out.println("Welcome to the Search Engine!");
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();

        // Log searching for a term
        logAction("search : " + searchTerm);

        // Simulating search process...
        System.out.println("Searching for '" + searchTerm + "'...");

        // Simulated search results...
        System.out.println("Search results for '" + searchTerm + "':");
        System.out.println("1. Result 1");
        System.out.println("2. Result 2");
        System.out.println("3. Result 3");

        // Simulating exiting the application...
        System.out.println("Exiting the application.");

        // Log exiting the application
        logAction("exit");

        scanner.close();
    }
}
