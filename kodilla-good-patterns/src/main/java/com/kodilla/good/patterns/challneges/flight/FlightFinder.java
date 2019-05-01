package com.kodilla.good.patterns.challneges.flight;

import java.util.List;
import java.util.stream.Collectors;

public final class FlightFinder {

    public static List<Flight> searchByDepartureAirport(String departureAirport) {
        return AvailableFlights.getAvailableFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchByArrivalAirport(String arrivalAirport) {
        return AvailableFlights.getAvailableFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchForConnectingFlights(String departureAirport, String connectingCity, String arrivalAirport) {
        List<Flight> result = AvailableFlights.getAvailableFlights().stream()
                .filter(f -> (f.getDepartureAirport().equals(departureAirport)) && (f.getArrivalAirport().equals(connectingCity)))
                .collect(Collectors.toList());

        result.addAll(AvailableFlights.getAvailableFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(connectingCity) && f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList()));
        return result;
    }
}