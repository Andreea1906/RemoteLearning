package com.nagarro.remotelearning.week8p3.service;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NagarroPriorityQueueManagerTest {

    private NagarroPriorityQueueManager<Integer> priorityQueue;

    @org.junit.Before
    public void setUp() throws Exception {
        priorityQueue = new NagarroPriorityQueueManager<>(10);
    }

    @org.junit.Test
    public void sort() {
        List<Integer> inputList = Arrays.asList(5, 3, 7, 1);
        List<Integer> expectedSorted = Arrays.asList(1, 3, 5, 7);

        List<Integer> sortedList = priorityQueue.sort(inputList);

        assertEquals(expectedSorted, sortedList);
    }
}