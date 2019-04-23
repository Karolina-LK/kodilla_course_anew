package com.kodilla.good.patterns.challneges.flight;

import java.util.Map;

public final class FlightFinder {

    public void findFlightFromAirport(String departureAirport, Map<Integer, Flight> availableFlights) {

        System.out.println("\n" +"Available flights from: " + departureAirport + "\n");
        availableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport, Map<Integer, Flight> availableFlights) {
        System.out.println("\n" + "Available flights to: " + arrivalAirport + "\n");
        availableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }
}