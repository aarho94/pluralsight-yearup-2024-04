package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    public List<Person> findPeople(List<Person> people, String name) {
        // search for people by first name
        // return a new List<Person> with the search results
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Person> findPeople(List<Person> people, int age) {
        // search for people by age
        // return a new List<Person> with the search results
        return people.stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

    public int calculateAverageAge(List<Person> people) {
        // calculate the average age of the people
        return (int) people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public int findOldestAge(List<Person> people) {
        // find the oldest age in the list of people
        return people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
    }

    public int findYoungestAge(List<Person> people) {
        // find the youngest age in the list of people
        return people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);
    }

    public List<Person> sortYoungestFirst(List<Person> people) {
        // sort the list of people by age, youngest first
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
    }

    public List<Person> sortOldestFirst(List<Person> people) {
        // sort the list of people by age, oldest first
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .collect(Collectors.toList());
    }

    public List<Employee> createEmployees(List<Person> people) {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return people.stream()
                .map(person -> new Employee(person.getFirstName(), person.getLastName(), person.getAge() * 3000))
                .collect(Collectors.toList());
    }
}

