package com.kodilla.good.patterns.challneges.order;

public class CourierDeliveryService implements DeliveryService {
    public boolean deliverTo(User user) {
        System.out.println("Delivering to " + user.getFirstName() + " " + user.getFamilyName());
        System.out.println( "the adress: " + user.getUsersAddress().getStreet() + " " + user.getUsersAddress().getHouseNumber() + " " + user.getUsersAddress().getCityCode() +" " + user.getUsersAddress().getCity());
        return true;
    }
}