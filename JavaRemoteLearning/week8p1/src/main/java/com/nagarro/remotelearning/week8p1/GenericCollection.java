package com.nagarro.remotelearning.week8p1;

import java.util.Collection;

interface GenericCollection<T> {
    boolean containsAll(Collection<T> c);

    boolean addAll(Collection<T> c);
}
