package ru.itis.inf403.lab2_06_2_func_style;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(8);
        list.add(0);
        list.add(12);

//        list.sort(new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        list.sort((o1, o2) -> o1-o2);

        list.forEach(System.out::println);

    }
}
