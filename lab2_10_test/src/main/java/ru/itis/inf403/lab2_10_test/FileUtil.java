package ru.itis.inf403.lab2_10_test;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class FileUtil {
    public static File mergeFiles(File a, File b) {

        File c = new File("abmerged.txt");
        try (InputStream fisa = new FileInputStream(a);
             InputStream fisb = new FileInputStream(b);
             OutputStream fos = new FileOutputStream(c)) {
            int r;
            while ((r = fisa.read()) > -1) {
                fos.write(r);
            }
            int q;
            while ((q = fisb.read()) > -1) {
                fos.write(q);
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static int check(String fileName) throws FileNotFoundException {

        if (fileName.isEmpty()) {
            throw new NullPointerException();
        }

        int index = -1;
        File file = new File(fileName);

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file))) {
            Stack<Character> stack = new Stack<>();
            char c;
            while ((c = (char) isr.read()) != -1) {
                index++;
                if (c == '[' || c == '{') {
                    stack.add(c);
                } else {
                    if (stack.isEmpty()) {
                        return index;
                    }
                    if (stack.peek() - c == -1 || stack.peek() - c == -2) {
                        stack.pop();
                    } else {
                        return index;
                    }
                }
            }
            if (stack.isEmpty()) return 0;
            else return index;

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
