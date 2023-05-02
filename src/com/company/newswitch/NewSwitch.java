package com.company.newswitch;

public class NewSwitch {
    public static void main(String args[]){
        String name = "Father";
        NewSwitch newSwitch = new NewSwitch();
        System.out.println("Age : "+ newSwitch.getAge(name));

    }

    Integer getAge(String name){
        switch(name){
            case "Nafiz","Trisna" -> {
                return 34;
            }
            case "Father" -> {return 68;}
            case "Tawsif", "Fatin" -> {return 23;}
            default -> {return 0;}
        }
    }
}
