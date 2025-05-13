package ru.itis.inf403.lab2_08_io.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMessenger {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50000);

            //Чтение данных от сервера
            DataInputStream is = new DataInputStream(socket.getInputStream());
            //Передаем данные серверу
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());

            //Отправляем
            while (true) {
                Scanner sc = new Scanner(System.in);
                String message = sc.nextLine();
                int size = message.getBytes().length;

                os.writeInt(size); //условно заголовок пакета
                os.write(message.getBytes()); //тело пакета
                os.flush();
                if (message.equals("exit")) {
                    break;
                }

                //читаем послание от клиента
                size = is.readInt();
                byte[] buffer = new byte[size];
                is.read(buffer);
                message = new String(buffer);
                System.out.println(message);


                if (message.equals("exit")) {
                    break;
                }
            }

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
