package ru.itis.inf403.lab2_08_io.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50000);

            //Чтение данных от сервера
            InputStream is = socket.getInputStream();
            //Передаем данные серверу
            OutputStream os = socket.getOutputStream();

            //Отправляем
            os.write("Hello from client".getBytes());
            os.flush();

            //читаем послание от сервера
            byte[] buffer = new byte[100];
            int r = is.read(buffer);
            System.out.println(new String(buffer, 0, r));


            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
