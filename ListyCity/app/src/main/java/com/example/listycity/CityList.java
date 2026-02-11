/**
 * This is a class that keeps a list of city objects.
 */
package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add

     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
}

/**
 * This returns a sorted list of cities
 * @return
 * Return the sorted list
 */
public List<City> getCities() {
    List<City> list = cities;
    Collections.sort(list);
    return list;
 }
    /**
     * Returns whether the given city is in the list.
     * @param city the city to check
     * @return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     * @param city the city to delete
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns how many cities are in the list.
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }
}

