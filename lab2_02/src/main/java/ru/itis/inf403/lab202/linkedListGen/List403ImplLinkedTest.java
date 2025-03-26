package ru.itis.inf403.lab202.linkedListGen;

public class List403ImplLinkedTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        List403ImplLinked<Integer> list = new List403ImplLinked<>();
        list.add(5);
        list.add(6);
        list.add(7,1);
        System.out.println(list);

        System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list);
    }
}
