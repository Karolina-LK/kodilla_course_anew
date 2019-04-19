package com.kodilla.good.patterns.challneges.distributor;

public class HealthyShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to HealthyFoodShop. We are here to help you improve your health!");
        return true;
    }
}