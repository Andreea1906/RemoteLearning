package com.nagarro.remotelearning.week12p2.util;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> zipIterator = new Iterator<T>() {
            boolean fromFirst = true;

            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements to zip.");
                }
                T element = fromFirst ? firstIterator.next() : secondIterator.next();
                fromFirst = !fromFirst;
                return element;
            }
        };

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(zipIterator, 0), false);
    }
}

