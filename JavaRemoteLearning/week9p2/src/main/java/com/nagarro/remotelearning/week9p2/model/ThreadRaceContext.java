package com.nagarro.remotelearning.week9p2.model;

import com.nagarro.remotelearning.week9p2.model.ThreadRaceCompetitor;

public class ThreadRaceContext {
    private final ThreadRaceCompetitor[] competitors;
    private final int[] rankings;
    private int nextRank;

    public ThreadRaceContext(int numCompetitors) {
        competitors = new ThreadRaceCompetitor[numCompetitors];
        rankings = new int[numCompetitors];
        nextRank = 0;
    }

    public synchronized void finishRace(ThreadRaceCompetitor competitor) {

        int rank = nextRank++;
        rankings[rank] = competitor.getRaceNumber();

        if (nextRank == competitors.length) {
            System.out.println("Final Rankings:");
            for (int i = 0; i < competitors.length; i++) {
                System.out.println("Position " + (i + 1) + ": Competitor " + rankings[i]);
            }
        }
    }

    public void addCompetitor(ThreadRaceCompetitor competitor) {
        competitors[competitor.getRaceNumber() - 1] = competitor;
    }

    public void startRace() {
        for (ThreadRaceCompetitor competitor : competitors) {
            new Thread(competitor).start();
        }
    }
}
