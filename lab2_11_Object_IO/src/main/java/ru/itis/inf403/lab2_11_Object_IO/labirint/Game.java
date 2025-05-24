package ru.itis.inf403.lab2_11_Object_IO.labirint;

import java.io.*;
import java.util.Arrays;

public class Game implements Serializable {
    public char[][] map;
    public int steps;
    public boolean exited;
    public int x;
    public int y;


    public Game(int enter, int size) {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = '.';
            }
        }

        steps = 0;
        exited = false;
        x = enter;
        y = 0;
    }
}
