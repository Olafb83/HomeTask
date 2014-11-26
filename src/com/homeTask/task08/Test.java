package com.homeTask.task08;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Olaf on 25.11.2014.
 */
public class Test {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collection<Integer> collection1 = new ArrayList<>();
        collection.add(2);
        collection.add(8);
        collection.add(4);
        collection.add(7);
        collection.add(1);
        collection.add(9);
        collection.add(5);
        collection1.add(9);
        collection1.add(7);
        collection1.add(2);
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);

        CollectionClass collect = new CollectionClass();
        System.out.println(collect.union(collection, collection1));
        System.out.println(collect.unionWithoutDuplicates(collection, collection1));//WTF?? Why sorted?
        System.out.println(collect.intersection(collection, collection1));
        System.out.println(collect.intersectionWithoutDuplicates(collection, collection1));

        ListClass list = new ListClass();
        String[] str = new String[] {"a", "f", "r", "d"};
        System.out.println(list.asList(str));
        System.out.println(list.sortedList(list.asList(str)));// Why duplicate??

        SetClass set = new SetClass();
        //int[] a = new int[]{5, 7, 3, 5, 8, 1, 0, 4};
        //set.customOrderSet(a);

    }
}
