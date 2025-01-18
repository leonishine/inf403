package ru.itis.inf403.lab17;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
