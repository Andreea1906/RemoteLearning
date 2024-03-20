package com.nagarro.remotelearning.week9p2.service;

public class RaceNumberGenerator {
    private static int nextRaceNumber = 1;
    private static final Object lock = new Object();

    public static int getNextRaceNumber() {
        synchronized (lock) {
            return nextRaceNumber++;
        }
    }
}
