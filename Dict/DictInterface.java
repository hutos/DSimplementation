package com.pekopeko.Dict;

import java.util.Iterator;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/10/2017:43
 * @Description <p>Dict Interface</p>
 */
public interface DictInterface<K, V> {
    public void add(K key, V value);
    public V remove(K key);
    public V getValue(K key);
    public boolean contains(K key);
    public Iterator<K> getKeyIterator();
    public Iterator<V> getValueIterator();
    public boolean isEmpty();
    public Integer getSize();
    public void clear();
}
