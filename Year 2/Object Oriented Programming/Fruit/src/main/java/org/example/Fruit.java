package org.example;

public class Fruit {
    private double weight;

    public Fruit(){
        this.weight = 0;
    }
    public Fruit (double weight){
    this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateCost(){
        double costPrice = weight*0.4;
        return costPrice;
    }

    @Override
    public String toString() {
        return "Weight = " +"'"+ weight +"'";
    }
}
