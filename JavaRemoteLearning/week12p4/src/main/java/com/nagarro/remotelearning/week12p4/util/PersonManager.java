package com.nagarro.remotelearning.week12p4.util;

import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {

    private final List<String> persons;

    public PersonManager(List<String> persons) {
        this.persons = persons;
    }


    public List<String> getPersonsOlderThan18() {
        return persons.stream()
                .filter(person -> getAge(person) > 18)
                .collect(Collectors.toList());
    }

    public String getOldestPerson() {
        return persons.stream()
                .max((p1, p2) -> Integer.compare(getAge(p1), getAge(p2)))
                .orElse(null);
    }

    public boolean areAllYoungerThan80() {
        return persons.stream()
                .allMatch(person -> getAge(person) < 80);
    }

    private int getAge(String person) {
        return Integer.parseInt(person.split(":")[0]);
    }
}
