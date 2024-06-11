package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option!= 0) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        displayProducts();
                        break;
                    case 2:
                        displayCustomers();
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void displayProducts() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = "ArFuckallb0y$";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products")) {

            System.out.println("Option 1: Stacked Information");
            while (rs.next()) {
                int productId = rs.getInt("ProductID");
                String productName = rs.getString("ProductName");
                double unitPrice = rs.getDouble("UnitPrice");
                int unitsInStock = rs.getInt("UnitsInStock");

                System.out.println("Product Id: " + productId);
                System.out.println("Name: " + productName);
                System.out.println("Price: " + unitPrice);
                System.out.println("Stock: " + unitsInStock);
                System.out.println("--------------------");
            }

            System.out.println("\nOption 2: Rows of Information");
            System.out.println("Id\tName\tPrice\tStock");
            rs.beforeFirst(); // reset the result set
            while (rs.next()) {
                int productId = rs.getInt("ProductID");
                String productName = rs.getString("ProductName");
                double unitPrice = rs.getDouble("UnitPrice");
                int unitsInStock = rs.getInt("UnitsInStock");

                System.out.println(productId + "\t" + productName + "\t" + unitPrice + "\t" + unitsInStock);
            }
        }
    }

    private static void displayCustomers() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = "ArFuckallb0y$";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country")) {

            System.out.println("Customers:");
            while (rs.next()) {
                String contactName = rs.getString("ContactName");
                String companyName = rs.getString("CompanyName");
                String city = rs.getString("City");
                String country = rs.getString("Country");
                String phone = rs.getString("Phone");

                System.out.println("Contact Name: " + contactName);
                System.out.println("Company Name: " + companyName);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println("Phone: " + phone);
                System.out.println("--------------------");
            }
        }
    }
}
