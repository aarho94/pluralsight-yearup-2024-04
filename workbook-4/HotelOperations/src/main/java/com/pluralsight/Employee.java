package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime; // Variable to store punch-in time

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0;
        this.startTime = 0.0; // Initializing start time to 0.0
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void punchIn(double time) {
        startTime = time;
        System.out.println("Punched in at " + time + " hours.");
    }

    public void punchOut(double time) {
        if (startTime != 0.0) {
            double endTime = time;
            double hoursWorkedToday = endTime - startTime;
            if (hoursWorkedToday > 0) {
                hoursWorked += hoursWorkedToday;
                System.out.println("Punched out at " + time + " hours. Total hours worked today: " + hoursWorkedToday);
            } else {
                System.out.println("Invalid punch out time. Please punch in first.");
            }
            startTime = 0.0;
        } else {
            System.out.println("Please punch in before punching out.");
        }
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }
}


