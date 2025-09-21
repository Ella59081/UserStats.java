package service.impl;

import service.Payments;

public class CreditCard implements Payments {

    @Override
    public void pay(long amount) {
        System.out.println("Payment payed by credit card "+ amount);
    }

    @Override
    public void refund(long amount) {
    }
}
