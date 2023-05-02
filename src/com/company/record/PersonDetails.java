package com.company.record;

public class PersonDetails {
    public static void main(String args[]){
        Person person = new Person("Nafiz", "Rahman", "Metro garden", 34);

        System.out.println("""
                Full Name : %s.
                Address: %s.
                Age: %s.
                """.formatted(person.firstName()+ " "+ person.lastName(), person.address(), person.age()));
    }
}
