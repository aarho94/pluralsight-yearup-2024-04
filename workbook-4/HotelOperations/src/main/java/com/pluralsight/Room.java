package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    public void checkIn() {
        if (!isOccupied()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Room checked in successfully.");
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    public void checkOut() {
        if (isOccupied()) {
            System.out.println("Room checked out successfully.");
        } else {
            System.out.println("Room is not occupied.");
        }
    }

    public void cleanRoom() {
        if (isOccupied() && isDirty()) {
            isDirty = false;
            System.out.println("Room cleaned successfully.");
        } else {
            System.out.println("Room is either not occupied or not dirty.");
        }
    }
}
