package ru.itis.inf403.lab13.enum2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    private Gender gender;
    private Color color;

    public Person(String lastName, String firstName, String middleName, Gender gender, Color color) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.color = color;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " + gender + ", " + color.rusName;
    }

}
