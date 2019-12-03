package com.company;

public class Address {
    private String postalCode;
    private String city;
    private String zone;
    private String street;
    private String alley;

    public Address(String postalCode, String city, String zone, String street, String alley) {
        this.postalCode = postalCode;
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.alley = alley;
    }
}
