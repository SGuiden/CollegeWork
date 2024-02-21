package org.example;

//Question 2
public class CustomisedProduct extends BasicProduct{
    //A)
    private String colour;
    private int noOfAdjustments;
    protected int adjustPrice = 12;
    public CustomisedProduct(String colour, int numOfAdjust){
        this.colour = colour;
        this.noOfAdjustments = numOfAdjust;
    }

    //B)
    public String getColour() {
        return colour;
    }

    public int getNoOfAdjustments() {
        return noOfAdjustments;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNoOfAdjustments(int noOfAdjustments) {
        this.noOfAdjustments = noOfAdjustments;
    }
    //C
    public double calcPrice(double costPrice) {
        if (!(costPrice <= 0)) {
            double calc = calcSellingPrice(costPrice);
            calc = calc + (noOfAdjustments * adjustPrice);
            if (noOfAdjustments >= 10 && noOfAdjustments <= 25) {
                calc = calc * 1.12;
            }
            return calc;
        }
    return -1;
    }

    //D)
    @Override
    public String toString() {
        return "CustomisedProduct{Colour = '" + colour + "', NumberOfAdjustments = " + noOfAdjustments + ", Adjusted Price = '" + adjustPrice + '}';
    }
}
