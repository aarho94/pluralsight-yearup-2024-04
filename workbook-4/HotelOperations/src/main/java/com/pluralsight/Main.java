package com.pluralsight;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room room1 = new Room(2, 100.0, false, true);

        System.out.println("Room Information:");
        System.out.println("Number of Beds: " + room1.getNumberOfBeds());
        System.out.println("Price per Night: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        Reservation reservation1 = new Reservation("double", 3, true);

        System.out.println("\nReservation Information:");
        System.out.println("Room Type: " + reservation1.getRoomType());
        System.out.println("Price per Night: $" + reservation1.getPricePerNight());
        System.out.println("Number of Nights: " + reservation1.getNumberOfNights());
        System.out.println("Is Weekend: " + reservation1.isWeekend());
        System.out.println("Total Reservation Cost: $" + reservation1.getReservationTotal());

        Employee employee1 = new Employee(1, "John Doe", "Engineering", 25.0);

        System.out.println("\nEmployee Information:");
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Pay Rate: $" + employee1.getPayRate() + " per hour");
        System.out.print("Enter punch-in time (e.g., 10.0 for 10:00 am): ");
        double punchInTime = scanner.nextDouble();
        employee1.punchIn(punchInTime);
        System.out.print("Enter punch-out time (e.g., 12.5 for 12:30 pm): ");
        double punchOutTime = scanner.nextDouble();
        employee1.punchOut(punchOutTime);
        System.out.println("Total Hours Worked: " + employee1.getHoursWorked() + " hours");
        System.out.println("Hours Worked: " + employee1.getHoursWorked() + " hours");
        System.out.println("Total Pay: $" + employee1.getTotalPay());
    }
}

