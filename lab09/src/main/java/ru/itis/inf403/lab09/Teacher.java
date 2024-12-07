package ru.itis.inf403.lab09;

public class Teacher extends Person{
    private String[] disciplines;

    public Teacher() {}

    public Teacher (String lastName, String firstName, String middleName, int age, String[] disciplines) {
        super(lastName, firstName, middleName, age);
        this.disciplines = disciplines;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    public String[] getDisciplines() {
        return disciplines;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + " " + age + " " + disciplines[0];
    }
}
