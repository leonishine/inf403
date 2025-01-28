package ru.itis.inf403.lab18;

public class MainTree {
    public static void main(String[] args) {
        Node root = new Node(7);
        BinaryTree.addTree(new int[]{1, 4, 6, 3, 5, 2, 9}, root);

        BinaryTreeLeft left = new BinaryTreeLeft();
        BinaryTreeMiddle mid = new BinaryTreeMiddle();
        BinaryTreeRight right = new BinaryTreeRight();
        BinaryTreeRightRight righty = new BinaryTreeRightRight();

        System.out.println("Обход слева");
        left.travers(root);
        System.out.println();
        System.out.println("Обход справа");
        right.travers(root);
        System.out.println();
        System.out.println("Обход по центру");
        mid.travers(root);
        System.out.println();
        System.out.println("То, что для меня логичнее назвать обходом справа (отличается от того что на доске)");
        righty.travers(root);
    }
}
