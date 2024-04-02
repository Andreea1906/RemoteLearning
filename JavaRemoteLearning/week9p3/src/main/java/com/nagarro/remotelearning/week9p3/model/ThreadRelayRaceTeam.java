package com.nagarro.remotelearning.week9p3.model;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRaceTeam extends Thread {
    private int id;
    private ThreadRelayRaceContext raceContext;
    private List<ThreadRelayRaceCompetitor> teamMembers;

    public ThreadRelayRaceTeam(int id, ThreadRelayRaceContext raceContext) {
        this.id = id;
        this.raceContext = raceContext;
        this.teamMembers = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            ThreadRelayRaceCompetitor competitor = new ThreadRelayRaceCompetitor(i, "Team " + id, raceContext);
            teamMembers.add(competitor);
        }
    }

    @Override
    public void run() {
        for (ThreadRelayRaceCompetitor competitor : teamMembers) {
            competitor.start();
            try {
                competitor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        raceContext.finishTeam(id);
    }
}
