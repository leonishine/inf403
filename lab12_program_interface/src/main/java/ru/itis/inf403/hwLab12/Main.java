package ru.itis.inf403.hwLab12;

public class Main {
    public static void main(String[] args) {
        List2Direction list = new List2Direction();

        list.add(new Apple("Красный", 70, "Антоновка", 120));
        list.add(new Apple("Красный", 74, "Гренни", 100));
        list.add(new Apple("Желтый", 72, "Голден", 130));
        list.add(new Apple("Зеленый", 68, "Башкирская красавица", 110));
        list.add(new Apple("Зеленый", 74, "Голден", 150));
        list.add(new Apple("Красный", 72, "Гала", 120));
        list.add(new Apple("Желтый", 70, "Спартан", 125));
        list.add(new Apple("Зеленый", 71, "Антоновка", 115));

        list.print();

        list.add(new Apple("Зеленый", 70, "Антоновка", 115), 3);
        list.print();

        System.out.println(list.pop());
        System.out.println(list.remove(2));

        list.print();

        list.printReverse();

        list.sort();

        list.print();

    }
}
