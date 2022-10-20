package com.pekopeko.Dict;

import java.util.Iterator;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/10/2017:47
 * @Description <p>字典数组</p></p>
 */
public class ArrayDict<K,V> implements DictInterface<K,V > {


    @Override
    public void add(K key, V value) {

    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public V getValue(K key) {
        return null;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        return null;
    }

    @Override
    public Iterator<V> getValueIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Integer getSize() {
        return null;
    }

    @Override
    public void clear() {

    }
}
