package ru.itis.inf403.lab18;

public class BinaryTreeRight extends BinaryTree{
    public void travers(Node node) {
        if (node == null) return;
        System.out.print(node.value());
        travers(node.left());
        travers(node.right());
    }
}
