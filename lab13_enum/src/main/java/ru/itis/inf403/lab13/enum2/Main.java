package ru.itis.inf403.lab13.enum2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Бондаренко", "Иван", "Сергеевич", Gender.valueOf("Male"), Color.White);

        System.out.println(person);

    }
}