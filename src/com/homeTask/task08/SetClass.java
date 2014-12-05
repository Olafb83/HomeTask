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
        String[] strArray = set.toArray(new String[set.size()]);
        Integer[] intArray = collection.toArray(new Integer[set.size()]);
        final Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < strArray.length; i++){
            myMap.put(strArray[i], intArray[i]);
        }
        SortedSet<String> sortedSet = new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String str, String str2) {
                return myMap.get(str).compareTo(myMap.get(str2));
            }
        });
        sortedSet.addAll(set);
        return sortedSet;
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
