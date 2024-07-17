package com.codedotorg;
import java.util.ArrayList;

public class City {
    
    /** The name of a City */
    private String name;

    /**
     * Constructor for the City class.
     *
     * @param name The name of the city.
     */
    public City(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the city.
     * @return String The name of the city.
     */
    public String getName() {
        return name;
    }

    //a method to sort through a 1D array of cities
    public static void sortCities(ArrayList<City> cities) {
        for (int i = 0; i < cities.size(); i++) {
            for (int j = i + 1; j < cities.size(); j++) {
            if (cities.get(i).getName().compareTo(cities.get(j).getName()) > 0) {
                City temp = cities.get(i);
                cities.set(i, cities.get(j));
                cities.set(j, temp);
            }
            }
        }
    }

}
