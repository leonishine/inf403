package ru.itis.inf403.lab17;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
