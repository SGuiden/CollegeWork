package org.example;

import java.util.Scanner;

import static org.example.FileHandlingUtilities.readTextFile;

public class ShaunGuiden_Exam {
    //1) Write a static method to locate a specified String within a supplied array of sorted Strings.
    //a. Your method should take in an array of Strings (textArr) and a single String (value)
    //b. Your method should return the first position in which the String (value) was found within the array.
    //c. Your search should be done using linear search, and should take advantage of the sorted nature of the data to
    //optimise its operations (note: it should not sort the data itself.)

    /**
     * to find the first position of a value
     * @param textArr an array to search from
     * @param Value a value to search for
     * @return
     */
    public static int locate(String [] textArr, String Value){
        for(int i = 0; i < textArr.length-1; i++){
            if(textArr[i].equalsIgnoreCase(Value)){
                return i;
            }
        }
        return -1;
    }

    //2) Write a static method to merge two supplied arrays of Strings in sorted order. You should provide an int value for each array
    //indicating how many elements should be used from that array.
    //a. Your method should take in two arrays of Strings to be merged (text1 and text2) and two ints (count1 and count2)
    //indicating how many elements to use from their corresponding array.
    //b. Your method should return a new array containing the appropriate number of elements from the original
    //information, merged in sorted order.

    /**
     *
     * @param text1 a text array to merge
     * @param text2 a second text array to merge
     * @param count1 how much of array 1 you want to use
     * @param count2 how much of array 2 you want to use
     * @return the two arrays merged with the specifications
     */
    public static String [] merge(String [] text1, String [] text2, int count1, int count2) {
        if (count1 > 0 && count2 > 0) {

            String[] Arr1 = new String[count1];
            String[] Arr2 = new String[count2];
            int tracker = 0;

            for (int i = 0; i < count1; i++) {
                Arr1[i] = text1[i];
                tracker++;
            }
            for (int i = 0; i < count2; i++) {
                Arr2[i] = text2[i];
                tracker++;
            }

            int countText1 = 0;
            int countText2 = 0;
            String[] mergedArr = new String[Arr1.length+Arr2.length];

            for (int i = 0; i < mergedArr.length-1; i++) {
                if ((text1[countText1].compareToIgnoreCase(text2[countText2])) >= 0) {
                    mergedArr[i] = text1[countText1];
                    if(text1.length-1 != countText1){
                        countText1++;
                    }

                } else if (text2[countText2].compareToIgnoreCase(text1[countText1]) >= 0) {
                    mergedArr[i] = text2[countText2];
                    if(text2.length-1 != countText2){
                        countText2++;
                    }
                    else{
                        mergedArr[i] = text1[countText1];
                        countText2++;
                        countText1++;
                    }
                }
            }
            return mergedArr;
        }else{return null;}
    }

    //3) Write a static method that takes in a String array of sorted data and removes all duplicates starting at a specified position
    //in the array. Any data prior to this point in the array after this position should not be filtered, i.e. all data from the beginning
    //of the original array up to that position should be copied to the new array without any omissions.
    //a. Your deduplication should be done using the array growth approach and should take advantage of the sorted
    //nature of the data (note: it should not sort the data itself).
    //b. Your method should take in an array of Strings (textArr) and an int (startPos).
    //c. Your method should return a new array containing the filtered data from the original array.

    /**
     * to filter through an array from a startPosition and deduplicate from the given point
     * @param textArr an array to filter
     * @param startPos a position to start from
     * @return
     */
    public static String [] filter(String [] textArr, int startPos){
    if(startPos > 0 || textArr == null){
        return textArr;
    }else{
        String [] filteredArr = new String[0];
        int tracker = 0;
        for(int i = startPos; i < textArr.length; i++){

            if(locate(filteredArr,textArr[i]) == -1){
                filteredArr = grow(filteredArr);

                filteredArr[tracker] = textArr[i];
                tracker++;
            }
        }
        return filteredArr;
    }

    }

//a) Take in information from two hard-coded files (of your own creation). The data should be stored in two separate arrays
//(one for each file of data), then displayed in well-formatted manner. You may use the sample code from your ongoing
//CA projects to read in an array of Strings from a file.
//b) Take in the number of elements to be retained from each array, then merge the two arrays using these counts.
//c) Take in text from the user and search for that value in the merged array.
//d) Filter the merged array to remove duplicates beginning at the first position at which the text (entered by the user in
//step c) appears. If the text does not appear in the array, the entire array should be deduplicated.
//e) Display the filtered information and inform the user how many duplicates were removed
    public static void main(String[] args) {
        String [] textArr1 = readTextFile("File/StringFIle1");
        String [] textArr2 = readTextFile("File/StringFile2");
        String [] mergedTextArr = merge(textArr1,textArr2,textArr1.length,textArr2.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value you want to search for");
        String Value = sc.nextLine();
        int valueLocation = locate(mergedTextArr, Value);
        String [] filteredArr = filter(mergedTextArr,0);

        for(int i = 0; i < filteredArr.length-1; i++){
            System.out.println("position " + i + " in the new array is " + filteredArr[i]);
        }
        System.out.println("the amount of duplicates deleted is " + (mergedTextArr.length - filteredArr.length));
    }


    /**
     * to grow an array of strings
     * @param textArr - an array to grow
     * @return an array with a single extra slot
     */
    public static String [] grow(String [] textArr){
        String [] newArr = new String[textArr.length + 1];
        for(int i = 0; i < textArr.length; i++){
            newArr[i] = textArr[i];
        }
        return newArr;
    }
}