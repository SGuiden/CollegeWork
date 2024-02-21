package part4;

import java.util.Scanner;

import static utils.NumberUtilities.*;


/**
 *
 * @author michelle
 */
public class Part4DeletingByValue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        //1.4 Write a program called Part4DeletingByValue.java (in part4), employing the methods above (along
        //with any others you have written that you feel could be helpful). The program should:
        //(a) Create a hard-coded array containing 10 ints
        int [] nums = {0,1,2,3,4,5,6,7,8,9};
        //(b) Print out the array in its original state (including position information)
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        //(c) Ask the user for a number to be deleted
        System.out.println("Please select a number to delete");
        int value = keyboard.nextInt();
        //(d) Ask the user which deleting approach they would like to use (provide a menu of appropriate
        //options from the methods you have written above, and let them choose which should be
        //used)
        System.out.println("What type if method do you want to use? 'Shiftdel','Overwrite','Resize'");
        String methodUsed = keyboard.next();
        //(e) Delete the number from the array using the approach they have selected
        if(methodUsed.equalsIgnoreCase("ShiftDel")){
            if(shiftDelete(nums,value)){
                valid = true;
            }
        }
        else if(methodUsed.equalsIgnoreCase("Overwrite")){
            int position = -1;
            for (int i = 0; i < nums.length-1;i++){
                do {
                    if (nums[i] != value) {
                    } else {
                        position = i;
                        valid = true;
                    }
                }while(!valid);
            }
            overwrite(nums,position);
        }
        else if(methodUsed.equalsIgnoreCase("Resize")){
            for (int i = 0; i < nums.length-1;i++){
                do {
                    if (nums[i] != value) {
                    } else {
                        valid = true;
                    }
                }while(!valid);
            }
            nums = resizeDelete(nums,value);
        }
        //(f) Print out a message indicating whether or not it was deleted and display the array again
        //(including position information).
        if(!valid){
            System.out.println("Unsuccessful");
        }
        else{
            System.out.println("Deleted");
        }
        for(int i = 0; i < nums.length;i++) {
            System.out.print("the value "+nums[i]+" is in position "+ i);
        }
    }
}
