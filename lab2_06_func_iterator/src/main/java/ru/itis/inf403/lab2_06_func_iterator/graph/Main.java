package ru.itis.inf403.lab2_06_func_iterator.graph;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println(graph.getGraph());
        Set<Character> set = graph.sort();
        for (Character ch : set) {
            System.out.println(ch);
        }
    }
}
