package ru.itis.inf403.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputModule {
    public static double input() throws InputMismatchException, ArithmeticException, NotPositiveNumber {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num > 0) {
            return num;
        } else {
            throw new NotPositiveNumber();
        }
    }
}
