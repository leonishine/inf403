package ru.itis.inf403.lab15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("I love Java");

        //наличие фразы по шаблону
        System.out.println(matcher.find());

        System.out.println(matcher.start());
        System.out.println(matcher.end());

    }
}
