package com.homeTask.task08;

import com.sourceit.hometask.collections.MultiValueMap;

import java.util.*;

/**
 * Created by Olaf on 25.11.2014.
 */

public class MultiValClass<H,V> implements MultiValueMap<H,V> {

    Map<H,V> map;

    public MultiValClass() {
        this.map = new HashMap<>();
    }

    public MultiValClass(Map<H, V> map) {
        this.map = map;
    }


    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public Iterator getIterator(Object o) {
        return null;
    }

    @Override
    public Object remove(Object o) {
        return null;
    }

    @Override
    public int getCountValues(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }


    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
