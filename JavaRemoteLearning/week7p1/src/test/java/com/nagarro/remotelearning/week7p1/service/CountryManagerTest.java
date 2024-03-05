package com.nagarro.remotelearning.week7p1.service;

import com.nagarro.remotelearning.week7p1.model.Country;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountryManagerTest {

    private ArrayList<Country> countries;

    @Before
    public void setUp() {
        countries = new ArrayList<>();
        countries.add(new Country("United States", "Washington D.C."));
        countries.add(new Country("United Kingdom", "London"));
        countries.add(new Country("France", "Paris"));
        countries.add(new Country("Germany", "Berlin"));
        countries.add(new Country("Japan", "Tokyo"));
    }

    @Test
    void sortCountriesByName() {
        CountryManager countryManager = new CountryManager(countries);
        countryManager.sortCountriesByName();

        assertEquals("France", countries.get(0).getName());
        assertEquals("Germany", countries.get(1).getName());
        assertEquals("Japan", countries.get(2).getName());
        assertEquals("United Kingdom", countries.get(3).getName());
        assertEquals("United States", countries.get(4).getName());
    }

    @Test
    void sortCountriesByCapital() {
        CountryManager countryManager = new CountryManager(countries);
        countryManager.sortCountriesByCapital();

        assertEquals("Berlin", countries.get(0).getCapital());
        assertEquals("London", countries.get(1).getCapital());
        assertEquals("Paris", countries.get(2).getCapital());
        assertEquals("Tokyo", countries.get(3).getCapital());
        assertEquals("Washington D.C.", countries.get(4).getCapital());
    }

    @Test
    void binarySearchCountryByCapital() {
        CountryManager countryManager = new CountryManager(countries);
        countryManager.sortCountriesByCapital();

        assertEquals(2, countryManager.binarySearchCountryByCapital("Paris"));
        assertEquals(-1, countryManager.binarySearchCountryByCapital("Rome"));
    }
}