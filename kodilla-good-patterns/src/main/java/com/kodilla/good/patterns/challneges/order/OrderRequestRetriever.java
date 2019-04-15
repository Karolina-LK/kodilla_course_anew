package com.kodilla.good.patterns.challneges.order;

import java.math.BigDecimal;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        UsersAddress usersAddress = new UsersAddress("Kato", "42-300", "Mariacka", "4/1");

        User user = new User("Bibi", "Barbara", "Boruta", usersAddress);

        Product product1 = new Product("Toothbrush");
        Product product2 = new Product("Miswack");

        Item item1 = new Item(1, product1, new BigDecimal("10"), 2, new BigDecimal("20"));
        Item item2 = new Item(2, product2, new BigDecimal("9"), 3, new BigDecimal("27"));

        Invoice invoice = new Invoice(2111);

        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);

        return new OrderRequest(user, invoice);
    }
}