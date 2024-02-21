package org.example;

public class Apple extends Fruit {
    private String Variety;
    public Apple(){
        this.Variety = "";
    }
    public Apple(String Variety){
        this.Variety = Variety;
    }

    public void setVariety(String variety) {
        Variety = variety;
    }

    public String getVariety() {
        return Variety;
    }

    @Override
    public double calculateCost() {
        double calcCost = super.calculateCost();
        if(Variety.equalsIgnoreCase("Pink Lady")){
                calcCost = calcCost + (calcCost/10);
        }
        return calcCost;
    }

    @Override
    public String toString() {
        return "Apple{" + "variety = " + "'" + Variety + "'" + ", " + super.toString()+ '}';
    }
}
