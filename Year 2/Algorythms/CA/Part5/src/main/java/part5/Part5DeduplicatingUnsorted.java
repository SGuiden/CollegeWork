package part5;

import business.Book;
import utils.FileHandlingUtilities;
import utils.BookUtilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author michelle
 */
public class Part5DeduplicatingUnsorted {
    //1.6 Write a program called Part5DeduplicatingUnsorted.java (in the part5 package), employing the methods
    //created above. This program does not need to employ the deduplication methods that are based on sorted
    //data. The program should:
    //(a) Prompt the user to enter the name of a file of book data to be read
    //(b) Read in the file and store its information as an array
    //(c) Ask the user if they wish to work with the data in an array or an arraylist
    //(d) Deduplicate the data in the form the user chooses (if they choose an arraylist, you should create an
    //arraylist of the information, THEN deduplicate that list)
    //(e) Display the deduplicated data to the user
    //(f) Inform the user how many duplicates were removed from the data

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] data = FileHandlingUtilities.readBookFile("SampleInput/Part5UnsortedSampleInputDuplicates.txt");
        for(Book b: data){
            System.out.println(b);

        }
        ArrayList<Book> BooksArList = new ArrayList<Book>();
        Book [] BooksArray = new Book[data.length];
        //(a) Prompt the user to enter the name of a file of book data to be read
        System.out.println("Please enter the name of a file of book data");
        //(b) Read in the file and store its information as an array
        String ans = sc.nextLine();
        //(c) Ask the user if they wish to work with the data in an array or an arraylist
        System.out.println("Do you wish to work with an Array(false) or ArrayList(true");
        boolean isArList = sc.nextBoolean();
        //(d) Deduplicate the data in the form the user chooses (if they choose an arraylist, you should create an
        //arraylist of the information, THEN deduplicate that list)
        if(isArList){
            for(int i = 0; i<data.length;i++) {
                BooksArList.set(i, data[i]);
            }
            BooksArList = BookUtilities.deduplicateList(BooksArList);
            System.out.println(BooksArList.toString());
        }
        else{
            BooksArray = BookUtilities.deduplicateUnsorted(BooksArray);
            for(int i = 0; i != BooksArray.length;i++){
                System.out.println("Book " + i + " is " +BooksArray);
            }
        
        }
        //(e) Display the deduplicated data to the user
        //(f) Inform the user how many duplicates were removed from the data
    }
}
