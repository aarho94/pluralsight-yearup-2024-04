package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(2);
    }
    {
        Car fastRide = new Car();
        fastRide.setColor("Black");
        fastRide.setFuelCapacity(15);
        fastRide.setNumberOfPassengers(2);
    }
    {
        SemiTruck haulThis = new SemiTruck();
        haulThis.setColor("White");
        haulThis.setFuelCapacity(80);
        haulThis.setNumberOfPassengers(1);
    }
    {
        Hovercraft waterBug = new Hovercraft();
        waterBug.setColor("Green");
        waterBug.setFuelCapacity(30);
        waterBug.setNumberOfPassengers(6);
    }
}