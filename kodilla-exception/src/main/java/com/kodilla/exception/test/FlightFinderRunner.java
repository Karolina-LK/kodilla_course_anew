package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String args[]) {
      //  Flight flight = new Flight("Warszawa", "Gdansk");
        Flight flight = new Flight("", "");

        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("The airport you are trying to find is not on the list.");
        }
    }
}