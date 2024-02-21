package utils;

import business.Book;
import com.sun.jdi.Bootstrap;

import java.util.ArrayList;

/**
 *
 * @author michelle
 */
public class BookUtilities {



    //1.1 Create a method (in BookUtilities.java from the utils package) that makes a smaller version of a supplied
    //array. Your method should:
    // (a) Be called shrink
    //    //(b) Take in an array of Books (the source array) and an int (the number of elements to keep from the
    //    //source array)
    //    //(c) Return a new Book array containing the first X values from the array (where X is the supplied number
    //    //of elements)

    /**
     *
     * @param data - An Array of books to shrink
     * @param i - the number of slots you want to shrink to
     * @return - returns the shrunken array
     */
    public static Book[] shrink(Book[] data, int i) {
    //to stop the code from being overloaded when int i is greater than data.length
        if (i < 0 || i > data.length){
            //set i to data length as the input is invalid
            i = data.length;
        }

        Book[] shrunkArray = new Book[i];

        //loop to assign array elements
        for(int o = 0; o < i; o++) {
            shrunkArray[o] = data[o];
        }
        return shrunkArray;

    }


    //1.2 Create a method (in BookUtilities.java from the utils package) that deduplicates a supplied unsorted array
    //using the blank deletion approach. Your method should:
    //(a) Be called deduplicateUnsorted
    //(b) Take in an array of Books
    //(c) Return a Book array
    /**
     *
     * @param data
     * @return
     */
    public static Book[] deduplicateUnsorted(Book[] data) {
        //if its empty it will return the original array
        if(data != null) {

            Book[] dedup = new Book[data.length];
            //to keep count of how many elements are being carried over

            int tracker= 0;
            int counter = 0;
            for (int i = 0; i < data.length;i++) {

                //searching the array to find a duplicate
                if (!search(dedup, data[i])) {
                    if(i > data.length-1){
                        //if the element doesnt already exist it copies it over and adds +1 to tracker to move up in the new array
                        dedup[tracker] = data[i];
                    }
                    dedup[tracker] = data[i];tracker++;
                }
                else {
                    counter++;
                }

            }
            Book[] dedupUnsorted = new Book[data.length-counter];
            for(int i = 0; i <= dedupUnsorted.length-1; i++){
                dedupUnsorted[i]=dedup[i];
            }
            return dedupUnsorted;
        }
        else{
            return data;
        }
    }

    //1.3 Create a method (in BookUtilities.java) that checks if a supplied Book array is in ASCENDING (i.e. increasing)
    //sorted order (case SHOULD be considered in this ordering). Your method should:
    //(a) Be called isSortedAsc
    //(b) Take in an array of Books
    //(c) Return a boolean (true if it’s in ascending order, false otherwise)
    /**
     *
     * @param data
     * @return
     */
    public static boolean isSortedAsc(Book[] data) {
        if(data == null){
            return true;
        }
        for (int i = 0; i < data.length; i++) {
            if(i == data.length-1){
                return true;
            }
            if (data[i].compareTo(data[i + 1]) >= 0) {
                return false;
            }

        }
        return true;
    }


    //1.4 Create a method (in BookUtilities.java) that deduplicates a supplied array sorted in ascending order (casesensitive) using the array growth approach. Your method should:
    //(a) Be called deduplicateSorted
    //(b) Take in an array of Books
    //(c) Return a Book array
    /**
     *
     * @param data
     * @return
     */
    public static Book[] deduplicateSorted(Book[] data) {
        Book [] dedupData = deduplicateUnsorted(data);
        Book[] dedupSorted = new Book[dedupData.length];
        for(int i = 0;i<dedupData.length;i++){

        }
        return dedupSorted;
    }


    //1.5 Create a method (in BookUtilities.java) that deduplicates a supplied ArrayList of Books. Your method
    //should:
    //(a) Be called deduplicateList
    //(b) Take in an ArrayList<Book> object
    //(c) Return an ArrayList of Books
    //Note: For this, you should not use the array algorithms to do with blank deletion or array growth. You may
    //not use a Set, you must work solely with the ArrayList class.
    /**
     *
     * @param data
     * @return
     */
    public static ArrayList<Book> deduplicateList(ArrayList<Book> data) {
        ArrayList<Book> dedupList = new ArrayList<Book>();
        for(int i = 0; i< data.size();i++){
            if(!dedupList.contains(data.get(i))){
                dedupList.add(data.get(i));
            }
        }
        return dedupList;
    }


    public static boolean search(Book[] data, Book value) {
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    }

