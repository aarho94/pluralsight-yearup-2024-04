package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> findPeople(List<Person> people, String name) {
        // search for people by first name
        // return a new List<Person> with the search results
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeople(List<Person> people, int age) {
        // search for people by age
        // return a new List<Person> with the search results
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() == age) {
                result.add(person);
            }
        }
        return result;
    }

    public int calculateAverageAge(List<Person> people) {
        // calculate the average age of the people
        if (people.isEmpty()) return 0;

        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum / people.size();
    }

    public int findOldestAge(List<Person> people) {
        // find the oldest age in the list of people
        int maxAge = 0;
        for (Person person : people) {
            maxAge = Math.max(maxAge, person.getAge());
        }
        return maxAge;
    }

    public int findYoungestAge(List<Person> people) {
        // find the youngest age in the list of people
        if (people.isEmpty()) return 0;

        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            minAge = Math.min(minAge, person.getAge());
        }
        return minAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people) {
        // sort the list of people by age, youngest first
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        return people;
    }

    public List<Person> sortOldestFirst(List<Person> people) {
        // sort the list of people by age, oldest first
        people.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        return people;
    }

    public List<Employee> createEmployees(List<Person> people) {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        List<Employee> employees = new ArrayList<>();
        for (Person person : people) {
            // Assuming Employee class constructor requires firstName, lastName, age, and salary
            employees.add(new Employee(person.getFirstName(), person.getLastName(), person.getAge(), person.getAge() * 3000));
        }
        return employees;
    }
}


