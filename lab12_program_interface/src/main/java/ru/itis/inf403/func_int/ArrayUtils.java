package ru.itis.inf403.func_int;

public class ArrayUtils {
    public static void sort(Object[] array, ICompareObject comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                //Сортируем по возрастанию цены
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    Object c = array[j];
                    array[j] = array[j+1];
                    array[j+1] = c;
                }
            }
        }
    }
    public static void print(Object[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i].toString() + " ");
        }
        System.out.println();
    }
}
