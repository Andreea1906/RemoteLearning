package com.nagarro.remotelearning.week9p2;

import com.nagarro.remotelearning.week9p2.model.ThreadRaceCompetitor;
import com.nagarro.remotelearning.week9p2.model.ThreadRaceContext;

public class Main {
    public static void main(String[] args) {
        int numCompetitors = 10;
        ThreadRaceContext raceContext = new ThreadRaceContext(numCompetitors);

        for (int i = 0; i < numCompetitors; i++) {
            ThreadRaceCompetitor competitor = new ThreadRaceCompetitor(raceContext);
            raceContext.addCompetitor(competitor);
        }

        raceContext.startRace();
    }
}
