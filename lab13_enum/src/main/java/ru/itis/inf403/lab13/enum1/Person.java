package ru.itis.inf403.lab13.enum1;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    private Gender gender;

    public Person(String lastName, String firstName, String middleName, Gender gender) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + gender;
    }

}
