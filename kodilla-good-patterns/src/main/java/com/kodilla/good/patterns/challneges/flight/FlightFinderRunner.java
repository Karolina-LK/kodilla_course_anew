package com.kodilla.good.patterns.challneges.flight;

public class FlightFinderRunner {

    public static void main(String[] args) {
        System.out.println(FlightFinder.searchByArrivalAirport("Beijing"));
        System.out.println(FlightFinder.searchByDepartureAirport("Warsaw"));
        System.out.println(FlightFinder.searchForConnectingFlights("Warsaw", "London",
                "New York"));

    }
}