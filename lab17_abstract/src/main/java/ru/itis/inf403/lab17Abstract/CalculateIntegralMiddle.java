package ru.itis.inf403.lab17Abstract;

public class CalculateIntegralMiddle extends AbstractCalculateIntegral{
    private static final int N = 1000;

    public CalculateIntegralMiddle(double a, double b, Function function) {
        super(a, b, function);
    }

    @Override
    public double get() {
        return (b - a) * (function.calculate((b-a)/2));
    }
}