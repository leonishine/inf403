
package ru.itis.inf403.lab2_06_list2set;

import java.util.Set;
import java.util.function.Function;

public class MainListMap {
    public static void main(String[] args) {
        List403<String> list = new List403Impl<>();

        list.add("Роман");
        list.add("Азалия");
        list.add("Камиль");

        Set<Integer> set = list.map(
                new Function<String, Integer>() {
                    public Integer apply(String s) {
                        return s.length();
                    }
                }
        );

        set = list.map(s -> s.length());

        //set.forEach(s -> System.out.println(s));
        set.forEach(System.out::println);
    }
    /*
    изначально есть хэшмап, есть ключи - значения,
    написать метод, который берет все значения
    типа V(дженерик) и возвращает список всех этих значений,
    преобразованных в другой какой-нибудь вид(например, в тип R)
     */
}
