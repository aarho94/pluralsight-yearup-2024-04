package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = "ArFuckallb0y$";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Note the updated driver class name
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            while (resultSet.next()) {
                String productName = resultSet.getString("ProductName");
                System.out.println("Product Name: " + productName);
            }

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}