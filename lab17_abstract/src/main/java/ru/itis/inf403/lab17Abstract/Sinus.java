package ru.itis.inf403.lab17Abstract;

public class Sinus implements Function {
    @Override
    public double calculate(double x) {
        return Math.sin(x);
    }
}
