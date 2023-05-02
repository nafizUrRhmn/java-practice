package com.company.lambda;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PiHole {
    public static void main(String args[]) {
        Pi pi = x -> System.out.println(x);
        pi.getValue(4);


        Person person = new Person();
        person.setName("Nafiz");
        person.setAge(23);
        Person person1 = new Person();
        person1.setName("NRX");
        person1.setAge(44);
        List<Person> ppl = new ArrayList<>(Arrays.asList(person,person1));

        ppl.stream().forEach(u -> {
            if(u.getAge()==23){
                u.setAge(32);
            }
        });
        ppl.stream().forEach(u -> System.out.println(u.getAge()));
    }
}
