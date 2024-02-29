import java.time.LocalDate;
public class Delivery extends item{


        //Attributes: itemRef, date, quantity
        //be of type item
        private item itemRef;
        //for use in local date instance
        private LocalDate date = LocalDate.now();
        private int quantity;

        public Delivery() {
            //of type int
            this.itemRef = null;
            this.date = LocalDate.parse("00/00/0000");
            this.quantity = 0;
        }

        public Delivery(item ref, LocalDate d, int quan) {
            this.itemRef = ref;
            this.date = d;
            this.quantity = quan;
        }

        /**
         *
         * @return itemRef
         * to find item reference number of a delivery
         */
        public item getItemReference() {
            return this.itemRef;
        }

        /**
         *
         * @return date
         * to find date of delivery
         */

        public LocalDate getDate() {
            return this.date;
        }

        /**
         * to get the quantity in the delivery class
         *
         * @param quan
         * @return quantity
         */
        public int getQuantity(int quan) {
            return this.quantity;
        }

        /**
         * to set the item reference in Delivery
         *
         * @param ref
         */
        public boolean setItemRef(item ref) {
            boolean set = false;
            if (ref != null) {
                this.itemRef = ref;
                set = true;
            }
            return set;
        }

        /**
         * to set the date in the delivery class
         *
         * @param d
         */
        public boolean setDate(LocalDate d) {
            boolean set = false;
            if (d != null) {
                this.date = d;
                set = true;
            }
            return set;
        }

        /**
         * to set the quantity in the delivery class
         *
         * @param quan
         */
        public boolean setQuantity(int quan) {
            boolean set = false;
            if (quan > 0) {
                this.quantity = quan;
                set = true;
            }
            return set;

        }
    }

