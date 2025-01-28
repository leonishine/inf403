package ru.itis.inf403.lab18;

public class BinaryTreeRightRight extends BinaryTree {
    public void travers(Node node) {
        if (node == null) return;
        travers(node.right());
        System.out.print(node.value());
        travers(node.left());
    }
}
