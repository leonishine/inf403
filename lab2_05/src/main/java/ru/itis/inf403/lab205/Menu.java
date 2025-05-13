package ru.itis.inf403.lab205;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Menu implements Iterable<String> {
    private String[] dishes;

    public Menu() {
        dishes = new String[] {"Рыба", "Мясо", "Картошка", "Макароны"};
    }

    public Iterator<String> iterator() {
        return new MenuIterator();
    }



    private class MenuIterator implements Iterator<String> {
        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            System.out.println("currentIndex " + currentIndex);
            return currentIndex < dishes.length - 1;
        }

        @Override
        public String next() throws NoSuchElementException {
            if (currentIndex == dishes.length - 1) {
                throw new NoSuchElementException();
            }
            return dishes[++currentIndex];
        }
    }


}
