package ru.itis.inf403.lab2_10_test;

import java.util.Collections;

public class MathUtil {
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * @return >0, a > b; 0, a == b; <0, a < b;
     *
     */
    public static int compare(int a, int b) {
//        if (a > b) return 1;
//        else if (a == b) return 0;
//        else return -1;


        return a - b;
    }

    public static int divide(int a, int b) throws IllegalAccessException {
        if (b == 0)
            throw new IllegalAccessException("Знаменатель не 0!");
        return a/b;
    }

    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        //сортировка вставками
        return array;
    }
}
