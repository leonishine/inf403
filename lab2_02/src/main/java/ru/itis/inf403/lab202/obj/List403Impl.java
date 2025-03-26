package ru.itis.inf403.lab202.obj;

public class List403Impl implements List403 {
    private Object[] values;
    private int size;

    public List403Impl() {
        this.size = 0;
        this.values = new Object[10];
    }

    @Override
    public void add(Object element) {
        if (size >= values.length) {
            grow();
        }
        values[size++] = element;
    }

    @Override
    public void add(Object element, int position) throws IndexOutOfBoundsException {
        if (position > size || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == values.length) {
            grow();
        }
        for (int i = size; i >= position; i--) {
            values[i+1] = values[i];
        }
        values[position] = element;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        return values[position];
    }

    @Override
    public Object remove(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = values[position];
        for (int i = position; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size] = null;
        size--;
        return temp;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(values[i].toString()).append(" ");
        }
        return stringBuilder.toString();
    }

    private void grow() {
        Object[] newValues = new Object[(int) (size*1.5)];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }
}
