package ru.itis.inf403.lab202.setGen;

public interface Set403<T> {
    int size();

    boolean contains(T element);

    void add(T element);

    T[] getAll(T[] c);

    T remove(T element);
}
