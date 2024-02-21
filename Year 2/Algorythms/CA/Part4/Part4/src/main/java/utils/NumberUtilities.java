ipackage utils;

import java.util.Arrays;

/**
 *
 * @author michelle
 */
public class NumberUtilities {
    //1.1 Create a method (in NumberUtilities.java) that deletes a value from a specified position using the
    //overwriting approach. Your method should:
    // (a) Be called overwrite
    //(b) Take in an array of ints & a single int; the POSITION to delete from
    //(c) Return nothing

    /**
     * removes the position value from the array
     * @param nums an array to search through
     * @param position a position to find
     */
    public static void overwrite(int[] nums, int position) {
        //checks to see if the position is out of bounds (i.e. too big for the array or an int less than 0)
        if (position <= (nums.length-1) && position > -1) {
            //int i is where the position is pl
            // us how many ints after that it has gone through.
            for (int i = 0; i != nums.length-2; i++) {
                //having the altered array copy from the next slot

                nums[i+position] = nums[i+position+1];
            }
            //final slot changed to 0 after the array has been gone through.
            nums[nums.length-1] = 0;
        }


    }


    //1.2 Create a method (in NumberUtilities.java) that deletes the first instance of a specified value using
    //the shifting approach. Subsequent instances of that value should be kept. Your method should:
    //(a) Be called shiftDelete
    //(b) Take in an array of ints & a single int; the VALUE to be deleted
    //(c) Return whether or not the value could be deleted.

    /**
     * finds value in an array and replaces it with the next value in array, going through the array and moving each slot over to the next deleting the given value
     * @param nums an int array to shift delete from
     * @param value a value to search and shift delete
     * @return if it returns false the value either wasn't changed or didn't exist
     */
    public static boolean shiftDelete(int[] nums, int value) {
        //set to false by default as it hasn't completed the shift deletion
        boolean valid = false;
        //counter is to count when and how many of variable value appeared.
        int counter = 0;
        //nothing in the array, no problem. it will stop here if there isn't anything
        if (nums.length != 0) {
            //finding the index of the first occurring inputted value
            int index = indexOf(nums, value);
            if (index != -1){
            //if it does exist
                for (int i = 0; i < nums.length-1; i++) {
                    //when it turns true for the first time it will lock itself out of using these lines of code to stop it from searching for all the times it appears
                    if(!valid){
                        //when it finds the value
                        if (value == nums[i]) {
                        //counter goes up.
                        counter++;
                        //and because the shift deletion will have occurred directly after this point
                        valid = true;
                        }
                    }
                    //counter is set to 0 and when the number is found. counter goes up by 1 and it will skip that value.
                    nums[i] = nums[i + counter];
                }
                //final slots being set to 0 as they have already been copied to their places.
                for(int i = 0; i < 1;i++) {
                    nums[nums.length-1] = 0;
                }
            //if the value doesn't exist it won't search for the value
            }

        }
        //returning the valid boolean informing the user if it has worked or not
        return valid;
    }

        //1.3 Create a method (in NumberUtilities.java) that deletes all instances of a specified value using the
        //resizing approach. Your method should:
        //(a) Be called resizeDelete
        //(b) Take in an array of ints & a single int; the VALUE to be deleted
        //(c) Return the new version of the array
        public static int[] resizeDelete ( int[] nums, int value){
        int counter = 0;
        //counter to find out how many of int value appear in the array
        for (int i = 0; i < nums.length-1;i++){
            //searching for int value in array
            if(nums[i]==value){
                //counter goes up once for each int value.
                counter++;
            }
        }
        //the size if the result array is the length of the original minus the count of how many of int value appear.
        int [] result = new int[nums.length-counter];
        //resets the counter to count again
        counter = 0;
        //loop to go through every int in nums
        for(int i = 0; i < nums.length;i++){
            //if the value is found it will count it in counter and not copy it
            if(nums[i]==value){
                counter++;
            }
            //if the value isn't the current value it will copy it
            else {
                result[i-counter] = nums[i];
            }
        }
        return result;
        }

        /**
         * searches for the index of a given value in an array
         * @param nums the array to search through
         * @param value a value to search for
         * @return returns the index of the value in array
         */
    public static int indexOf(int[] nums, int value) {
        //set to out of bounds by default as it hasn't found the value in array
        int index = -1;
        //will check each value of array
        for (int i = 0; i < nums.length; i++) {
            //if it finds the value
            if (nums[i] == value) {
                //index is set to the slot of value
                index = i;
            }
        }
        return index;
    }
}
