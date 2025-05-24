package ru.itis.inf403.lab2_08_io.net.hw;

import java.io.*;
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
            //Чтение данных от клиента
            BufferedReader is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //Передаем данные клиенту
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            while(true) {
                //читаем послание от клиента
                String message = is.readLine();
                System.out.println(message);

                if (message.equals("exit")) {
                    break;
                }
                //Отправляем клиенту

                message = sc.nextLine();
                os.write(message + "\n");
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
