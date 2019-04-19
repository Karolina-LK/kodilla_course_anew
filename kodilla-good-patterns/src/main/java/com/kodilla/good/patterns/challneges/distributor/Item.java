package com.kodilla.good.patterns.challneges.distributor;

import java.math.BigDecimal;

public class Item {
    private Product product;
    private BigDecimal quantity;

    public Item(Product product, BigDecimal quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

}