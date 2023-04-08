package com.company.solid.singleresponsibility;

public class BankService {

    public void deposit(int amount){
        System.out.println("Depositing money" + amount);
    }

    public void withdraw(int amount){
        System.out.println("Withdraw money " + amount);
    }

    public void createAccount(String name){
        if(sendOtp().equals(1234+""))
        System.out.println("Account has created name "+ name);
    }

    public String sendOtp(){
        return 1234+"";
    }
}
