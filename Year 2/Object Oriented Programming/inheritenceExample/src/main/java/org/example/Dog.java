package org.example;
//Create a class Dog.
//A Dog isa  pet that also has a breed and a weight.
//Write constructors, getters and setters and override the calculateCost() and toString() methods.
//

public class Dog extends Pet{
    private String Breed;
    private double weight;
    public Dog(String name, int id, String Owner, int numOfDays, String breed, double weight) {
        super(name, id, Owner, numOfDays);
        this.Breed = breed;
    }
}
