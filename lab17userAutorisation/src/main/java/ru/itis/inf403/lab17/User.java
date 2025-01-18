package ru.itis.inf403.lab17;

import java.util.Scanner;

public class User {
    private UserRole  userRole;
    private String login;
    private String password;

    public User(UserRole userRole, String login, String password) {
        this.userRole = userRole;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void printMenu() {
        if (this.userRole == UserRole.ADMIN) {
            System.out.println("Меню админа");
        } else {
            System.out.println("Меню плебея");
        }
    }
}
