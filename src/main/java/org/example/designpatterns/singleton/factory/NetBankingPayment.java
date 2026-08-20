package org.example.designpatterns.singleton.factory;

public class NetBankingPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment Using Net Banking");
    }
}
