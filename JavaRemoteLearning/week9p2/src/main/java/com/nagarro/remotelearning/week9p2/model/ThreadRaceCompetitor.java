package com.nagarro.remotelearning.week9p2.model;

import com.nagarro.remotelearning.week9p2.service.RaceNumberGenerator;

public class ThreadRaceCompetitor implements Runnable{
    private final int raceNumber;
    private final ThreadRaceContext raceContext;

    public ThreadRaceCompetitor(ThreadRaceContext raceContext) {
        this.raceNumber = RaceNumberGenerator.getNextRaceNumber();
        this.raceContext = raceContext;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 5000));
            raceContext.finishRace(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getRaceNumber() {
        return raceNumber;
    }
}
