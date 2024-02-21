package org.example;
    public class SupOrder {
        private int itemRef;
        private String date;
        private int quantity;
        private int uniqueId;
        //static int idCount is to count how many unique ids have been assigned
        private static int idCount = 0;

        public SupOrder(int itemRef, String date, int quantity) {
        this.itemRef =1;
        this.date = "00/00/0000";
        this.quantity = 0;
        this.uniqueId = idCount;
        idCount++;
        }

        /**
         * getting the itemRef
         * @return itemRef - the item Reference number
         */
        public int getItemRef() {
            return itemRef;
        }

        /**
         * setting an item ref
         * @param itemRef - an item reference number
         * @return compete - is a boolean to say if the itemRef passed
         */
        public boolean setItemRef(int itemRef) {
            //by default it is set to false as it doesnt know if it has passed yet
            boolean complete = false;
            //validation for item ref
            if(itemRef > 0 && itemRef < 9999999) {
                this.itemRef = itemRef;
                //right after its passed it is set to true to let the user know its a valid ItemRef
                complete = true;
            }
            return complete;
        }

        /**
         * getting the unique id in the Object
         * @return - uniqueId
         */
        public int getUniqueId() {
            return uniqueId;
        }

        /**
         * setting a uniqueId in the Object
         * @param idCount - using the counter we know how many ids exist
         * @return complete - is a boolean to say if the UniqueId has passed
         */
        public boolean setUniqueId(int idCount) {
            boolean complete = false;
            //no if/if-else statements needed as the static idCount is ensuring it isnt used
            this.uniqueId = idCount;
            //as it has been set complete then is true.
            complete = true;

            return complete;
        }

        /**
         * getting quantity from the Object
         * @return quantity
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * setting the quantity
         * @param quantity - how much of an item is being ordered
         * @return compete - is a boolean to say if the item has been passed
         */
        public boolean setQuantity(int quantity) {
            boolean complete = false;
            //if the quantity is 0 or less than it won't pass or validate
            if(quantity > 0) {
                this.quantity = quantity;
                complete = true;
            }
            return complete;

        }

        /**
         * getting the date from SubOrder
         * @return date - what date the order was created
         */
        public String getDate() {
            return date;
        }

        /**
         * setting the date for the Object
         * @param date
         * @return
         */
        public boolean setDate(String date) {
            boolean complete = false;
            this.date = date;
            complete = true;
            return complete;

        }

    }
