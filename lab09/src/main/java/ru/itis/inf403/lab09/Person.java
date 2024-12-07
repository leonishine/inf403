package ru.itis.inf403.lab09;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    public Person () {}

    public Person (String lastName, String firstName, String middleName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + " " + age;
    }
}
