package ru.itis.inf403.lab205;

public class Main {
    public static void main(String[] args) {
        //List403Impl<Integer> list = new List403Impl<>();
        Menu menu = new Menu();

        for(String n : menu) {
            System.out.println(n);
        }
    }
}
