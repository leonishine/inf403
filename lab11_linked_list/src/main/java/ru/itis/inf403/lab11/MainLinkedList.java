package ru.itis.inf403.lab11;

public class MainLinkedList {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(7);
        first.next = second;
        System.out.println(first.next.value);
        Node third = new Node(4);
        second.next = third;
        System.out.println(ServiceNode.findLast(first).value);
    }
}
