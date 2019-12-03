package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList = addToList();

        //Sorted Person List by AGE...Using Lambda expression

        personList.sort((p1,p2)->p1.getAge()-p2.getAge());
        personList.forEach(p-> System.out.println(p));
        System.out.println("============================================================================================");
        System.out.println("the list of lastNames that is sorted by their length\n");

        //the list of lastNames that is sorted by their length

        personList.sort((p1,p2)->(p1.getLastName().length())-(p2.getLastName().length()));
        personList.forEach(p-> System.out.println(p.getLastName()));
        System.out.println("============================================================================================");

        //the list of Persons that live in zone less than 5 in Tehran...

        System.out.println("the list of Persons that live in zone less than 5 in Tehran...");
        Stream<Person> persons = personList.stream();   //creating the stream of all Persons
        Stream<Person> cityFilter = persons.filter(p->p.getAddress().getCity().equals("Tehran"));
        Stream<Person> zoneFilter = cityFilter.filter(p->p.getAddress().getZone()<5);
        zoneFilter.forEach(p-> System.out.println(p.getLastName()));







    }






    public static List<Person> addToList (){

        List<Person> list = new ArrayList<>();

        Address address1 = new Address("11111","Tehran",4,"Hengam","Sharifi");
        Address address2 = new Address("22222","Karaj",1,"Rajaei","Samangan");
        Address address3 = new Address("33333","Karaj",2,"Koohrang","Saba");
        Address address4 = new Address("44444","Tehran",2,"Valiasr","Ziba");
        Address address5 = new Address("55555","Tehran",10,"Navvab","Aghaghia");

        Person person1 = new Person("Hassan","ShokoohiMatin",32,address1);
        Person person2 = new Person("Mahdi","Rad",36,address2);
        Person person3 = new Person("Ali","Nobakht",30,address3);
        Person person4 = new Person("Soren","Noori",25,address4);
        Person person5 = new Person("Navid","Mohammadi",31,address5);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }
}
