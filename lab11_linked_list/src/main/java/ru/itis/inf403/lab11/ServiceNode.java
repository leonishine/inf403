package ru.itis.inf403.lab11;
import java.util.Random;

public class ServiceNode {
    Random random = new Random();
    public static Node findLast(Node first) {
        Node currentLast = first;
        while (currentLast.next != null) {
            currentLast = currentLast.next;
        }
        return currentLast;
    }

    public void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);
        last.next = newElement;
    }

    public void addRandom(Node first) {
        Node last = findLast(first);
        Node newElement = new Node(random.nextInt(100));
        last.next = newElement;
    }

    public void randomList(Node first, int len) {
        for (int i = 0; i < len; i++) {
            addRandom(first);
        }
    }

    public int find(Node first, int n) {
        Node current = first;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void listOut(Node first) {
        Node current = first;
        System.out.print(current.value + " ");
        while (current.next != null) {
            current = current.next;
            System.out.print(current.value + " ");
        }
    }

    public void listOutReversed(Node first) {
        Node current = first;
        if (current.next != null) {
            listOutReversed(current.next);
        }
        System.out.print(current.value + " ");
    }
}
