package org.example;
//question 1
public abstract class BasicProduct {
    //A)
    private String name;
    private int quantityInStock;
    private double costPrice;
    static int idCount = 1001;
    private int id;

    public BasicProduct() {
        this.name = "";
        this.quantityInStock = 0;
        this.costPrice = 0;
        this.id = idCount;
        idCount++;
    }

    public BasicProduct(String name, int stock, double price) {
        this.name = name;
        this.quantityInStock = stock;
        this.costPrice = price;
        this.id = idCount;
        idCount++;
    }

//B)
    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public boolean setCostPrice(double costPrice) {
        boolean valid = false;
        if (costPrice > 0) {
            this.costPrice = costPrice;
            valid = true;
        }
        return valid;
    }

    public void setId(int id) {
        this.id = id;
    }

    //C)
    public double calcSellingPrice(double costPrice) {
        double incCostPrice;
        if (costPrice <= 100) {
            incCostPrice = costPrice * 1.1;
        } else {
            incCostPrice = costPrice * 1.15;
        }
        return incCostPrice;
    }

    //D
    @Override
    public String toString() {
        return "BasicProduct{" + "Name = '" + name + "', QuantityInStock = '" + quantityInStock + "', CostPrice = '" + costPrice + "', Id = '" + id + "'}";
    }
}