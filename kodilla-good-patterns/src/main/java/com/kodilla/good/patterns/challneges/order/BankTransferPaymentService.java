package com.kodilla.good.patterns.challneges.order;

public class BankTransferPaymentService implements PaymentService {
    public boolean pay(Invoice invoice) {

        System.out.println("Bank transfer payment has been completed.");
        return true;
    }
}