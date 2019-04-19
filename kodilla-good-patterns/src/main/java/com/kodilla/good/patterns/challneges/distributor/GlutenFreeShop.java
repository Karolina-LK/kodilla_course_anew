package com.kodilla.good.patterns.challneges.distributor;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to GlutenFreeShop. All of our products are gluten-free certified");
        return true;
    }
}
