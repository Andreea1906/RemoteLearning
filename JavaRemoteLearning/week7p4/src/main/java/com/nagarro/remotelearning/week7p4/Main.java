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

        for (int i = 0; i < 10000; i++) {
            Train train = generateRandomTrain();
            List<Integer> runningDays = generateRandomRunningDays(random);
            trainSchedule.put(train, runningDays);
        }

        Train trainToTest = new Train(123, "Express", 5);
        List<Integer> runningDays = trainSchedule.get(trainToTest);
        System.out.println("Running days for train " + trainToTest + ": " + runningDays);
    }
}
