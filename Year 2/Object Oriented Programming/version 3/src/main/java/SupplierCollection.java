import java.io.*;
import java.util.*;

public class SupplierCollection{
    private static ArrayList<Supplier> suppliersAr;
    private static int supplierAmount;

    public SupplierCollection() {
        suppliersAr = new ArrayList<>();
        supplierAmount = 0;
    }

    public SupplierCollection(FileInputStream binoFile) throws IOException, ClassNotFoundException {
        ObjectInputStream bin = new ObjectInputStream(binoFile);
        suppliersAr = (ArrayList<Supplier>) bin.readObject();
    }

    /**
     * to Add a Supplier to a supplier array
     * @param supplier - a supplier to add
     */
    public void add(Supplier supplier) {
        //if the supplier isnt null it will add it to the array
        if(supplier != null) {
            suppliersAr.add(supplier);
            supplierAmount++;
        }
    }

    /**
     * Adds the Suppliers to the supplier array when given a file name as string
     * @param fName - file name - file name with the file containing information to add
     * @throws IOException
     */
    public static void add(String fName) throws IOException {
        try{
            //creating a reader to read the file
            Scanner read = new Scanner(new File(fName));

            //checks if a next line exists and if it does it will assign it to a string
            if(read.hasNextLine()) {

                String supplierString = read.nextLine();

                //will split the line after each comma into an array
                String[] supplierStringAr = supplierString.split(",");

                //initialise the newSupplier that will be made
                Supplier newSupplier;
                try {
                    //creating a new supplier and adding each variable into it,
                    newSupplier = new Supplier(supplierStringAr[0], supplierStringAr[1], Double.parseDouble(supplierStringAr[2]), int.class.cast(supplierStringAr[3]));
                    //adding the supplier into the array
                    suppliersAr.add(newSupplier);
                    supplierAmount++;
                } catch (NumberFormatException exception) {
                    //if a number isnt found it will add it to another file called invalidSupplier
                    PrintWriter failedTransfer = new PrintWriter(new File("invalidSupplier.txt"));
                    failedTransfer.println("Invalid Supplier: " + supplierString);
                    System.out.println("Invalid Values inputted, check invalidSupplier.txt");
                }

            }
        }catch(FileNotFoundException exception){
            System.out.println("File Not Found");
        }
    }

    /**
     * displays all suppliers in the suppliers array in alphabetical order
     */
    public static void displayAll(){
        //if the array isnt null it will print each entry
        if(supplierAmount != 0){
            for(int i = 0; i <= supplierAmount;i++)
                System.out.println("Supplier Name: " + suppliersAr.get(i * 4).toString() + ", Supplier Address: " + suppliersAr.get((i * 4)+1).toString() +", Amount Owed: " + suppliersAr.get((i * 4) + 2).toString() + ", Amount Owed: " + suppliersAr.get((i * 4)+3).toString());
        }
    }

    /**
     * displays the suppliers based on how much is owed in decending order
     */
    public static void displayCreditors(){
        if(supplierAmount != 0){
            for(int i = 0; i < suppliersAr.size();i++)
                System.out.println("Supplier Name: " + suppliersAr.get(i * 4) + ", Supplier Address: " + suppliersAr.get((i * 4)+1) +", Amount Owed: " + suppliersAr.get((i * 4) + 2) + ", Amount Owed: " + suppliersAr.get((i * 4)+3));
        }
    }

    /**
     * stores the suppliers in a file with the given file name
     * @param fName - name if the file to add the suppliers too
     * @throws IOException
     */
    public static void storeSuppliers(String fName) throws IOException {
        File newFile = new File(fName);
        PrintWriter store = new PrintWriter(newFile);
        store.println(suppliersAr);
    }

    /**
     * will display invalid supplier text file
     * @throws FileNotFoundException
     */
    public static void displayInvalidRecords() throws FileNotFoundException {
        PrintStream display = new PrintStream( new File("InvaidSupplier"));
        System.out.println(display);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. Create a Suppliers object, group1 using the no argument constructor.
        SupplierCollection group1 = new SupplierCollection();

        // 2. Call the add method in the Suppliers class using suppliers.txt as a parameter.
        add("Suppliers.txt");

        // 3. Call displayAll()
        System.out.println("Displaying all suppliers in group1:");
        group1.displayAll();

        // 4. Write a static method to display all invalid records from suppliers.txt. Call this method.
        displayInvalidRecords();

        // 5. Call storeSuppliers() using sup.bin as an argument.
        group1.storeSuppliers("sup.bin");

        // 6. Create a Suppliers object, group2 passing sup.bin as an argument to the parameterized constructor.
        FileInputStream supBin = new FileInputStream("sup.bin");
        SupplierCollection group2 = new SupplierCollection(supBin);

        // 7. Display all group2 suppliers.
        System.out.println("Displaying all suppliers in group2:");
        group2.displayAll();
    }
}

