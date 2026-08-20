package org.example.designpatterns.singleton.factory;

public class UPIPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
