package ru.itis.inf403.lab13.enum1;

import ru.itis.inf403.lab13.enum2.Color;

public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Бондаренко", "Иван", "Сергеевич", Gender.Male);

        System.out.println(person);

    }
}
