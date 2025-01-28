package ru.itis.inf403.lab17Abstract;

public class Main {
    public static void main(String[] args) {
        CalculateIntegralLeft calcLeft = new CalculateIntegralLeft(0, Math.PI, new Sinus());
        CalculateIntegralRight calcRight = new CalculateIntegralRight(0, Math.PI, new Sinus());
        CalculateIntegralTrapezoid calcTrapezoid = new CalculateIntegralTrapezoid(0, Math.PI/2, new Sinus());
        CalculateIntegralMiddle calcMiddle = new CalculateIntegralMiddle(0, Math.PI, new Sinus());
        System.out.println(calcLeft.get());
        System.out.println(calcRight.get());
        System.out.println(calcTrapezoid.get());
        System.out.println(calcMiddle.get());

    }
}
