package ru.itis.inf403.lab2_09_med;

import java.awt.image.Raster;
import java.util.function.Function;

public class Node {
    private Integer value;
    private Node left;
    private Node right;
    // Возвращает либо left либо right
    private Function<Row, Node> function;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Function<Row, Node> getFunction() {
        return function;
    }

    public void setFunction(Function<Row, Node> function) {
        this.function = function;
    }
}
