package com.kodilla.good.patterns.challneges.flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class AvailableFlights {

    public static Map<Integer, Flight> getAvailableFlights() {

        Map<Integer, Flight> availableFlights = new HashMap<>();
        availableFlights.put(1, new Flight("Warszawa", Optional.ofNullable("Gdańsk"), "Wrocław"));
        availableFlights.put(2, new Flight("Gdańsk", Optional.empty(),"Warszawa"));
        availableFlights.put(3, new Flight("Warszawa", Optional.empty(), "Gdańsk"));
        availableFlights.put(4, new Flight("Gdańsk", Optional.ofNullable("Warszawa"), "Katowice"));
        availableFlights.put(3, new Flight("Warszawa", Optional.ofNullable("Wrocław"), "Gdańsk"));

        return availableFlights;
    }
}
