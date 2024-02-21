package part4;

import java.util.Scanner;

import static utils.FileHandlingUtilities.readNumericFile;
import static utils.NumberUtilities.*;

/**
 *
 * @author michelle
 */
public class Part4DeletingByPosition {
    public static void main(String[] args) {
        //Write a program called Part4DeletingByPosition (in part4), employing the methods created above
        //(along with any others you have written that you feel could be helpful). The program should:
        //(a) Take in numbers from a file and create an array based on these numbers.
        // Read in array of numbers from file
        int[] nums = readNumericFile("SampleInput/Week5SampleInput1.txt");
        //(b) Prints out the array in its original state (including position information)
        for(int i = 0; i < nums.length-1;i++){
            System.out.println("value " + nums[i]+ " is in position "+i);
        }
        //(c) Ask the user what position they would like to delete from
        Scanner keyboard = new Scanner(System.in);
        int pos = -1;
        int value;
        for(int i = 0; i != 1;) {
            System.out.println("which position would you lie to delete");
            pos = keyboard.nextInt();
            if(pos>-1 && pos< nums.length){
                i++;
            }
        }
        value = nums[pos];
        //(d) Delete the number from the specified position
        System.out.println("What type if method do you want to use? 'Shiftdel','Overwrite','Resize'");
        String methodUsed = keyboard.next();
        if(methodUsed.equalsIgnoreCase("ShiftDel")){
            shiftDelete(nums,value);
        }
        else if(methodUsed.equalsIgnoreCase("Overwrite")){
            overwrite(nums,pos);
        }
        else if(methodUsed.equalsIgnoreCase("Resize")){
            nums = resizeDelete(nums,value);
        }
        //(e) Print out the array in its updated state (including position information)
        for(int i = 0; i < nums.length;i++) {
            System.out.print("the value "+nums[i]+" is in position "+ i);
        }
    }
}