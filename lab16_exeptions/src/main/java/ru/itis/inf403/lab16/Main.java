package ru.itis.inf403.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num = 0;
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            try {
                num = InputModule.input();
                flag = false;

                num = 1 / (int) num;
            } catch (InputMismatchException e) {
                System.out.println("Аничетотфакт что там double");
            } catch (ArithmeticException e) {
                System.out.println("Ты адекват? Какой ноль, на ноль делить нельзя");
                flag = true;
            } catch (NotPositiveNumber e) {
                System.out.println("Будь позитивнее ^_^");
                flag = true;
            }
        }

        System.out.println(num);
    }

}
