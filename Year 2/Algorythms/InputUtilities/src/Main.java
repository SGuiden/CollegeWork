class InputUtilities {
    public static int getMax(int[] nums) {

        //  input : array of numbers (nums)
        //
        //  create max tracker + set to first num in nums
        //
        //  for each element in nums
        //      if current element > max
        //          set max to current element
        //
        //  return max

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static double getMax(Double[] nums) {
        double max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    /**
     * 1.	Write a Java method, multiple {}, to check whether an integer 1.
     * Write a Java method, multiple {}, to check whether an integer value, passed as a parameter, is a multiple of 3 or 5.value,
     * passed as a parameter, is a multiple of 3 or 5
     */
    public static boolean multiple3r5(int num) {
        boolean ans = false;
        if ((num % 3 == 0) || (num % 5 == 0)) {
            ans = true;
            return ans;
        } else {
        }
        return ans;
    }

    public static int checkLargest(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            return num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            return num2;
        } else if ((num3 > num1) && (num3 > num2)) {
            return num3;
        } else if ((num1 == num2) || (num1 == num3)) {
            return num1;
        }
        return num2;
    }

    public static String Swap(String input) {
        String swap1 = input.substring(0, 2);
        String swap2 = input.substring(2, 4);
        return swap2 + swap1;
    }


    public static int tempConverter(double temp, String Measure) {
        double newTemp = 0;
        int ans = 0;
        if (Measure.equalsIgnoreCase("C")) {
            newTemp = ((temp * 9) / 5) + 32;
        } else if (Measure.equalsIgnoreCase("f")) {
            newTemp = ((temp - 32) * 5) / 9;
        }
        if (newTemp - (int) newTemp >= 0.5) {
            ans = (int) newTemp + 1;
        } else {
            ans = (int) newTemp;
        }

        return ans;
    }

    /**
     * finds the pos of the first instance of a supplied String within an array
     *
     * @param textArray The String array to be searched
     * @param text      The String to be found
     * @return
     */
    public static int getFirst(String[] textArray, String text) {
        for (int i = 0; i < textArray.length - 1; i++) {
            if (textArray[i].equals(text)) {
                return i;
            }
        }
        return 0;
    }

    /**
     * finds the pos of the Last instance of a supplied String within an array
     *
     * @param textArray The String array to be searched
     * @param text      The String to be found
     * @return
     */
    public static int getLast(String[] textArray, String text) {
        for (int i = textArray.length - 1; i > 0; i--) {
            if (textArray[i].equals(text)) {
                return i;
            }
        }
        return 0;
    }

    public static int[] blankDeletionSorted(int[] origin) {
        int[] sortedAr = new int[origin.length - 1];
        int tracker = 0;
        //for each element up to the second last slot(length-1)
        for (int i = 0; i < origin.length - 1; i++) {

            //if current element is not same as next element, add current element to unique array at tracker pos, increase tracker
            if (origin[i] != origin[i + 1]) {
                //add last element in original array to unique array at tracker pos
                sortedAr[tracker + 1] = origin[i];

                tracker = tracker + 1;
            }
            //if doing blank deletion
            if (origin[i] == 0) {
                int[] tempArray = sortedAr;
                sortedAr = new int[tracker + 1];
                for (int o = 0; o < sortedAr.length - 1; o++) {
                    //create new array of size tracker+1
                    //copy elements from unique to new array
                    sortedAr[o] = tempArray[o];
                }
            }

            //return unique
            return sortedAr;

        }
        return sortedAr;
    }

    //return type is boolean, need your Dedup array to see if the sarchNum is
    //contained in the array
    //    public static boolean numAppearsInArray(int [] arDedup, int searchNum)
    //    {
    //        for (int i = 0; i<arDedup.length; i++)
    //        {
    //            if (arDedup[i] == searchNum)
    //            {
    //                return true;
    //            }
    //        }
    //        return false;
    //    }
    //removes any duplicates in the array
    //    public static int [] deDuplicatingArrays (int [] originAr)
    //    {
    //
    //        System.out.println("origial");
    //        System.out.println(Arrays.toString(originAr));
    //        //new array is the same length as the original
    //        int [] newAr = new int[originAr.length];
    //
    //        int endofNewAr = 0;
    //
    //        for (int i =0; i < originAr.length; i++)
    //            //using index of method to find out if the number exists already and if it doesnt it carries it over
    //            if (indexOf(newAr, originAr[i]) == -1)
    //            {
    //                newAr[i] = originAr[i];  //add tracker to not count 0s (cant be in sync)
    //            }
    //
    //        //loops through new array until it finda the null spaces and tells endofnewar that thats where the blank spaces start
    //        for (int i=0; i < newAr.length-1;i++)
    //        {
    //            if (newAr[i] == 0);
    //            {
    //                endofNewAr = i;
    //            }
    //        }
    //        System.out.println("New AR");
    //        System.out.println(Arrays.toString(newAr));
    //
    //        //length od final is where 0 starts in new ar
    //        int [] FinalAr = new int[endofNewAr];
    //
    //        //copying every slot before the 0s in new ar to final ar
    //        for(int i =0; i < FinalAr.length-1;i++)
    //        {
    //            if (newAr[i]==0)
    //            {
    //                i++;
    //            }
    //            else
    //            {
    //                FinalAr[i] = newAr[i];
    //            }
    //
    //
    //        }
    //        System.out.println("Final AR");
    //        System.out.println(Arrays.toString(FinalAr));
    //    return FinalAr;
    //    }


    //    public static boolean shiftDelSlot (String [] shiftDel, int slot)
    //    {
    //        shiftDel[slot] = null;
    //        if (shiftDel[slot] == null)
    //        {
    //            System.out.println("the Value has been deleted");
    //            return true;
    //        }
    //        else
    //        {
    //            System.out.println("Failed to delete Value");
    //
    //        }
    //        return false;
    //    }
    //checks to see if a value is in an array
    public static int indexOf(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

//    public static boolean shiftDelValue (int [] data, int value)
//    {
//        //nothing in the array, no problem. it will stop here if there isnt anything
//        if(data.length == 0)
//        {
//            return false;
//        }
//        //data is in the array but if there isnt the same value it will stop here
//        //will bring back the position and if that position is -1 or doesnt exist it will end
//       int index = indexOf(data, value);
//       if (index == -1)
//       {
//           return false;
//       }
//
//
//       for (int i =0;i<data.length-1; i++)
//       {
//           //pushing the data forward
//           data[i] = data[i+1];
//       }
//
//       //will delete the final slot in the array
//       data[data.length-1] = 0;
//
//
//        return false;
//    }

    public static int[] merging2Arrays() {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {5, 6, 7, 8, 9, 10};
        int tracker = 0;

        //make an array big enough to store the two arrays
        int[] mergeAr = new int[ar1.length + ar2.length];

        //loop until you copy all of array1 to the merged array
        for (int i = 0; i < ar1.length; i++) {
            mergeAr[tracker] = ar1[i];
            tracker++;
        }
        //loop until you have added array2 to the end of the merged array
        for (int i = 0; i < ar2.length; i++) {
            mergeAr[tracker] = ar2[i];
            tracker++;
        }
        return mergeAr;


    }
}

