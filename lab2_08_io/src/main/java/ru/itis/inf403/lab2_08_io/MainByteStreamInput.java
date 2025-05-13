package ru.itis.inf403.lab2_08_io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainByteStreamInput {
    public static void main(String[] args) throws IOException {

        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8};
        try (InputStream bis = new ByteArrayInputStream(bytes)) {
            int r;
            while ((r = bis.read()) > -1) {
                System.out.print(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
