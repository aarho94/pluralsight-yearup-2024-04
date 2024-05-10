package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest
{

    @Test
    public void testPunchInAndOut()
    {
        // Arrange
        Employee employee = new Employee(1, "John Doe", "Engineering", 25.0);

        // Act
        employee.punchIn(10.0); // Punch in at 10:00 am
        employee.punchOut(12.5); // Punch out at 12:30 pm

        // Assert
        assertEquals(2.5, employee.getHoursWorked(), 0.01); // Assert total hours worked
    }
}