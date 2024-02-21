package part3;

import java.util.Scanner;

import static utils.StringUtilities.merge;
import static utils.StringUtilities.partition;

/**
 *
 * @author michelle
 */
public class Part3MergeAndPartition {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //1.3 Write a program called Part3MergeAndPartition.java (in the part3 package), employing the methods
        //above (along with any others you have written that you feel could be helpful). The program should:
            //(a) Ask the user to specify how many words they will enter and use it to make an array.
        String [] array;
        int arraylength;
        String [] array2;
        int array2length;
        String [] partitioned;

        System.out.println("how many words would you like to enter for your array?");
        arraylength = keyboard.nextInt();
        array = new String [arraylength];
            //(b) Repeatedly ask the user to enter a word and store it in your array.
        for(int i = 0; i<arraylength;i++){
            System.out.println("Please enter word for slot " + i);
            array[i] = keyboard.next();
        }
            //(c) Display the array contents to the user
        System.out.println(array.toString());
            //(d) Ask if they wish to create a second array of words
        System.out.println("Do you wish to create a second array? 'Y' for yes, anything else will be taken as a no.");
        String Ans = keyboard.next();
                //i. If yes:
        if (Ans.equalsIgnoreCase("Y")) {
                //• Repeat steps a through c
            System.out.println("how many words would you like to enter for your array?");
            array2length = keyboard.nextInt();
            array2 = new String [array2length];
            for(int i = 0; i<array2length;i++){
                System.out.println("Please enter word for slot " + i);
                array2[i] = keyboard.next();
            }
            System.out.println(array2.toString());
                //• Merge all contents of the new array with all contents of the original one
            String [] mergedArray = new String[arraylength+array2length];
            mergedArray = merge(array,array2,arraylength,array2length);
    }
        //• Display the merged array
            System.out.println(mergedArray.toString());

            //(e) Ask the user to enter a word to function as the pivot for partitioning.
        System.out.println("please enter a word to be the pivot for partitioning");
        String pivot = keyboard.next();
            //(f) Partition the array based on the supplied word
        partitioned = partition(array, pivot);
                //i. If a second array was created at step d, the merged array should be partitioned
        if (Ans.equalsIgnoreCase("Y")) {
            partitioned = partition(mergedArray, pivot);
        }
            //(g) Display the new version of the array (including its position information).
        System.out.println(partitioned.toString());
    }
}
