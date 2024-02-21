package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class SupDeliveries {
    ArrayList<Delivery> inComing = new ArrayList<Delivery>();
    public SupDeliveries(ArrayList<Delivery> inComing){
        this.inComing = inComing;
    }

    /**
     *  adding a new delivery to the inComing Array
     * @param newDelivery - a Delivery Variable to add to the inComing Array
     */
    public void addDelivery(Delivery newDelivery){
        inComing.add(newDelivery);
    }

    /**
     * finding all the Deliveries with a certaim date in the inComing Array
     * @param date of type LocalDate
     * @return Deliveries from the date given
     */
    public ArrayList<Delivery> findAllDeliveries(LocalDate date) {
        ArrayList<Delivery>DeliveriesFromDate = new ArrayList<Delivery>();
        for(int i = 0; i < inComing.size();i++){
            if(inComing.get(i).getDate() == date){
            DeliveriesFromDate.add(inComing.get(i));
            }
        }
        return DeliveriesFromDate;
    }

    /**
     * finding all the deliveries containing a certain product
     * @param Product of type item to search for
     * @return an array of Deliveries containing the item searched for
     */
    public ArrayList<Delivery> findAllDeliveries(item Product) {
        ArrayList<Delivery>DeliveriesFromDate = new ArrayList<Delivery>();
        for(int i = 0; i < inComing.size();i++){
            if(inComing.get(i).getItemReference() == Product){
                DeliveriesFromDate.add(inComing.get(i));
            }
        }
        return DeliveriesFromDate;
    }

    /**
     * Deleting deliveries related to the supplier name
     * @param supplierName the supplier name to delete Delivery from that supplier
     * @return the number of deliveries deleted
     */
    public int DeleteDeliveries(Supplier supplierName){
        int deleted =0;
        for (int i =0; i < inComing.size();i++)
            if(supplierName == inComing.get(i).getSupplierRef()){
            inComing.remove(i);
            deleted++;
        }
        return deleted;
    }
}
