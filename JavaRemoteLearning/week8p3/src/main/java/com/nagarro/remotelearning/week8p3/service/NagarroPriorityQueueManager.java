package com.nagarro.remotelearning.week8p3.service;

import com.nagarro.remotelearning.week8p3.model.NagarroPriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class NagarroPriorityQueueManager<E extends Comparable<E>> {

    private NagarroPriorityQueue<E> priorityQueue;

    public NagarroPriorityQueueManager(int capacity) {
        priorityQueue = new NagarroPriorityQueue<>(capacity);
    }

    public List<E> sort(List<E> inputList) {
    List<E> sortedList = new ArrayList<>(inputList.size());

    for (E element : inputList) {
        priorityQueue.insert(element);
    }

    while (!priorityQueue.isEmpty()) {
        sortedList.add(priorityQueue.remove());
    }

    return sortedList;
    }

}
