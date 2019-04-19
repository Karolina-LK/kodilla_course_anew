package com.kodilla.good.patterns.challneges.distributor;

public class OrderProcessor {
    public void processOrder(Shop shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("Your order includes: "  + "\n" + "The product: " + item.getProduct().getName()
                  + ", " + "\n" + "The quantity: " + item.getProduct().getQuantity() + ", " +"\n"
                    + "The price: " + item.getProduct().getPrice() + " PLN");
        } else {
            System.out.println("Your order was rejected... Please contact our support...");
        }
    }
}
