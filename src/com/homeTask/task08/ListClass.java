package com.homeTask.task08;

import com.sourceit.hometask.collections.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListClass implements ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> aList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++){
            aList.add(strings[i]);
        }
        return aList;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
        List<T> sList = new ArrayList<>(list);
        Collections.sort(sList, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
        return sList;
    }
}
