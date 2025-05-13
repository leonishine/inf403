package ru.itis.inf403.lab2_06_list2set;

import java.util.Set;
import java.util.function.Function;

public interface List403<T> {
    /**
     * Метод добавляет элемент в конец списка
     * @param element
     */
    void add(T element);

    /**
     * Метод добавляет элемент в указанную позицию
     * @param element
     * @param position
     */
    void add(T element, int position) throws IndexOutOfBoundsException;

    /**
     * Удаляет элемент в указанной позиции и возвращает его
     * @param position
     * @return
     */
    T remove(int position) throws IndexOutOfBoundsException;

    /**
     * Возвращает размер списка
     * @return
     */
    int size();

    /**
     * Возвращает элемент в указанной позиции
     * @param position
     * @return
     */
    T get(int position) throws IndexOutOfBoundsException;


    <R> Set<R> map(Function<T,R> function);
}
