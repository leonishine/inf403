package ru.itis.inf403.lab204map;

import ru.itis.inf403.lab204map.List403;
import ru.itis.inf403.lab204map.Set403;

import java.util.Iterator;
import java.util.function.Function;

public interface Map403<K, V> extends Iterable<Map403.Entry<K,V>> {
    void put(K key, V value);

    V get(K key);

    Set403<K> keySet();

    List403<V> values();

    int size();

    boolean containsKey(K key);

    boolean isEmpty();

    boolean containsValue(V value);

    V remove(K key);

    void clean();

    Iterator<Entry<K, V>> iterator();

    interface Entry<K, V> {
        void setKey(K key);
        void setValue(V value);
        K getKey();
        V getValue();
    }

    <R> List403<R> map(Function<V, R> function);
}
