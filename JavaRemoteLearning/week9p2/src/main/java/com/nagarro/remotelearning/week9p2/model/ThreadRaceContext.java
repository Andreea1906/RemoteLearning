package com.nagarro.remotelearning.week9p2.model;

import java.util.ArrayList;
import java.util.List;

public class ThreadRaceContext {
    private List<Integer> finishedCompetitors;

    public ThreadRaceContext() {
        this.finishedCompetitors = new ArrayList<>();
    }

    public synchronized void finishRace(int competitorId) {
        finishedCompetitors.add(competitorId);
        System.out.println("Competitor " + competitorId + " finished the race.");
        if (finishedCompetitors.size() == 10) {
            notifyAll();
        }
    }

    public synchronized void printResults() {
        System.out.println("Final race ranking:");
        for (int i = 0; i < finishedCompetitors.size(); i++) {
            System.out.println((i + 1) + ". Competitor " + finishedCompetitors.get(i));
        }
    }
}

