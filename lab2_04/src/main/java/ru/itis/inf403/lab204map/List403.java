package ru.itis.inf403.lab204map;

public interface List403<T> extends Iterable<T> {
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

    /**
     * Сортировка списка (asc = true по возрастанию)
     * @param asc
     */
}
