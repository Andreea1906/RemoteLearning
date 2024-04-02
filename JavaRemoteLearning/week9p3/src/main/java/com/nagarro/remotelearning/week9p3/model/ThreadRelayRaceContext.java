package com.nagarro.remotelearning.week9p3.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadRelayRaceContext {
    private Map<String, List<Integer>> teamResults;
    private List<Integer> finishedTeams;

    public ThreadRelayRaceContext() {
        this.teamResults = new HashMap<>();
        this.finishedTeams = new ArrayList<>();
    }

    public synchronized void finishCompetitor(String teamName, int competitorNumber) {
        if (!teamResults.containsKey(teamName)) {
            teamResults.put(teamName, new ArrayList<>());
        }
        teamResults.get(teamName).add(competitorNumber);
        System.out.println("Competitor " + competitorNumber + " from team " + teamName + " finished the race.");
    }

    public synchronized void finishTeam(int teamId) {
        finishedTeams.add(teamId);
        System.out.println("Team " + teamId + " finished the race.");
        if (finishedTeams.size() == 10) {
            notifyAll();
        }
    }

    public synchronized void printResults() {
        System.out.println("Final relay race ranking:");
        for (int i = 0; i < finishedTeams.size(); i++) {
            System.out.println((i + 1) + ". Team " + finishedTeams.get(i));
        }
    }
}

