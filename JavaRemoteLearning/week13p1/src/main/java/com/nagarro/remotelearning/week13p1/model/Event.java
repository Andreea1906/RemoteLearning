package com.nagarro.remotelearning.week13p1.model;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String summary;
    private String location;

    public Event(LocalDateTime startTime, LocalDateTime endTime, String summary, String location) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.summary = summary;
        this.location = location;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getSummary() {
        return summary;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", summary='" + summary + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

