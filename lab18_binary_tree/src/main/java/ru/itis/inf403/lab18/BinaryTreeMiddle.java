package ru.itis.inf403.lab18;

public class BinaryTreeMiddle extends BinaryTree {
    public void travers(Node node) {
        if (node == null) return;
        travers(node.left());
        travers(node.right());
        System.out.print(node.value());
    }
}
