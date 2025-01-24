package ru.itis.inf403.lab17Abstract;

public class CalculateIntegralTrapezoid extends AbstractCalculateIntegral{
    private static final int N = 1000;

    public CalculateIntegralTrapezoid(double a, double b, Function function) {
        super(a, b, function);
    }

    @Override
    public double get() {
        double sum = 0;
        double h = (b - a) / N;
        for (int i = 0; i < N; ++i) {
            sum += h * function.calculate(a + h * i) + h * Math.abs((function.calculate(a + h * (i + 1)) - function.calculate(a + h * i)))/2;
        }
        return sum;
    }
}
