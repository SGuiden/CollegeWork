package org.example;

import java.util.ArrayList;

public class Stock extends item{
    ArrayList<item> products = new ArrayList<>();

    public Stock(ArrayList<item> products) {
        this.products = products;

    }

    /**
     * adds an item to the products array
     * @param product an item to add to products
     * @return returns a true when the product is added
     */
    public boolean add(item product) {
        return products.add(product);
    }

    /**
     * finding a given item in products
     * @param itemName the name of the item to search for
     * @return the item information if they match and if not it returns null
     */
    public item findItem(String itemName) {
        //item o = products.get(1); - gets second product in products
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getItemName().equalsIgnoreCase(itemName)) {
                return products.get(i);
            }
        }
        return null;
    }

    /**
     * finds the slot of the item with the dearest price in products array
     * @return the name of the dearest item
     */
    public String findDearest() {
        int dearestItemSlot = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getUnitCostPrice() > products.get(dearestItemSlot).getUnitCostPrice()) {
                dearestItemSlot = i;
            }
        }
        return products.get(dearestItemSlot).getItemName();
    }

    /**
     * finding the cheapest item and returning the name of the item
     * @return the itemName of the item with the lowest cost price
     */
    public String findCheapest() {
        int cheapestItemSlot = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getUnitCostPrice() < products.get(cheapestItemSlot).getUnitCostPrice()) {
                cheapestItemSlot = i;
            }
        }
        return products.get(cheapestItemSlot).getItemName();
    }

    /**
     * to create a new order of products that need to be ordered and add it to the supplierOrder
     * @return if it is null it will return null and if it has added a product it will return the supplier order
     */
    public ArrayList<item> createOrder(ArrayList<item> SupplierOrder) {
        int tracker = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getOnOrderFlag(false) && products.get(i).getQuantityInStock() <= products.get(i).getReorderLevel()) {
            }
            SupplierOrder.add(products.get(i));
        }
        if(SupplierOrder == null){
            return null;
        }
        return SupplierOrder;
    }
}

