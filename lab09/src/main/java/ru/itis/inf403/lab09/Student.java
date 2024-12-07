package ru.itis.inf403.lab09;

public class Student extends Person {
    private String groupName;
    private int rating;

    public Student() {}

    public Student(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }

    public Student(String lastName, String firstName, String middleName, int age, String groupName, int rating) {
        super(lastName, firstName, middleName, age);
        this.groupName = groupName;
        this.rating = rating;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
