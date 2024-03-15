package com.nagarro.remotelearning.week8p1;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class GenericCollectionImpl<T> implements GenericCollection<T> {
    private List<T> list;

    public GenericCollectionImpl() {
        list = new ArrayList<>();
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        for (T item : c) {
            if (!list.contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<T> c) {
        for (T item : c) {
            list.add(item);
        }
        return true;
    }
}

