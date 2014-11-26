package com.homeTask.task08;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Olaf on 25.11.2014.
 */
public class SetClass implements SetUtils{
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {
        if (collection == null || set == null) throw new NullPointerException();
        TreeSet<String> mySet = new TreeSet<>();
        TreeSet<Integer> myIntSet = new TreeSet<>();
        mySet.addAll(set);
        myIntSet.addAll(collection);
        return mySet;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if (integers.length == 0) throw new NullPointerException();
        HashSet<Integer> myHSet = new HashSet<>();
        for (int i = 0; i < integers.length; i++){
            myHSet.add(integers[i]);
        }
        return myHSet;
    }
}
