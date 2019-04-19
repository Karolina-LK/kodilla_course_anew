package com.kodilla.good.patterns.challneges.distributor;

import java.math.BigDecimal;

public class Application {

    public static void main(String args []) {

        Product product1 = new Product("apple", 1, 5);
        Product product2 = new Product("gluten free bread", 1, 10);
        Product product3 = new Product("extra milk", 1, 8);

        Item item1 = new Item(product1, new BigDecimal(1));
        Item item2 = new Item(product2, new BigDecimal(2));
        Item item3 = new Item(product3, new BigDecimal(0.5));

        OrderProcessor processor = new OrderProcessor();

        processor.processOrder(new ExtraFoodShop(), item3);
        processor.processOrder(new HealthyShop(), item1);
        processor.processOrder(new GlutenFreeShop(), item2);
    }
}