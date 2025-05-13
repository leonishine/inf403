package ru.itis.inf403.lab2_08_io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainFileWright {
    public static void main(String[] args) {
        try (OutputStream fos = new FileOutputStream("test.txt")) {
            String[] strings = {"Тест ", "записи ", "в файл"};

            for (String s : strings) {
                fos.write(s.getBytes(StandardCharsets.UTF_8));
            }

            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
