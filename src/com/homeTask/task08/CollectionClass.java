package com.homeTask.task08;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olaf on 25.11.2014.
 */
public class CollectionClass implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> collection, Collection<Integer> collection1)
            throws NullPointerException {
        // can be performed a separate method to all override methods
        if (collection.isEmpty() || collection1.isEmpty()) throw  new NullPointerException();
        Collection<Integer> unColl = new ArrayList<>();
        unColl.addAll(collection);
        unColl.addAll(collection1);
        return unColl;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection, Collection<Integer> collection1)
            throws NullPointerException {
        if (collection.isEmpty() || collection1.isEmpty()) throw  new NullPointerException();
        return null;
        // I do not understand a task... I must use randomize?
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection, Collection<Integer> collection1)
            throws NullPointerException {
        if (collection.isEmpty() || collection1.isEmpty()) throw  new NullPointerException();
        Collection<Integer> interColl = new ArrayList<>();
        interColl.addAll(collection);
        interColl.retainAll(collection1);
        return interColl;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1)
            throws NullPointerException {
        if (collection.isEmpty() || collection1.isEmpty()) throw  new NullPointerException();
        Set<Integer> unOutColl = new HashSet<>();
        unOutColl.addAll(collection);
        unOutColl.addAll(collection1);
        return unOutColl;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1)
            throws NullPointerException {
        if (collection.isEmpty() || collection1.isEmpty()) throw  new NullPointerException();
        Set<Integer> interOutColl = new HashSet<>();
        interOutColl.addAll(collection);
        interOutColl.retainAll(collection1);
        return interOutColl;
    }
}
