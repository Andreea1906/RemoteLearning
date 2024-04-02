package com.nagarro.remotelearning.week9p3.model;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRace {
    private ThreadRelayRaceContext raceContext;
    private List<ThreadRelayRaceTeam> teams;

    public ThreadRelayRace() {
        this.raceContext = new ThreadRelayRaceContext();
        this.teams = new ArrayList<>();
    }

    public void startRace() {
        for (int i = 1; i <= 10; i++) {
            ThreadRelayRaceTeam team = new ThreadRelayRaceTeam(i, raceContext);
            teams.add(team);
            team.start();
        }

        for (ThreadRelayRaceTeam team : teams) {
            try {
                team.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        raceContext.printResults();
    }
}

