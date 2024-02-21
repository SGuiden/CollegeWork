package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] ar1 = {1,2,3,4};
        int [] ar2 = {5,6,7,8,9,10};
        int [] mergeAr = merging2Arrays(ar1,ar2);
        System.out.println(Arrays.toString(mergeAr));
    }
//Exercise 2.1) Merging unsorted numeric data
//Write a method that:
//Takes in two numeric arrays (nums1 and nums2)
//Creates a larger numeric array
//Fills it with the contents of the two original arrays in an unsorted manner
//Returns the new array
        public static int [] merging2Arrays(int [] ar1, int [] ar2)
        {
            //make an array big enough to store the two arrays
            int [] mergeAr = new int [ar1.length + ar2.length];

            //loop until you copy all of array1 to the merged array
            for (int i = 0; i < ar1.length; i++)
            {
                mergeAr[i] = ar1[i];
            }
            //loop until you have added array2 to the end of the merged array
            for (int i = 0; i < ar2.length; i++)
            {
                mergeAr[i+ar1.length] = ar2[i];
            }
            return mergeAr;

        }
    }
