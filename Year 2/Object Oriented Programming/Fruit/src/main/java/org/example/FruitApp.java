package org.example;

public class FruitApp {
    public static void main(String[] args) {
        //when it is of class Object it needs to be cast to the subclass first before using methods
        Object App1 = new Apple("Pink Lady");
        ((Apple) App1).setWeight(2);
        Apple App2 = new Apple("Tesco");
        App2.setWeight(2.5);
        Fruit App3 = new Apple("Granny Smith");
        App3.setWeight(1.8);
        System.out.println(App1.toString());
        System.out.println(App2.toString());
        System.out.println(App3.toString());


    }
}
