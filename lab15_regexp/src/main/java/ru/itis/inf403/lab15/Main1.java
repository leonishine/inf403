package ru.itis.inf403.lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Задача 1.");
        Pattern pattern1 = Pattern.compile("(" + Service.makePattern("я") + "|" + Service.makePattern("мне") + "|" + Service.makePattern("моё") + ")");
        File file = new File("pushkin.txt");
        Service.match(pattern1, file);
        System.out.println();

        System.out.println("Задача 2.");
        Pattern pattern2 = Pattern.compile(Service.makePattern("мор(е|я|ю|ем)"));
        Service.match(pattern2, file);
        System.out.println();

        System.out.println("Задача 3.");
        Pattern pattern3 = Pattern.compile(Service.makePattern("муза"));
        Service.match(pattern3, file);
        System.out.println();

        System.out.println("Задача 4.");
        Pattern pattern4 = Pattern.compile(Service.makePattern("любовь"));
        Service.match(pattern4, file);
        System.out.println();

        System.out.println("Задача 5.");
        Pattern pattern5 = Pattern.compile(Service.makePattern("ветры .* веют"));
        Service.match(pattern5, file);
        System.out.println();

        System.out.println("Задача 6.");
        Pattern pattern6 = Pattern.compile(Service.makePattern("друзья"));
        Service.match(pattern6, file);
        System.out.println();

        System.out.println("Задача 7.");
        Pattern pattern7 = Pattern.compile(Service.makePattern("поэт"));
        Service.match(pattern7, file);
        System.out.println();

        System.out.println("Задача 8.");
        Pattern pattern8 = Pattern.compile(Service.makePattern("взор .* (вс|)тревожит"));
        Service.match(pattern8, file);
        System.out.println();
    }
}