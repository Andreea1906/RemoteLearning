package com.nagarro.remotelearning.week9p3.model;

public class ThreadCompetitor implements Runnable {
    private final int competitorNumber;
    private final String teamName;
    private final ThreadRelayRaceContext raceContext;

    public ThreadCompetitor(int competitorNumber, String teamName, ThreadRelayRaceContext raceContext) {
        this.competitorNumber = competitorNumber;
        this.teamName = teamName;
        this.raceContext = raceContext;
    }

    @Override
    public void run() {

        try {
            Thread.sleep((long) (Math.random() * 5000));
            raceContext.finishCompetitor(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public String getTeamName() {
        return teamName;
    }
}
