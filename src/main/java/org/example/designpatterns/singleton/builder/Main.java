package org.example.designpatterns.singleton.builder;

public class Main {
    public static void main(String[] args) {

        User user = new User(
                "Dheeraj",
                "potdardheerajs@gmail.com",
                26,
                "8857071062",
                "Pune",
                "USER"
        );
        System.out.println(user);
    }
}
