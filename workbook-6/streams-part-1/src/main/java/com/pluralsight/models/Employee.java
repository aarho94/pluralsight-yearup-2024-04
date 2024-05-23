package com.pluralsight.models;

public class Employee extends Person
{
    private final int age;
    private final String lastName;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary)
    {
        super(firstName, lastName, age);
        this.FirstName(firstName);
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    private void FirstName(String firstName)
    {
        
    }

    public Employee(String firstName, String lastName, int i)
    {
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
