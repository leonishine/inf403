package ru.itis.inf403.lab202.linkedListGen;

import ru.itis.inf403.lab202.List403;

public class List403ImplLinked<T> implements List403<T> {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public List403ImplLinked() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(T element) {
        Node temp = new Node(element, null, null);
        if (tail == null) {
            this.head = temp;
            this.tail = temp;
            size = 1;
        } else {
            tail.next = temp;
            tail.next.prev = tail;
            tail = tail.next;
            size++;
        }
    }

    @Override
    public void add(T element, int position) throws IndexOutOfBoundsException {
        Node temp = new Node(element, null, null);
        if (tail == null) {
            this.head = temp;
            this.tail = temp;
            size = 1;
        } else {
            Node current = head;
            for (int i = 0; i < position-1; i++) {
                current = current.next;
            }
            Node tempNext = current.next;
            current.next = temp;
            temp.prev = current;
            tempNext.prev = temp;
            temp.next = tempNext;

            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public T remove(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        T answer = current.element;
        if (position == 0) {
            head = current.next;
            head.prev = null;
        } else if (position == size - 1){
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return answer;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.element.toString()).append(" ");
            current = current.next;
        }
        return stringBuilder.toString();
    }
}
