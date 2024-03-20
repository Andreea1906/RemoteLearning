package com.nagarro.remotelearning.week9p3.model;

public class ThreadRelayRaceContext {
    private final ThreadRelayRaceTeam[] teams;
    private final int[] rankings;
    private int nextRank;

    public ThreadRelayRaceContext(int numTeams, int numCompetitorsPerTeam) {
        this.teams = new ThreadRelayRaceTeam[numTeams];
        this.rankings = new int[numTeams];
        this.nextRank = 0;
        for (int i = 0; i < numTeams; i++) {
            teams[i] = new ThreadRelayRaceTeam("Team " + (i + 1), numCompetitorsPerTeam, this);
        }
    }

    public synchronized void finishCompetitor(ThreadCompetitor competitor) {

        if (competitor.getCompetitorNumber() == 1) {
            int rank = nextRank++;
            rankings[rank] = Integer.parseInt(competitor.getTeamName());
            System.out.println(competitor.getTeamName() + " finished in position " + (rank + 1));

            if (nextRank == teams.length) {
                System.out.println("Final Rankings:");
                for (int i = 0; i < teams.length; i++) {
                    System.out.println("Position " + (i + 1) + ": " + rankings[i]);
                }
            }
        }
    }

    public void startRace() {
        for (ThreadRelayRaceTeam team : teams) {
            team.startRace();
        }
    }
}
