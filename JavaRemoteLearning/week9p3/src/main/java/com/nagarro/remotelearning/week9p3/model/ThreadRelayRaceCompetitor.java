package com.nagarro.remotelearning.week9p3.model;

import java.util.concurrent.Semaphore;

public class ThreadRelayRaceCompetitor extends Thread {
    private int threadNumber;
    private String teamName;
    private ThreadRelayRaceContext raceContext;
    private Semaphore semaphore;

    public ThreadRelayRaceCompetitor(int threadNumber, String teamName, ThreadRelayRaceContext raceContext) {
        this.threadNumber = threadNumber;
        this.teamName = teamName;
        this.raceContext = raceContext;
        this.semaphore = new Semaphore(1);
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            Thread.sleep((long) (Math.random() * 3000));
            raceContext.finishCompetitor(teamName, threadNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
