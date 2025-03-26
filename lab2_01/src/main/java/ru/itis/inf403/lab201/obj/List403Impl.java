package ru.itis.inf403.lab201.obj;

public class List403Impl implements List403 {
    private Integer[] values;
    private int size;

    public List403Impl() {
        this.size = 0;
        this.values = new Integer[10];
    }

    @Override
    public void add(Integer element) {
        if (size >= values.length) {
            grow();
        }
        values[size++] = element;
    }

    @Override
    public void add(Integer element, int position) throws IndexOutOfBoundsException {
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
    public Integer get(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        return values[position];
    }

    @Override
    public Integer remove(int position) throws IndexOutOfBoundsException {
        if (position > size-1 || position < 0) {
            throw new IndexOutOfBoundsException();
        }
        Integer temp = values[position];
        for (int i = position; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size] = null;
        size--;
        return temp;
    }

    @Override
    public void sort(boolean asc) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {
                if ((values[j] >= values [j+1]) == asc) {
                    Integer temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += values[i].toString() + " ";
        }
        return s;
    }

    private void grow() {
        Integer[] newValues = new Integer[(int) (size*1.5)];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }
}
