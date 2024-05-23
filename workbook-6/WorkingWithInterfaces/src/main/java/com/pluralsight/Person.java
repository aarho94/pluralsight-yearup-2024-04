package com.pluralsight;

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // First, compare by last name
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        // If last names are equal, compare by first name
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        // If first names are also equal, compare by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}


