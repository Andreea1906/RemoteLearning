package com.nagarro.remotelearning.week7p1.model;

import java.util.Comparator;

public class Country implements Comparable<Country> {
    private final String name;
    private final String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int compareTo(Country otherCountry) {
        return this.name.compareTo(otherCountry.getName());
    }

    public static Comparator<Country> compareByCapital = Comparator.comparing(Country::getCapital);
}
