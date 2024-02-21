package org.example;

public class Orange extends Fruit {
    private boolean ripe;
    public Orange(){
        this.ripe = false;
    }
    public Orange(Boolean ripe){
        this.ripe = ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public boolean getRipe() {
        return ripe;
    }

    @Override
    public double calculateCost() {
        double calcCost = super.calculateCost();
        if(!this.ripe){
            calcCost = calcCost/2;
        }
        return calcCost;
    }

    @Override
    public String toString() {
        return "Orange{" + "Ripe = " + "'" + ripe + "'" + ", " + super.toString()+ '}';
    }
}
