package ru.itis.inf403.lab2_08_io.net;

import java.io.*;
import java.net.Socket;

public class ClientProtocol {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50000);

            //Чтение данных от сервера
            DataInputStream is = new DataInputStream(socket.getInputStream());
            //Передаем данные серверу
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());

            //Отправляем

            String message = "Hello from client";
            int size = message.getBytes().length;

            os.writeInt(size); //условно заголовок пакета
            os.write(message.getBytes()); //тело пакета
            os.flush();

            //читаем послание от клиента
            size = is.readInt();
            byte[] buffer = new byte[size];
            is.read(buffer);
            System.out.println(new String(buffer));

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
