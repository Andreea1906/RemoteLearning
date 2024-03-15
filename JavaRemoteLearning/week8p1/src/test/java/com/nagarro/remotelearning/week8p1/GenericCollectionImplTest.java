package com.nagarro.remotelearning.week8p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GenericCollectionImplTest {

    private GenericCollectionImpl<String> stringCollection;
    private GenericCollectionImpl<Integer> integerCollection;

    @BeforeEach
    void setUp() {
        stringCollection = new GenericCollectionImpl<>();
        integerCollection = new GenericCollectionImpl<>();
    }

    @Test
    void containsAllWithStringCollection() {
        stringCollection.addAll(Arrays.asList("apple", "banana", "orange"));
        Assertions.assertTrue(stringCollection.containsAll(Arrays.asList("apple", "banana")));
        Assertions.assertFalse(stringCollection.containsAll(Arrays.asList("apple", "pear")));
    }

    @Test
    void containsAllWithIntegerCollection() {
        integerCollection.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertTrue(integerCollection.containsAll(Arrays.asList(1, 2, 3)));
        Assertions.assertFalse(integerCollection.containsAll(Arrays.asList(6, 7, 8)));
    }

    @Test
    void addAllWithStringCollection() {
        Assertions.assertTrue(stringCollection.addAll(Arrays.asList("apple", "banana", "orange")));
        Assertions.assertTrue(stringCollection.containsAll(Arrays.asList("apple", "banana", "orange")));
    }

    @Test
    void addAllWithIntegerCollection() {
        Assertions.assertTrue(integerCollection.addAll(Arrays.asList(1, 2, 3, 4, 5)));
        Assertions.assertTrue(integerCollection.containsAll(Arrays.asList(1, 2, 3, 4, 5)));
    }

}

