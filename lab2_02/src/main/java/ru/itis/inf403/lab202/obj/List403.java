package ru.itis.inf403.lab202.obj;

public interface List403 {
    /**
     * Метод добавляет элемент в конец списка
     * @param element
     */
    void add(Object element);

    /**
     * Метод добавляет элемент в указанную позицию
     * @param element
     * @param position
     */
    void add(Object element, int position) throws IndexOutOfBoundsException;

    /**
     * Удаляет элемент в указанной позиции и возвращает его
     * @param position
     * @return
     */
    Object remove(int position) throws IndexOutOfBoundsException;

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
    Object get(int position) throws IndexOutOfBoundsException;

    /**
     * Сортировка списка (asc = true по возрастанию)
     * @param asc
     */
}
