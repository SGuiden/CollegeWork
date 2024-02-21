package org.example;

import java.util.ArrayList;

//Question 3
//A)
public class Store {
    ArrayList<BasicProduct> stock;
    public Store(){
        this.stock = null;
    }
    //B)
    public void addProduct(BasicProduct product) {
        stock.set(stock.size() + 1, product);
    }
    //C)
    public void deleteProduct(BasicProduct product) {
        //using a tracker to skip the product in the copying of the array, and thus deleting it.
        int tracker = 0;
        for(int i = 0; i < this.stock.size()-1; i++){
            if(product.getName().equalsIgnoreCase(delStock[i].getName())){
                stock.get(i) = stock.get(i+1);
            }
            if(){

            }

        }
    }

    //D)
    public int findNumBasicProduct(){
        int numOfBasics =0;
        for(int i = 0; i < this.stock.size()-1;i++){
            if(((CustomisedProduct)stock.get(i)){
            numOfBasics++;
            }
        return numOfBasics;
    }

    public BasicProduct getHighestPricedProduct(){
        BasicProduct HighestPriced = stock.get(0);
        for(int i = 0; i < this.stock.size()-1; i++){
            if(HighestPriced.getCostPrice() <= stock.get(i).getCostPrice()){
                HighestPriced = stock.get(i);
            }
        }
        return HighestPriced;
    }

    public CustomisedProduct [] getColouredCustomisedProducts(){
        for(int i = 0; i < this.stock.size()-1; i++){
            if()
        }


    }
    //G
    //the Difference between private and protected, it that the protected variable is still viewable
    //but unable to be changed. like in basic product with the CustomisedProduct class for the adustment price,
    //as its a fixed price that wont be changed and is still needed for every instance of the class you create.

    //H
    //when objects relate to eachother you can declare an object like a CustomisdProduct to be a BasicProduct as basic extends customised

    //I
}
