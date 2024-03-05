package com.nagarro.remotelearning.week7p1;

import com.nagarro.remotelearning.week7p1.model.Country;
import com.nagarro.remotelearning.week7p1.service.CountryManager;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("Germany", "Berlin"));
        countries.add(new Country("Romania", "Bucharest"));
        countries.add(new Country("France", "Paris"));



        System.out.println("Unsorted list:");
        for (Country country : countries) {
            System.out.println(country.getName());
        }

        Collections.sort(countries);

        System.out.println("\nSorted list:");
        for (Country country : countries) {
            System.out.println(country.getName());
        }


        CountryManager countryManager = new CountryManager(countries);

        // Sort the countries by capital
        countryManager.sortCountriesByCapital();

        // Display the sorted list
        System.out.println("\nSorted list by capitals:");
        for (Country country : countries) {
            System.out.println(country.getName() + " - " + country.getCapital());
        }

        // Perform binary search for the country whose capital is Paris
        int index = countryManager.binarySearchCountryByCapital("Paris");
        if (index >= 0) {
            System.out.println("\nFound France at index: " + index);
        } else {
            System.out.println("\nFrance not found.");
        }


    }
}
