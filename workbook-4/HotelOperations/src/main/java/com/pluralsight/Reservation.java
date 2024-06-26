package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        if (roomType.equalsIgnoreCase("king")) {
            this.pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.pricePerNight = 124.00;
        } else {
            this.pricePerNight = 0.0;
        }

        if (isWeekend) {
            this.pricePerNight *= 1.10;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}

