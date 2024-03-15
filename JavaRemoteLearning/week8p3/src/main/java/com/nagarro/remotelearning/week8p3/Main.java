package com.nagarro.remotelearning.week8p3;

import com.nagarro.remotelearning.week8p3.service.NagarroPriorityQueueManager;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NagarroPriorityQueueManager<Integer> priorityQueue = new NagarroPriorityQueueManager<>(10);

        List<Integer> inputList = Arrays.asList(5, 3, 7, 1);

        List<Integer> sortedList = priorityQueue.sort(inputList);

        System.out.println("Sorted List: " + sortedList);
    }
}
