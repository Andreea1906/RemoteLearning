package com.nagarro.remotelearning.week9p3;

import com.nagarro.remotelearning.week9p3.model.ThreadRelayRaceContext;

public class Main {
    public static void main(String[] args) {

        int numTeams = 10;
        int numCompetitorsPerTeam = 4;
        ThreadRelayRaceContext raceContext = new ThreadRelayRaceContext(numTeams, numCompetitorsPerTeam);
        raceContext.startRace();
    }
}
