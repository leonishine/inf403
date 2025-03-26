package ru.itis.inf403.lab202.setGen;
import java.lang.reflect.Array;

public class Set403Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Set403Impl<Integer> set = new Set403Impl<>();
        set.add(5);
        set.add(2);
        set.add(3);
        System.out.println(set);

        set.add(5);
        System.out.println(set);

        System.out.println(set.contains(2));

        set.remove(2);
        System.out.println(set);

        System.out.println(set.contains(2));

        System.out.println(set.size());

        Integer[] arr = set.getAll(new Integer[0]);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }
}
