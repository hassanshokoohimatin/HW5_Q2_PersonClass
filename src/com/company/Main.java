package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList = addToList();


    }




    public static List<Person> addToList (){

        List<Person> list = new ArrayList<>();

        Address address1 = new Address("11111","Tehran","4","Hengam","Sharifi");
        Address address2 = new Address("22222","Tehran","8","Madani","Samangan");
        Address address3 = new Address("33333","Tehran","1","Bahonar","Saba");
        Address address4 = new Address("44444","Tehran","2","Valiasr","Ziba");
        Address address5 = new Address("55555","Tehran","10","Navvab","Aghaghia");

        Person person1 = new Person("Hassan","Shokoohi",32,address1);
        Person person2 = new Person("Mahdi","Solooki",36,address2);
        Person person3 = new Person("Ali","Nobakht",30,address3);
        Person person4 = new Person("Soren","Matin",25,address4);
        Person person5 = new Person("Navid","Ataei",31,address5);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }
}
