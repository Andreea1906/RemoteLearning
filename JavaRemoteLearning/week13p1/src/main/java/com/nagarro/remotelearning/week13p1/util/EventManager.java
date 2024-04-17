package com.nagarro.remotelearning.week13p1.util;

import com.nagarro.remotelearning.week13p1.model.Event;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> listEventsNextWeekend() {
        LocalDate now = LocalDate.now();
        LocalDate nextSaturday = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        LocalDate nextSunday = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        return events.stream()
                .filter(event -> event.getStartTime().toLocalDate().equals(nextSaturday) ||
                        event.getStartTime().toLocalDate().equals(nextSunday))
                .collect(Collectors.toList());
    }

    public List<Event> listEventsOnDateAdjustedToTimeZone(LocalDate date, ZoneId zoneId) {
        return events.stream()
                .filter(event -> event.getStartTime().toLocalDate().equals(date))
                .map(event -> {
                    LocalDateTime startDateTime = event.getStartTime().atZone(ZoneId.systemDefault()).withZoneSameInstant(zoneId).toLocalDateTime();
                    LocalDateTime endDateTime = event.getEndTime().atZone(ZoneId.systemDefault()).withZoneSameInstant(zoneId).toLocalDateTime();
                    return new Event(startDateTime, endDateTime, event.getSummary(), event.getLocation());
                })
                .collect(Collectors.toList());
    }

    public List<Event> listEventsInDateTimeInterval(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return events.stream()
                .filter(event -> event.getStartTime().isAfter(startDateTime) && event.getEndTime().isBefore(endDateTime))
                .collect(Collectors.toList());
    }
}

