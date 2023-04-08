package com.company.solid;

public class CreditCard implements BankCardService{
    @Override
    public void doTransaction(Long amount) {
        System.out.println("You are purchasing "+ amount +" taka via Credit card");
    }
}
