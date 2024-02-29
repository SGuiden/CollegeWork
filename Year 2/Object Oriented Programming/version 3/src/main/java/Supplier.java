public class Supplier extends SupplierCollection{
    //should be private
    private String supplierName;
    private String supplierAddress;
    private double amountOwed;
    int creditLimit;

    public Supplier() {
        String supplierName = "";
        String supplierAddress = "";
        double amountOwed = 0;
        int creditLimit = 0;
    }

    public Supplier(String supplierName, String supplierAddress, double amountOwed, int creditLimit) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.amountOwed = amountOwed;
        this.creditLimit = creditLimit;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public String getSupplierAddress(String supplierAddress) {
        return this.supplierAddress;
    }

    public double getAmountOwed(int amountOwed) {
        return this.amountOwed;
    }

    public int getCreditLimit(int creditLimit) {
        return this.creditLimit;
    }

    public boolean setSupplierName(String supplierName) {
        boolean set = false;
        if (supplierName != "") {
            this.supplierName = supplierName;
            set = true;
        }
        return set;
    }

    public boolean setSupplierAddress(String supplierAddress) {
        boolean set = false;
        if (supplierAddress != "") {
            this.supplierAddress = supplierAddress;
            set = true;
        }
        return set;
    }

    public boolean setAmountOwed(int amountOwed) {
        boolean set = false;
        if (amountOwed != 0) {
            this.amountOwed = amountOwed;
            set = true;
        }
        return set;
    }

    public boolean setCreditLimit(int creditLimit) {
        boolean set = false;
        if (creditLimit != 0) {
            this.creditLimit = creditLimit;
            set = true;
        }
        return set;
    }
}
