package ru.itis.inf403.lab2_08_io.net.hw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerLineMessenger {
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

            while(true) {
                //читаем послание от клиента
                int size = is.readInt();
                byte[] buffer = new byte[size];
                is.read(buffer);
                String message = new String(buffer);
                System.out.println(message);

                if (message.equals("exit")) {
                    break;
                }
                //Отправляем клиенту
                Scanner sc = new Scanner(System.in);
                message = sc.nextLine();
                size = message.getBytes().length;
                os.writeInt(size); //условно заголовок пакета
                os.write(message.getBytes()); //тело пакета
                os.flush();

                if (message.equals("exit")) {
                    break;
                }
            }
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
