package com.company.basics;

import java.util.List;

public class GenericTest {
    public void lowerBound(List<? super Animal> list, Cat c){
        list.add(c);
    }
}

class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }

}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
}