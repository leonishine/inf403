package ru.itis.inf403.lab13.enum2;

public enum Color {
    Black("Черный"),
    White("Белый"),
    Yellow("Желтый");

    public String rusName;
    public long rgb;

    Color() {}

    Color(String rusName) {
        this.rusName = rusName;
    }
}
