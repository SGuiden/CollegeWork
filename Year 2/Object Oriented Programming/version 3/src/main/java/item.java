//Class Item:

import java.time.LocalDate;
import java.util.Objects;

public class item {
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

    public item() {
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
    public item(String itemName, int uniqueId, int quantityInStock, int reorderLevel, int reOrderQuantity, int unitCostPrice, Supplier supplierRef, boolean onOrderFlag) {
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
     * @return
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * finds the unique id of an item
     * @return the unique id for the item
     */
    public int getUniqueId() {
        return this.uniqueId;
    }

    /**
     * gets the quantity of an item in stock
     * @return the item quantity
     */
    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    /**
     * finds the number the item needs to be reOrdered
     * @return at what level the item needs to be reOrdered
     */
    public int getReorderLevel() {
        return this.reorderLevel;
    }

    public int getReOrderQuantity() {
        return this.reOrderQuantity;
    }

    public int getUnitCostPrice() {
        return this.unitCostPrice;
    }

    public Supplier getSupplierRef() {
        return this.supplierRef;
    }

    public boolean getOnOrderFlag(boolean onOrderFlag) {
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

    public boolean setUniqueId(int uniqueId) {
        boolean set = false;
        if (uniqueId != 0) {
            this.uniqueId = uniqueId;
            set = true;
        }
        return set;
    }

    public boolean setQuantityInStock(int quantityInStock) {
        boolean set = false;
        if (quantityInStock != 0) {
            this.quantityInStock = quantityInStock;
            set = true;
        }
        return set;
    }

    public boolean setReorderLevel(int reorderLevel) {
        boolean set = false;
        if (reorderLevel != 0) {
            this.reorderLevel = reorderLevel;
            set = true;
        }
        return set;
    }

    public boolean setReOrderQuantity(int reOrderQuantity) {
        boolean set = false;
        if (reorderLevel != 0) {
            this.reorderLevel = reorderLevel;
            set = true;
        }

        return set;
    }

    public boolean setUnitCostPrice(int unitCostPrice) {
        boolean set = false;
        if (unitCostPrice != 0) {
            this.unitCostPrice = unitCostPrice;
            set = true;
        }
        return set;
    }

    public boolean setSupplierRef(Supplier supplierRef) {
        boolean set = false;
        if (supplierRef == null) {
            this.supplierRef = supplierRef;
            set = true;
        }
        return set;
    }

    public boolean setOnOrderFlag(boolean onOrderFlag) {
        boolean set = false;
        if (onOrderFlag) {
            this.onOrderFlag = onOrderFlag;
            set = true;
        }
        return set;
    }
}

