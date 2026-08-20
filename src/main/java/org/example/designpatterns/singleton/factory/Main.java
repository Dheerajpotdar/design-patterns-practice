package org.example.designpatterns.singleton.factory;

public class Main {
    public static void main(String[] args) {

        Payment payment1 =
                PaymentFactory.createPayment("UPI");

        Payment payment2 =
                PaymentFactory.createPayment("CARD");

        Payment payment3 =
                PaymentFactory.createPayment("NETBANKING");

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }

}
