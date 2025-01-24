package ru.itis.inf403.lab17Abstract;

public abstract class AbstractCalculateIntegral {
    protected double a;
    protected double b;
    protected Function function;

    public AbstractCalculateIntegral(double a, double b, Function function) {
        this.a = a;
        this.b = b;
        this.function = function;
    }

    public abstract double get();
}
