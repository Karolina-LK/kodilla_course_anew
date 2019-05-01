package com.kodilla.good.patterns.challneges.flight;

import java.util.ArrayList;
import java.util.List;

public final class AvailableFlights {

    public static List<Flight> getAvailableFlights() {
        List<Flight> availableFlights = new ArrayList<>();
        availableFlights.add(new Flight("Warsaw", "London"));
        availableFlights.add(new Flight("London", "New York"));
        availableFlights.add(new Flight("Oslo", "Moscow"));
        availableFlights.add(new Flight("Moscow", "Beijing"));
        availableFlights.add(new Flight("London", "Beijing"));
        availableFlights.add(new Flight("Beijing", "Delhi"));

        return new ArrayList<>(availableFlights);
    }
}
