package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line here
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}



