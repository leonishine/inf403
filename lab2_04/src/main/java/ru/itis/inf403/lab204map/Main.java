package ru.itis.inf403.lab204map;

public class Main {
    public static void main(String[] args) {
        Map403<Integer, String> map = new MapImpl<>();

        map.put(1,"Beb");
        map.put(2,"Bob");
        map.put(3,"Bib");
        map.put(1,"Bub");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.size());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Bib"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("\nТест итератора:");
        for (Map403.Entry<Integer, String> entry : map) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();


        System.out.println(map.remove(2));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.isEmpty());
        map.clean();



    }
}
