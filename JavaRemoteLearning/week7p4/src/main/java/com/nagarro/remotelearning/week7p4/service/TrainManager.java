package com.nagarro.remotelearning.week7p4.service;

import com.nagarro.remotelearning.week7p4.model.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrainManager {
    public static Train generateRandomTrain() {
        Random random = new Random();
        int trainNumber = random.nextInt(1000) + 1;
        String trainType = random.nextBoolean() ? "Express" : "Local";
        int numberOfWagons = random.nextInt(15) + 1;
        return new Train(trainNumber, trainType, numberOfWagons);
    }

    public static List<Integer> generateRandomRunningDays(Random random) {
        List<Integer> runningDays = new ArrayList<>();
        for (int i = 0; i < 365; i++) {
            if (random.nextBoolean()) {
                runningDays.add(i + 1);
            }
        }
        return runningDays;
    }
}
