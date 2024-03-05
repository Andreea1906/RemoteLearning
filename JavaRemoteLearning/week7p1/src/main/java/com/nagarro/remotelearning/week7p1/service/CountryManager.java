package com.nagarro.remotelearning.week7p1.service;

import com.nagarro.remotelearning.week7p1.model.Country;

import java.util.ArrayList;
import java.util.Collections;

public class CountryManager {
    private final ArrayList<Country> countries;

    public CountryManager(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void sortCountriesByName() {
        Collections.sort(countries);
    }

    public void sortCountriesByCapital() {
        Collections.sort(countries, Country.compareByCapital);
    }

    public int binarySearchCountryByCapital(String capital) {
        int left = 0;
        int right = countries.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = countries.get(mid).getCapital().compareTo(capital);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
