package com.nagarro.remotelearning.week13p1;

import com.nagarro.remotelearning.week13p1.model.Event;
import com.nagarro.remotelearning.week13p1.util.EventManager;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add an event");
            System.out.println("2. List events taking place next weekend");
            System.out.println("3. List events on a specific date adjusted to a time zone");
            System.out.println("4. List events in a date time interval");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline

            switch (choice) {
                case 1:
                    addEvent(scanner, eventManager);
                    break;
                case 2:
                    listEventsNextWeekend(eventManager);
                    break;
                case 3:
                    listEventsOnDateAdjustedToTimeZone(scanner, eventManager);
                    break;
                case 4:
                    listEventsInDateTimeInterval(scanner, eventManager);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEvent(Scanner scanner, EventManager eventManager) {
        System.out.print("Summary: ");
        String summary = scanner.nextLine();

        System.out.print("Start Date Time (YYYY-MM-DD HH:MM:SS): ");
        LocalDateTime startDateTime = LocalDateTime.parse(scanner.nextLine());

        System.out.print("End Date Time (YYYY-MM-DD HH:MM:SS): ");
        LocalDateTime endDateTime = LocalDateTime.parse(scanner.nextLine());

        System.out.print("Location (optional): ");
        String location = scanner.nextLine();

        Event event = new Event(startDateTime, endDateTime, summary, location);
        eventManager.addEvent(event);
        System.out.println("Event added successfully!");
    }

    private static void listEventsNextWeekend(EventManager eventManager) {
        List<Event> eventsNextWeekend = eventManager.listEventsNextWeekend();
        if (eventsNextWeekend.isEmpty()) {
            System.out.println("No events next weekend.");
        } else {
            System.out.println("Events next weekend:");
            for (Event event : eventsNextWeekend) {
                System.out.println(event);
            }
        }
    }

    private static void listEventsOnDateAdjustedToTimeZone(Scanner scanner, EventManager eventManager) {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();
        System.out.print("Enter time zone: ");
        String timeZoneStr = scanner.nextLine();
        ZoneId zoneId = ZoneId.of(timeZoneStr);

        LocalDateTime date = LocalDateTime.parse(dateStr + "T00:00:00");
        List<Event> eventsOnDate = eventManager.listEventsOnDateAdjustedToTimeZone(date.toLocalDate(), zoneId);

        if (eventsOnDate.isEmpty()) {
            System.out.println("No events on that date adjusted to the given time zone.");
        } else {
            System.out.println("Events on " + dateStr + " adjusted to " + timeZoneStr + ":");
            for (Event event : eventsOnDate) {
                System.out.println(event);
            }
        }
    }

    private static void listEventsInDateTimeInterval(Scanner scanner, EventManager eventManager) {
        System.out.print("Enter start date time (YYYY-MM-DD HH:MM:SS): ");
        LocalDateTime startDateTime = LocalDateTime.parse(scanner.nextLine());

        System.out.print("Enter end date time (YYYY-MM-DD HH:MM:SS): ");
        LocalDateTime endDateTime = LocalDateTime.parse(scanner.nextLine());

        List<Event> eventsInInterval = eventManager.listEventsInDateTimeInterval(startDateTime, endDateTime);

        if (eventsInInterval.isEmpty()) {
            System.out.println("No events in the specified date time interval.");
        } else {
            System.out.println("Events in the specified date time interval:");
            for (Event event : eventsInInterval) {
                System.out.println(event);
            }
        }
    }
}

