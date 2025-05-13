package ru.itis.inf403.lab204map;

public class MainMap {
    public static void main(String[] args) {
        Map403<Integer, Integer> map403 = new MapImpl<>();
        map403.put(1, 2);
        map403.put(2, 4);
        map403.put(3, 7);

        List403<Object> list403 = map403.map(x -> (x + " руб."));
        list403.forEach(System.out::println);
    }
}
