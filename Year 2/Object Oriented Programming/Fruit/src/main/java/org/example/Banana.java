package org.example;

public class Banana extends Fruit {
    private double length;

    public Banana(){
        length = 0;
    }
    public Banana(double length){
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "Banana{" + "Length = " + "'" + length + "'" + ", " + super.toString()+ '}';
    }
}
