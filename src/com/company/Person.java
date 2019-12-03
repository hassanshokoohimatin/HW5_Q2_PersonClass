package com.company;

public class Person {
    private String firstNmae;
    private String lastName;
    private int age;
    private Address address;

    public Person(String firstNmae, String lastName, int age, Address address) {
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstNmae='" + firstNmae + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
