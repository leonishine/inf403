package ru.itis.inf403.lab204map;

import ru.itis.inf403.lab204map.Set403;

import java.lang.reflect.Array;

public class Set403Impl<T> implements Set403<T> {
    private Object[] values;
    private int size;

    public Set403Impl() {
        values = new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T element) {
        if (!contains(element)) {
            if (size >= values.length) {
                grow();
            }
            values[size++] = element;
        }
    }

    @Override
    public T[] getAll(T[] c) {
        T[] newVal = (T[]) Array.newInstance(c.getClass().getComponentType(), size);
        for (int i = 0; i < size; i++) {
            newVal[i] = (T)values[i];
        }
        return newVal;
    }

    @Override
    public T remove(T element) {
        Object[] newValues = new Object[size];
        int j = 0;
        T answer = null;
        for (int i = 0; i < size; i++) {
            if (!values[i].equals(element)) {
                newValues[j] = values[i];
                j++;
            } else {
                answer = element;
            }
        }
        values = newValues;
        size--;
        return answer;
    }

    private void grow() {
        Object[] newValues = new Object[(int) (size*1.5)];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(values[i].toString()).append(" ");
        }

        return stringBuilder.toString();
    }
}
