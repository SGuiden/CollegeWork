package part5;

import business.Book;
import utils.FileHandlingUtilities;

/**
 *
 * @author michelle
 */
public class Part5DeduplicatingSorted {
    //1.7 Write a program called Part5DeduplicatingSorted.java (in the part5 package), employing the methods
    //created above. The program should:
    //(a) Take in an array of Books from a hard-coded file (you should create this file before writing this
    //program, or you may use an existing sample file)
    //(b) Print out the array in its original state
    //(c) If the data is in ascending order (case-sensitive) within the array, deduplicate it and display the result
    //to the user
    //(d) If the data is not in ascending order, ask the user to supply a new filename. Repeat this process
    //(steps a, b, c and d) until an array of data has successfully been deduplicated (i.e. you have found an
    //array with its data in ascending order (case-sensitive) and have deduplicated it).
    //Note: As you have not yet done file I/O using Java, code for the file handling will be present in the
    //FileHandlingUtilities class of the project.
    public static void main(String[] args) {
        Book[] data = FileHandlingUtilities.readBookFile("SampleInput/Part5SortedSampleBookInputDuplicates.txt");
        for(Book b: data){
            System.out.println(b);
        }
    }
}
