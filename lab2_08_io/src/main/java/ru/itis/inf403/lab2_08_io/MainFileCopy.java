package ru.itis.inf403.lab2_08_io;

import java.io.*;
import java.util.Scanner;

public class MainFileCopy {
    private String inputFile;
    private String outputFile;
    public static void main(String[] args) throws FileNotFoundException {
        MainFileCopy mainFileCopy = new MainFileCopy();
        mainFileCopy.input();
        mainFileCopy.copy();
    }

    private void input() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        inputFile = sc.nextLine();
        System.out.println("Введите имя копии: ");
        outputFile = sc.nextLine();
        File check = new File(inputFile);
        if (!(check.isFile() && check.exists())) {
            throw new RuntimeException("Неверное имя файла");
        }
    }

    private void copy() {
        try (InputStream fis = new FileInputStream(inputFile);
             OutputStream fos = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[1024];
            int r;
            while ((r = fis.read(buffer)) > -1) {
                fos.write(buffer,0,r);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
