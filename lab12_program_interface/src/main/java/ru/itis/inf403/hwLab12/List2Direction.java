package ru.itis.inf403.hwLab12;

public class List2Direction {

    private Node first;
    private Node last;
    private int size;

    public void add(Apple value) {
        Node newNode = new Node(value);
        if (first == null) {
            this.first = newNode;
            this.last = newNode;
            ++size;
        } else {
            this.last.next = newNode;
            newNode.prev = this.last;
            this.last = newNode;
            ++size;
        }
    }

    public boolean add(Apple value, int pos) {
        if (pos <= size && -1 <= pos) {
            Node newNode = new Node(value);
            if (first == null) {
                this.first = newNode;
                this.last = newNode;
            } else {
                Node current = first;
                for (int i = 0; i < pos; i++) {
                    current = current.next;
                }
                Node prevPosNode = current;
                Node nextPosNode = current.next;

                prevPosNode.next = newNode;
                newNode.prev = prevPosNode;
                newNode.next = nextPosNode;
                nextPosNode.prev = newNode;
            }
            return true;
        } else {
            return false;
        }
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            Node current = first;
            for (int j = 0; j < size; j++) {
                if (current.value.compare(current.next.value) < 0) {
                    Node extra = new Node(current.value, current.prev, current.next);
                    current.prev = current.next;
                    current.next = current.next.next;
                    current = current.prev;
                    current.next = current.prev;
                    current.prev = extra.prev;
                }
                //current = current.next;
            }
        }
    }

    public String toString() {
        String s = "";
        Node current = first;
        for (int i = 0; i < size; i++) {
            s = s + current.value;
            current = current.next;
        }
        s = s + current.value;
        return s;
    }

    public Apple pop() {
        last = last.prev;
        last.next = null;
        return null;
    }

    public Apple remove(int pos) {
        Node current = first;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        //current.next.next = null;
        //current.next.prev = null;
        current.next = current.next.next;
        current = current.next;
        current.prev = current.prev.prev;

        return null;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public void printReverse() {
        String s = "";
        Node current = first;
        for (int i = size - 1; i >= 0; i--) {
            s = s + current.value;
            current = current.prev;
        }
        s = s + current.value;
        System.out.println(s);
    }


}
