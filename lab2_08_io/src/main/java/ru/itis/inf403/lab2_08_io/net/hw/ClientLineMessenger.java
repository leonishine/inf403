package ru.itis.inf403.lab2_08_io.net.hw;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientLineMessenger {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50000);

            //Чтение данных от сервера
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //Передаем данные серверу
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            //Отправляем
            while (true) {

                String message = sc.nextLine();

                os.write(message + "\n"); //тело пакета
                os.flush();
                if (message.equals("exit")) {
                    break;
                }

                //читаем послание от клиента
                message = is.readLine();
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
