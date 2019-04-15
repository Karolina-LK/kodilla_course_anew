package com.kodilla.good.patterns.challneges.order;

public interface OrderService {
    boolean createOrder(final User user, final Invoice invoice);
}