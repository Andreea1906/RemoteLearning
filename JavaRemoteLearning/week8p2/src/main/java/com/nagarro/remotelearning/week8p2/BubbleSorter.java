package com.nagarro.remotelearning.week8p2;

import java.util.Collection;
import java.util.List;

public class BubbleSorter {
    public <T extends Comparable<? super T>> void bubbleSort(Collection<T> collection) {
        boolean swapped = true;
        List<T> list = (List<T>) collection;
        int listSize = list.size();

        while (swapped) {
            swapped = false;
            for (int i = 1; i < listSize; i++) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    T temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            listSize--;
        }
    }
}

