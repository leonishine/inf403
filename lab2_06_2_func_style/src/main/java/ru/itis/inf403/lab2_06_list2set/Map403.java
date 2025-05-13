package ru.itis.inf403.lab2_06_list2set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public interface Map403<K, V> extends Iterable<Map403.Entry<K,V>> {
    void put(K key, V value);

    V get(K key);

    Set<K> keySet();

    List<V> values();

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

    <R> Set<R> map(Function<T,R> function);
}
