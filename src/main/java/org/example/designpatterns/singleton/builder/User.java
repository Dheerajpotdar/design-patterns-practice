package org.example.designpatterns.singleton.builder;

public class User {
    private String name;
    private String email;
    private int age;
    private String phone;
    private String city;
    private String role;

    public User(String name, String email, int age,
                String phone, String city, String role) {

        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.city = city;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
