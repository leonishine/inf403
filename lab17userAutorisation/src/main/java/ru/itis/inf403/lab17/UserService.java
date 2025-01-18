package ru.itis.inf403.lab17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    public static UserRole userCheck(String log, String pas, User[] users) throws WrongPasswordException, WrongPasswordException {
        Pattern logReg = Pattern.compile("[a-zA-Z0-9@._-]{20,}");
        Pattern pasReg = Pattern.compile("[a-zA-Z{}\\[\\](),.;&?!_\\-+0-9]{8,}");

        Matcher matcherLog = logReg.matcher(log);
        if (!(matcherLog.find())) {
            throw new WrongLoginException();
        }
        Matcher matcherPas = pasReg.matcher(pas);
        if (!(matcherPas.find())) {
            throw new WrongPasswordException();
        }

        for (int i = 0; i < users.length; i++) {
            if ((log.equals(users[i].getLogin())) && (pas.equals(users[i].getPassword()))) {
                return users[i].getUserRole();
            }
        }

        return null;

    }
}
