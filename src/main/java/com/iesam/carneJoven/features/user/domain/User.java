package com.iesam.carneJoven.features.user.domain;

public class User {
    private final String nif;
    private final String name;
    private final String lastName;
    private final String address;

    public User(String nif, String name, String lastName, String address) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
