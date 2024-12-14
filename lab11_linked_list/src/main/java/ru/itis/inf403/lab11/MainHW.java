package ru.itis.inf403.lab11;

public class MainHW {
    public static void main(String[] args) {
        ServiceNode sn = new ServiceNode();
        Node first = new Node(1);
        sn.randomList(first, 30);
        System.out.println(sn.find(first,17));
        sn.listOut(first);
        System.out.println();
        sn.listOutReversed(first);
    }
}
