package ru.itis.inf403.lab18;

public abstract class BinaryTree {
//1. Описать интерфейс ITree (left(), right(), int value())
//    2. Описать абстрактный класс BinaryTree
//    бинарное дерево в котором значение левого потомка <= узла
//    значение правого потомка > значению узла
//    абстрактный метод traversalTree()
//    метод ввода дерева через аргумент-массив целых чисел
//3. реализовать три класса
//- обход слева
//- обход справа
//- центральный обход

    public abstract void travers(Node node);

    public static void addLeaf(int n, Node node) {
        if (n > node.value()) {
            if (node.right() == null) {
                Node usel = new Node(n);
                node.setRight(usel);
                return;
            } else {
                addLeaf(n, node.right());
            }
        } else {
            if (node.left() == null) {
                Node usel = new Node(n);
                node.setLeft(usel);
                return;
            } else {
                addLeaf(n, node.left());
            }
        }
    }

    public static void addTree(int[] arr, Node root) {
        for (int i = 0; i < arr.length; ++i) {
            addLeaf(arr[i], root);
        }
    }
}
