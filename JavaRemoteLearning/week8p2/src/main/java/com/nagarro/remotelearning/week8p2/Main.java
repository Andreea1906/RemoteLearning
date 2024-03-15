package com.nagarro.remotelearning.week8p2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();

        List<Integer> numbers = Arrays.asList(4, 2, 7, 1, 9, 5);
        System.out.println("Before sorting: " + numbers);
        bubbleSorter.bubbleSort(numbers);
        System.out.println("After sorting: " + numbers);
    }
}

