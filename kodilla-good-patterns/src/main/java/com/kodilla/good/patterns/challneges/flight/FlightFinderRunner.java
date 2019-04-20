package com.kodilla.good.patterns.challneges.flight;

import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challneges.flight.AvailableFlights.getAvailableFlights;

public class FlightFinderRunner {

    public static void main(String args[]) {

        String departureAirport = "Warszawa";
        Optional<String> intermediateAirport = Optional.ofNullable("Wrocław");
        String arrivalAirport = "Gdańsk";

        Flight flight = new Flight(departureAirport, intermediateAirport, arrivalAirport);
        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> availableFlights = getAvailableFlights();

        flightFinder.findFlightWithIntermediateAirport(flight, availableFlights);
        flightFinder.findFlightFromAirport(departureAirport, availableFlights);
        flightFinder.findFlightToAirport(arrivalAirport, availableFlights);
    }
}