package ru.itis.inf403.lab18;

public class BinaryTreeLeft extends BinaryTree {
    public void travers(Node node) {
        if (node == null) return;
        travers(node.left());
        System.out.print(node.value());
        travers(node.right());
    }
}
