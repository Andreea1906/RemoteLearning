package com.nagarro.remotelearning.week7p4;

import com.nagarro.remotelearning.week7p4.model.Train;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.nagarro.remotelearning.week7p4.service.TrainManager.generateRandomRunningDays;
import static com.nagarro.remotelearning.week7p4.service.TrainManager.generateRandomTrain;

public class Main {
    public static void main(String[] args) {
        Map<Train, List<Integer>> trainSchedule = new HashMap<>();
        Random random = new Random();

        Train trainToTest = null;
        List<Integer> runningDaysForTestTrain = null;


        for (int i = 0; i < 9999; i++) {
            Train train = generateRandomTrain();
            List<Integer> runningDays = generateRandomRunningDays(random);
            trainSchedule.put(train, runningDays);


            if (i == 9998) {
                trainToTest = train;
                runningDaysForTestTrain = runningDays;
            }
        }

        testHashMapPerformance(trainSchedule, trainToTest, runningDaysForTestTrain);

    }

    private static void testHashMapPerformance(Map<Train, List<Integer>> trainSchedule, Train trainToTest, List<Integer> runningDaysForTestTrain) {
        long startTime = System.nanoTime();

        List<Integer> runningDays = trainSchedule.get(trainToTest);

        long endTime = System.nanoTime();

        System.out.println("Running days for train " + trainToTest + ": " + runningDays);
        System.out.println("Lookup time: " + (endTime - startTime) + " nanoseconds");
    }
}
