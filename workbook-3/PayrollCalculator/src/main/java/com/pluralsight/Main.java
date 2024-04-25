package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the name of the employee file to process
        System.out.print("Enter the name of the employee file to process (e.g., employees.csv): ");
        String inputFile = scanner.nextLine();

        // Prompt the user for the name of the payroll file to create
        System.out.print("Enter the name of the payroll file to create (e.g., payroll-sept-2023.csv): ");
        String outputFile = scanner.nextLine();

        try (FileReader fileReader = new FileReader("Files/" + inputFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             PrintWriter printWriter = new PrintWriter(new FileWriter("Files/" + outputFile))) {

            // Write header to the output file
            printWriter.println("id|name|gross pay");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);
                double grossPay = hoursWorked * payRate;

                // Write employee data to the output file in CSV format
                printWriter.printf("%s|%s|%.2f%n", id, name, grossPay);
            }

            System.out.println("Payroll report has been written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}




