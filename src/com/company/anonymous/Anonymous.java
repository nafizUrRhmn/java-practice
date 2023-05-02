package com.company.anonymous;

public class Anonymous {
    public static void main(String args[]){
        Polygon polygon= new Polygon() {
            @Override
            void getShape() {
                System.out.println("Overriding shape");
            }
        };
        polygon.getShape();
    }
}
