package com.kodilla.good.patterns.challneges.flight;

import java.util.HashMap;
import java.util.Map;

public final class AvailableFlights {

    public static Map<Integer, Flight> getAvailableFlights() {

        Map<Integer, Flight> availableFlights = new HashMap<>();
        availableFlights.put(1, new Flight("Warszawa",  "Wrocław"));
        availableFlights.put(2, new Flight("Gdańsk", "Warszawa"));
        availableFlights.put(3, new Flight("Warszawa",  "Gdańsk"));
        availableFlights.put(4, new Flight("Gdańsk",  "Katowice"));
        availableFlights.put(3, new Flight("Warszawa", "Gdańsk"));

        return availableFlights;
    }
}
