package com.company.builder;

public class MobileShop {

    public static void main(String args[]){
        System.out.println("Client buying phone base on specification");
        MobileConfiguration mobileConfiguration = new MobileBuilder().setBrand("apple")
                .setModel("iPhone 14").setRam(8).build();
        System.out.println(mobileConfiguration);
    }
}
