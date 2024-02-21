/**
 * MyCompany requires the development of an order management system.
 * Version 1 of the system should have 4 classes,  Item, Supplier, Delivery and version1App.
 * Your code should be thoroughly documented – at a minimum, each statement in your app class should be commented and Javadoc created for all methods except  getters and setters.
 **/Public static void Version1(){
    public class Item() {
    }

    public class Delivery() {
    }


     /**
     * Class Supplier:
     * Attributes: supplierName, supplierAddress, amountOwed, creditLimit
     *
     **/
     public class Supplier() {
         final String supplierName;
         final String supplierAddress;
         int amountOwed;
     }
     /**
     * A no argument constructor and a constructor that has parameters for all relevant instance variables.
     *
     * All mutator methods should return booleans and have appropriate validation.
     *
     * It should be possible for clients to increase and decrease the amountOwed to any Supplier using public methods provided by the Supplier class.
     *
     * Override the toString() method.
     *
     * Class Item:
     * Attributes:  itemName, uniqueId, quantityInStock, reorderLevel, reOrderQuantity, unitCostPrice, supplierRef and onOrderFlag.
     *
     * A no argument constructor and a constructor that has parameters for all relevant instance variables.
     *
     * All mutator methods should return booleans and have appropriate validation.
     *
     * It should be possible for clients to increase and decrease the quantityInStock of any item using public methods provided by Item class. Note that there cannot be a negative stock quantity.
     *
     * You may assume for now that each product has only one supplier.
     *
     * Override the toString() method.
     *
     * Class Delivery:
     * Attributes: itemRef, date, quantity
     *
     * The instance variable date should be of type LocalDate.
     *
     * A no argument constructor and a constructor that has parameters for all relevant instance variables.
     *
     * All mutator methods should return booleans and have appropriate validation.
     *
     * calculateDeliveryCost() calculates and returns the delivery cost by multiplying the quantity by the unitCostPrice of the item.
     *
     * Override the toString() method.
     *
     * Version1App
     * No user input is required in this version.
     *
     * Create at least 3 Supplier objects s1, s2, s3, 5 Item objects, i1, i2, i3, i4, i5 and at least 3 Delivery objects, d1, d2, d3. Note that when an item is delivered the quantityInStock and amount owed fields should be updated.
     * Display the cost of d1.
     * Display the amount owed to a Supplier and the quantity in stock of an item before and after a delivery of that item is received from that supplier.
     *
     *
     * Your project should be ready for review  the week beginning   16/10/23
     */

    }
}