package org.example.designpatterns.singleton.factory;

public class PaymentFactory {
    public static Payment createPayment(String type) {

        if (type.equals("UPI")) {
            return new UPIPayment();
        }

        if (type.equals("CARD")) {
            return new CardPayment();
        }

        if (type.equals("NETBANKING")) {
            return new NetBankingPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
