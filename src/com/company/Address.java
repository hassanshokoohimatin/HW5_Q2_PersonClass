package com.company;

public class Address {
    private String postalCode;
    private String city;
    private int zone;
    private String street;
    private String alley;

    public Address(String postalCode, String city, int zone, String street, String alley) {
        this.postalCode = postalCode;
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.alley = alley;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getZone() {
        return zone;
    }

    public String getStreet() {
        return street;
    }

    public String getAlley() {
        return alley;
    }

    @Override
    public String toString() {
        return "Address{" +
                ", city='" + city + '\'' +
                ", zone='" + zone + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
