package ru.itis.inf403.lab17;

import java.util.Scanner;

public class MainUserAutorisation {
    public static void main(String[] args) {
        User user1 = new User(UserRole.ADMIN, "@krutoySuhar1234567890", "0987654321-poiuytrewq");
        User user2 = new User(UserRole.USER, "Ivanov_ivan_ivanovich_24681632", "zxcvbnmasdfghjkl1234567890[]");

        User[] users = {user1, user2};
        boolean flag = true;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String log = sc.nextLine();
                if (log.equals("exit")) {
                    break;
                }
                String pas = sc.nextLine();
                UserRole role = UserService.userCheck(log, pas, users);

                if (role == UserRole.ADMIN) {
                    System.out.println("ADMIN:\n" +
                            "1. File\n" +
                            "2. Create new user\n" +
                            "3. exit");
                    break;
                }
                if (role == UserRole.USER) {
                    System.out.println("USER:\n" +
                            "1. File\n" +
                            "2. Get play list\n" +
                            "3. exit");
                    break;
                }
                if (role == null) {
                    System.out.println("Неверный логин или пароль");
                    //Я решил следовать изначальному ТЗ и не создавать отдельный Exception, а просто прописать этот вариант в коде
                }
            } catch (WrongLoginException e) {
                System.out.println("Логин должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
            } catch (WrongPasswordException e) {
                System.out.println("Пароль должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
            }
        }
    }


}
