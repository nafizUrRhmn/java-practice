package com.company.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();

        // Adding elements to above List
        // using add() method
        personList.add(new Person("vicky", 24,"Dhaka"));
        personList.add(new Person("poonam", 25, "Dhaka"));
        personList.add(new Person("sachin", 19, "Dinajpur"));
	// write your code here
        Collections.sort(personList, Main::compareByAge);


        List<String> newList =
                personList.stream().map(v -> v.getName().toUpperCase(Locale.ROOT)).
                        collect(Collectors.toList());
        Collections.sort(newList);
        personList.stream().map(v -> v.getAge()).forEach(System.out::println);
        newList.stream().forEach(System.out::println);
    }
}
