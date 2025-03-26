package ru.itis.inf403.lab202.obj;

public class List403ObjectTest {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        List403Impl list = new List403Impl();

        list.add(1);
        list.add("2");
        list.add(3);

        System.out.println(list);

        System.out.println((int) (list.get(0)) + (int) (list.get(1)));
    }
}
