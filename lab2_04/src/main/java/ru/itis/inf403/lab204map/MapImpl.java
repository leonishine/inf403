package ru.itis.inf403.lab204map;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class MapImpl<K,V> implements Map403<K,V>, Iterable<Map403.Entry<K,V>>  {
    private Node<K,V>[] array;
    private int capasity;
    private int size;

    private class Node<K,V> {
        Entry<K,V> value;
        Node<K,V> next;

        public Node(Entry<K,V> entry) {
            value = entry;
            next = null;
        }

        public Node(K key, V value) {
            this.value = new EntryImpl(key, value);
            this.next = null;
        }
    }

    private class EntryImpl<K,V> implements Entry<K,V> {
        private K key;
        private V value;

        public EntryImpl(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }
    }



    public MapImpl() {
        capasity = 16;
        size = 0;
        array = new Node[capasity];
    }


    @Override
    public void put(K key, V value) {
        int index = Math.abs(key.hashCode())%capasity;
        Node<K,V> temp = new Node<>(key, value);
        if (array[index] == null) {
            array[index] = temp;
        } else {
            Node current = array[index];
            while (current != null) {
                if (current.value.getKey().equals(key)) {
                    current.value.setValue(value);
                    return;
                }
                current = current.next;
            }
            current.next = temp;
        }
        size++;
    }

    @Override
    public V get(K key) {
        int index = Math.abs(key.hashCode())%capasity;
        if (array[index] == null) {
            return null;
        } else {
            Node<K,V> current = array[index];
            while (current != null) {
                if (current.value.getKey().equals(key)) {
                    return current.value.getValue();
                }
                current = current.next;
            }
        }
        return null;
    }

    @Override
    public Set403<K> keySet() {
        Set403<K> set = new Set403Impl<>();
        for (Node head : array) {
            Node current = head;
            while (current != null) {
                set.add((K) current.value.getKey());
                current = current.next;
            }
        }
        return set;
    }

    @Override
    public List403<V> values() {
        List403<V> list = new List403Impl<>();
        for (Node head : array) {
            Node current = head;
            while (current != null) {
                list.add((V) current.value.getValue());
                current = current.next;
            }
        }
        return list;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        int index = Math.abs(key.hashCode())%capasity;
        Node current = array[index];
        while (current != null) {
            if (key.equals(current.value.getKey())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsValue(V value) {
        for (Node head : array) {
            Node current = head;
            while (current != null) {
                if (value.equals(current.value.getValue())) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public V remove(K key) {
        int index = Math.abs(key.hashCode())%capasity;
        Node current = array[index];
        if (current == null) return null;
        if (key.equals(array[index].value.getKey())) {
            array[index] = null;
            size--;
            return (V) current.value.getValue();
        }
        Node prev = current;
        current = current.next;
        while (current != null) {
            if (key.equals(current.value.getKey())) {
                size--;
                prev.next = current.next;
                return (V) current.value.getValue();
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public void clean() {
        capasity = 16;
        size = 0;
        array = new Node[capasity];
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new MapImplIterator();
    }

    private class MapImplIterator implements Iterator<Entry<K,V>> {
        private int currentCell = -1;
        private Node currentNode = null;
        private int step = 0;

        @Override
        public boolean hasNext() {
            return step < size;
        }

        @Override
        public Entry<K,V> next() throws NoSuchElementException {
            if (step == size) {
                throw new NoSuchElementException();
            }
            if (currentNode == null || currentNode.next == null) {
                do {
                    currentCell++;
                    currentNode = array[currentCell];
                } while (currentNode == null);
            } else {
                currentNode = currentNode.next;
            }
            step++;


            return currentNode.value;
        }
    }

    public <R> List403<R> map(Function<V, R> function) {
        List403<R> list = new List403Impl<>();
        for (V v : values()) {
            list.add((R) function.apply(v));
        }

        return list;
    }
}
