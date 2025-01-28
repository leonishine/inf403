package ru.itis.inf403.lab18;

public class Node implements ITree {
    private int value;
    private Node left;
    private Node right;

    public Node() {}

    public Node(int n) {
        this.value = n;
        this.left = null;
        this.right = null;
    }

    public int value() {
        return value;
    }
    public Node left() {
        return left;
    }
    public Node right() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
