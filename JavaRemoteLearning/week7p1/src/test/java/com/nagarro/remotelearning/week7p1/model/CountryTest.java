package com.nagarro.remotelearning.week7p1.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    @Test
    public void testSorting() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("United States", "Washington D.C."));
        countries.add(new Country("United Kingdom", "London"));
        countries.add(new Country("France", "Paris"));
        countries.add(new Country("Germany", "Berlin"));
        countries.add(new Country("Japan", "Tokyo"));

        Collections.sort(countries);

        for (int i = 1; i < countries.size(); i++) {
            assertTrue(countries.get(i - 1).compareTo(countries.get(i)) <= 0);
        }
    }
}