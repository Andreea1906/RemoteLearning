package com.nagarro.remotelearning.week9p2.model;

public class ThreadRaceCompetitor extends Thread {
    private int id;
    private ThreadRaceContext raceContext;

    public ThreadRaceCompetitor(int id, ThreadRaceContext raceContext) {
        this.id = id;
        this.raceContext = raceContext;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        raceContext.finishRace(id);
    }
}

