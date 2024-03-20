package com.nagarro.remotelearning.week9p3.model;

import com.nagarro.remotelearning.week9p3.model.ThreadCompetitor;
import com.nagarro.remotelearning.week9p3.model.ThreadRelayRaceContext;

public class ThreadRelayRaceTeam {
    private final ThreadCompetitor[] competitors;
    private final String teamName;

    public ThreadRelayRaceTeam(String teamName, int numCompetitors, ThreadRelayRaceContext raceContext) {
        this.teamName = teamName;
        this.competitors = new ThreadCompetitor[numCompetitors];
        for (int i = 0; i < numCompetitors; i++) {
            competitors[i] = new ThreadCompetitor(i + 1, teamName, raceContext);
        }
    }

    public void startRace() {
        for (ThreadCompetitor competitor : competitors) {
            new Thread(competitor).start();
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public ThreadCompetitor[] getCompetitors() {
        return competitors;
    }
}
