package com.kodilla.good.patterns.challneges.flight;

import java.util.Map;

import static com.kodilla.good.patterns.challneges.flight.AvailableFlights.getAvailableFlights;

public class FlightFinderRunner {

    public static void main(String args[]) {

        String departureAirport = "Warszawa";
        String arrivalAirport = "Gdańsk";

        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> availableFlights = getAvailableFlights();

        flightFinder.findFlightFromAirport(departureAirport, availableFlights);
        flightFinder.findFlightToAirport(arrivalAirport, availableFlights);
    }
}