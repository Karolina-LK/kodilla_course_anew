package com.kodilla.good.patterns.challneges.distributor;

public class ExtraFoodShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to ExtraFoodShop. All our products are just extra!");
        return true;
    }
}