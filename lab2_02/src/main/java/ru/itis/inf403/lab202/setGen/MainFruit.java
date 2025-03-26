package ru.itis.inf403.lab202.setGen;

public class MainFruit {
    public static void main(String[] args) {
        Set403Impl<Fruit> set = new Set403Impl<>();
        set.add(new Fruit("Яблоко", 5));
        set.add(new Fruit("Груша", 7));
        set.add(new Fruit("Апельсин", 2));
        set.add(new Fruit("Яблоко", 5));

        Fruit a[] = set.getAll(new Fruit[0]);

    }
}
