package com.nagarro.remotelearning.week9p2.model;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace {
    private ThreadRaceContext raceContext;
    private List<ThreadRaceCompetitor> competitors;

    public ThreadRace() {
        this.raceContext = new ThreadRaceContext();
        this.competitors = new ArrayList<>();
    }

    public void startRace() {
        // Crearea și pornirea competitorilor
        for (int i = 1; i <= 10; i++) {
            ThreadRaceCompetitor competitor = new ThreadRaceCompetitor(i, raceContext);
            competitors.add(competitor);
            competitor.start();
        }

        // Așteptarea ca toți competitorii să termine
        for (ThreadRaceCompetitor competitor : competitors) {
            try {
                competitor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Afisarea rezultatului cursei
        raceContext.printResults();
    }
}


