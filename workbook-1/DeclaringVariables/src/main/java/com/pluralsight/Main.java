package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // declare variables for each of the following:

        // a vehicle identification number in the range 1000000 - 9999999
        int vin = 1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1));
        System.out.println("Vehicle Identification Number" + vin);


        // a vehicle make /model (i.e. Ford Explorer)
        String vehicleMakeModel = "Ford Explorer";
        System.out.println("Vehicle Make/Model" + vehicleMakeModel);

        // a vehicle color
        String vehicleColor = "Red";
        System.out.println("Vehicle Color" + vehicleColor);

        // whether the vehicle has a towing package
        boolean hasTowingPackage = true;
        System.out.println("Has Towing Package" + hasTowingPackage);

        // an odometer reading
        int odometerReading = 50000;
        System.out.println("Odometer Reading:" + odometerReading);

        // a price
        double price = 25000.50;
        System.out.println("Vehicle Price" + price);

        // a quality rating (A, B, or C)
        char qualityRating = 'A';
        System.out.println("Quality Rating:" + qualityRating);

        // a phone number
        String phoneNumber = "123-456-7890";
        System.out.println("Phone Number:" + phoneNumber);

        // a social security number
        String socialSecurityNumber = "123-45-6789";
        System.out.println("Social Security Number:" + socialSecurityNumber);

        // a zip code
        String zipCode = "12345";
        System.out.println("Zip Code:" + zipCode);
    }
}
