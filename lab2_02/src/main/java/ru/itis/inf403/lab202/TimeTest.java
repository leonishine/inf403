package ru.itis.inf403.lab202;

import ru.itis.inf403.lab202.List403;
import ru.itis.inf403.lab202.linkedListGen.List403ImplLinked;
import ru.itis.inf403.lab202.listGen.List403Impl;

import java.util.Random;

public class TimeTest {
    public static void main(String[] args) {
        List403Impl<Integer> list1 = new List403Impl<>();
        List403ImplLinked<Integer> list2 = new List403ImplLinked<>();
        System.out.println(testAdd(list1));
        System.out.println(testAdd(list2));
        System.out.println(testRemove(list1));
        System.out.println(testRemove(list2));
    }

    public static long testAdd(List403<Integer> list) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }
        long end = System.nanoTime();
        return (end - start);
    }

    public static long testRemove(List403<Integer> list) {
        long start = System.nanoTime();
        Random random = new Random();
        int len = list.size();
        for (int i = 0; i < 10000; i++) {
            list.remove(random.nextInt(len--));
        }
        long end = System.nanoTime();
        return (end - start);
    }
}
