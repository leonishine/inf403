package ru.itis.inf403.hwLab12;

public class Node {
    public Apple value;
    public Node prev;
    public Node next;

    public Node(Apple value) {
        this.value = value;
    }

    public Node(Apple value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
