package org.example;


import java.util.ArrayList;

public class SupOrderBook {
    ArrayList<SupOrder> orders = new ArrayList<>();
    public SupOrderBook(ArrayList<SupOrder> orders) {
    this.orders = orders;
    }
//    public boolean add1(SupOrder order){
//        if (orders.add(order)){
//            return true;
//        }
//        return false;
//
//    }

    /**
     * returns a boolean when adding an order in orders
     * @param order - a new order to add
     * @return
     */
    public boolean add(SupOrder order){
        return orders.add(order);
    }

    /**
     * Takes in a new order and adds it to your order ArrayList
     * @param order - an Arraylist of SupOrders that will be added to the SupOrder Book
     */
    public void add(ArrayList<SupOrder>order){
//        for(int i =0; i< order.size();i++){
//            orders.add(order.get(i));
//        }
        orders.addAll(order);
    }
}
