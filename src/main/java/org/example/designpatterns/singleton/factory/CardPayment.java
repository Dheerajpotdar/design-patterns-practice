package org.example.designpatterns.singleton.factory;

public class CardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment Using Card");
    }
}
