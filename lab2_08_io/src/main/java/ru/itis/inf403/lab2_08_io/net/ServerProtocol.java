package ru.itis.inf403.lab2_08_io.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProtocol {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(50000);
            //Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();
            //Дождались клиента
            //Читаем данные от клиента
            DataInputStream is = new DataInputStream(clientSocket.getInputStream());
            //Передаем данные клиенту
            DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());

            //читаем послание от клиента
            int size = is.readInt();
            byte[] buffer = new byte[size];
            is.read(buffer);
            System.out.println(new String(buffer));
            //Отправляем клиенту
            String message = "Hello from сервер";
            size = message.getBytes().length;

            os.writeInt(size); //условно заголовок пакета
            os.write(message.getBytes()); //тело пакета
            os.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
