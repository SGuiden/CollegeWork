import java.time.LocalDate;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    }

    //MyCompany requires the development of an order management system.
    //Version 1 of the system should have 4 classes,  Item, Supplier, Delivery and version1App.
    //Your code should be thoroughly documented – at a minimum, each statement in your app class should be commented
    //and Javadoc created for all methods except  getters and setters.

    //Class Supplier:
    public class Supplier {
        //should be private
        private String supplierName;
        private String supplierAddress;
        private double amountOwed;
        int creditLimit;

        public Supplier(){
            String supplierName = "";
            String supplierAddress = "";
            double amountOwed = 0;
            int creditLimit = 0;
        }
        public Supplier(String supplierName, String supplierAddress, double amountOwed, int creditLimit){
            this.supplierName = supplierName;
            this.supplierAddress = supplierAddress;
            this.amountOwed = amountOwed;
            this.creditLimit = creditLimit;
        }
        public String getSupplierName(String supplierName){
            return this.supplierName;
        }
        public String getSupplierAddress(String supplierAddress){
            return this.supplierAddress;
        }
        public double getAmountOwed(int amountOwed){
            return this.amountOwed;
        }
        public int getCreditLimit(int creditLimit){
            return this.creditLimit;
        }
        public boolean setSupplierName(String supplierName){
            boolean set = false;
            if(supplierName != ""){
                this.supplierName = supplierName;
                set = true;
            }
            return set;
        }
        public boolean setSupplierAddress(String supplierAddress){
            boolean set = false;
            if(supplierAddress != ""){
                this.supplierAddress = supplierAddress;
                set = true;
            }
            return set;
        }
        public boolean setAmountOwed(int amountOwed){
            boolean set = false;
            if(amountOwed != 0){
                this.amountOwed = amountOwed;
                set = true;
            }
            return set;
        }
        public boolean setCreditLimit(int creditLimit){
        boolean set = false;
            if(creditLimit != 0){
                this.creditLimit = creditLimit;
                set = true;
            }
            return set;
        }
    }
    //A no argument constructor and a constructor that has parameters for all relevant instance variables.

    //All mutator methods should return booleans and have appropriate validation.

    //It should be possible for clients to increase and decrease the amountOwed to any Supplier using public methods provided by the Supplier class.

    //Override the toString() method.

    //Class Item:
    public class item{
        //needs to be private.
        private String itemName;
        private int uniqueId;
        private int quantityInStock;
        private int reorderLevel;
        private int reOrderQuantity;
        private int unitCostPrice;
        //shold be of type supplier
        private Supplier supplierRef;
        private boolean onOrderFlag;
         public item()
        {
            this.itemName = "";
            this.uniqueId = 0;
            this.quantityInStock = 0;
            this.reorderLevel = 0;
            this.reOrderQuantity = 0;
            this.unitCostPrice = 0;
            this.supplierRef = null;
            this.onOrderFlag = false;
        }
        //create static cunter for uniqueId
        public item(String itemName, int uniqueId, int quantityInStock, int reorderLevel, int reOrderQuantity, int unitCostPrice, Supplier supplierRef, boolean onOrderFlag)
        {
            this.itemName = itemName;
            this.uniqueId = uniqueId;
            this.quantityInStock = quantityInStock;
            this.reorderLevel = reorderLevel;
            this.reOrderQuantity = reOrderQuantity;
            this.unitCostPrice = unitCostPrice;
            this.supplierRef = supplierRef;
            this.onOrderFlag = onOrderFlag;
        }

        /**
         * gets the items with name out of the item class
         * @param itemName
         * @return
         */
        public String getItemName(String itemName){
            return this.itemName;
        }
        public int getUniqueId(int uniqueId){
            return this.uniqueId;
        }
        public int getQuantityInStock(int quantityInStock){
            return this.quantityInStock;
        }
        public int getReorderLevel(int reorderLevel){
            return this.reorderLevel;
        }
        public int getReOrderQuantity(int reOrderQuantity){
            return this.reOrderQuantity;
        }
        public int getUnitCostPrice(int unitCostPrice){
            return this.unitCostPrice;
        }
        public Supplier getSupplierRef(Supplier supplierRef){
            return this.supplierRef;
        }
        public boolean getOnOrderFlag(boolean onOrderFlag){
            return this.onOrderFlag;
        }
        public boolean setItemName(String itemName) {
            boolean set = false;
            if (!Objects.equals(itemName, "")) {
                this.itemName = itemName;
                set = true;
            }
            return set;
        }
        public boolean setUniqueId(int uniqueId){
            boolean set = false;
            if(uniqueId != 0){
                this.uniqueId = uniqueId;
                set = true;
            }
            return set;
        }
        public boolean setQuantityInStock(int quantityInStock){
            boolean set = false;
            if(quantityInStock != 0){
                this.quantityInStock = quantityInStock;
                set = true;
            }
            return set;
        }
        public boolean setReorderLevel(int reorderLevel){
            boolean set = false;
            if(reorderLevel != 0){
                this.reorderLevel = reorderLevel;
                set = true;
            }
            return set;
        }
        public boolean setReOrderQuantity(int reOrderQuantity){
            boolean set = false;
            if(reorderLevel != 0){
                this.reorderLevel = reorderLevel;
                set = true;
            }

            return set;
        }
        public boolean setUnitCostPrice(int unitCostPrice){
            boolean set = false;
            if(unitCostPrice != 0){
                this.unitCostPrice = unitCostPrice;
                set = true;
            }
            return set;
        }
        public boolean setSupplierRef(int supplierRef){
            boolean set = false;
            if(supplierRef != 0){
                this.supplierRef = supplierRef;
                set = true;
            }
            return set;
        }
        public boolean setOnOrderFlag(boolean onOrderFlag){
            boolean set = false;
            if(onOrderFlag){
                this.onOrderFlag = onOrderFlag;
                set = true;
            }
            return set;
        }

    //Attributes:  itemName, uniqueId, quantityInStock, reorderLevel, reOrderQuantity, unitCostPrice, supplierRef and onOrderFlag.

    //A no argument constructor and a constructor that has parameters for all relevant instance variables.

    //All mutator methods should return booleans and have appropriate validation.

    //It should be possible for clients to increase and decrease the quantityInStock of any item using public methods provided by Item class.
    //Note that there cannot be a negative stock quantity.

    //You may assume for now that each product has only one supplier.

    //Override the toString() method.
    }
    //Class Delivery:
    public class Delivery {


    //Attributes: itemRef, date, quantity
        //be of type item
        private int itemRef;
            //for use in local date instance
        private LocalDate date = LocalDate.now();
        private int quantity;

        public Delivery()
        {
            //of type int
            this.itemRef = 0;
            this.date = LocalDate.parse("0000/00/00");
            this.quantity = 0;
        }
        public Delivery(int ref, LocalDate d, int quan)
        {
            this.itemRef = ref;
            this.date = d;
            this.quantity = quan;
        }

        /**
         *
         * @param ref
         * @return itemRef
         * to find item reference number of a delivery
         */
        public int getItemReference(int ref){
            return this.itemRef;
        }
        /**
         *
         * @param d
         * @return date
         * to find date of delivery
         */

        public LocalDate getDate(int d){
            return this.date;
        }
        /**
         *to get the quantity in the delivery class
         * @param quan
         * @return quantity
         */
        public int getQuantity(int quan){
            return this.quantity;
        }

        /**
         * to set the item reference in Delivery
         * @param ref
         */
        public boolean setItemRef(int ref){
            boolean set = false;
            if(ref > 0) {
                this.itemRef = ref;
                set = true;
            }
            return set;
            }

        /**
         * to set the date in the delivery class
         * @param d
         */
        public boolean setDate(LocalDate d){
            boolean set = false;
            if(d != null) {
                this.date = d;
                set = true;
            }
            return set;
        }

        /**
         * to set the quantity in the delivery class
         * @param quan
         */
        public boolean setQuantity(int quan){
            boolean set = false;
            if(quan > 0) {
                this.quantity = quan;
                set = true;
            }
            return set;

        }

    //All mutator methods should return booleans and have appropriate validation.

    //calculateDeliveryCost() calculates and returns the delivery cost by multiplying the quantity by the unitCostPrice of the item.

    //Override the toString() method.
    }
    //Version1App
    public static void Version1App() {

    }}
    //No user input is required in this version.

    //Create at least 3 Supplier objects s1, s2, s3, 5 Item objects, i1, i2, i3, i4, i5 and at least 3 Delivery objects, d1, d2, d3. Note that when an item is delivered the quantityInStock and amount owed fields should be updated.
    //Display the cost of d1.
    //Display the amount owed to a Supplier and the quantity in stock of an item before and after a delivery of that item is received from that supplier.

