package ru.itis.inf403.lab2_08_io.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(50000);
            //Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();
            //Дождались клиента
            //Читаем данные от клиента
            InputStream is = clientSocket.getInputStream();
            //Передаем данные клиенту
            OutputStream os = clientSocket.getOutputStream();
            byte[] buffer = new byte[100];
            //читаем послание от клиента
            int r = is.read(buffer);
            System.out.println(new String(buffer, 0, r));
            //Отправляем клиенту
            os.write("Hello from server".getBytes());
            os.flush();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
