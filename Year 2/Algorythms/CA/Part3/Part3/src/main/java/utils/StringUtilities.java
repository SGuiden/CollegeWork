package utils;


/**
 *
 * @author michelle
 */
public class StringUtilities {
    //Create a method (in StringUtilities.java, within the utils package) that merges two arrays of Strings in
    //an unordered fashion. Unlike the version in class, this method should only take a specified number
    //of elements from each array, i.e. it should not merge the entire contents of each array. Your method
    //should:
    //(a) Be called merge
    //(b) Take in two arrays of Strings and two ints;

    /**
     *
     * @param text1 1st array of text
     * @param text2 2nd array of text
     * @param num1 number of words in the first array for use in merge
     * @param num2 number of words in the second array for use in merge
     * @return the merged result of the array 1 (slot 0 to slot num1) and array 2 (slot 0 to slot num2)
     */
    public static String [] merge (String [] text1, String [] text2, int num1, int num2) {
        int counter = 0;
        int size;
        int count1;
        int count2;
        //getting array length
        if (num1 >= text1.length) {
            count1 = text1.length;
        } else {
            count1 = num1;
        }
        if (num2 >= text2.length) {
            count2 = text2.length;
        } else {
            count2 = num2;
        }
        String[] Result = new String[count1 + count2];


        //if the length is smaller than the number it will use the length as an argument in the for statement
        for (int i = 0; i < count1; i++) {
            //i. int 1: the number of elements to merge from the first array
            Result[i] = text1[i];
            counter++;

            for (int o = 0; o < count2; o++) {
                //ii. int 2: the number of elements to merge from the second array
                Result[o + count1] = text2[o];
            }
        }
            //(c) Return a new String array containing the merged data
            return Result;
    }

    //Create a method (in StringUtilities.java, within the utils package) that partitions the contents of an
    //array in DESCENDING order, based on a supplied single String. Your method should:
    //  (a) Be called partition
    //  (b) Take in an array of Strings & a single String; the VALUE to use as the pivot in partitioning
    /**
     *
     * @param text an string array to
     * @param pivot
     * @return
     */
        public static String[] partition (String[]text, String pivot){
            if (text.length <= 1)
            {
                return text;
            }
            else {
                String[] Result = new String[text.length];
                String[] GreaterthanAR = new String[text.length];
                int greatCount = 0;
                String[] LessthanAR = new String[text.length];
                int lessCount = 0;
                //      i. When carrying out your partition step, you should employ the merge method you
                //         wrote in part 1.1 to recombine the partitioned information.
                for (int i = 0; i < text.length; i++) {
                    if ((text[i].compareToIgnoreCase(pivot)) >= 0) {
                        GreaterthanAR[greatCount] = text[i];
                        greatCount++;
                    } else {
                        LessthanAR[lessCount] = text[i];
                        lessCount++;
                    }
                }
                Result = merge(GreaterthanAR, LessthanAR, greatCount, lessCount);

                //  (c) Return a new array containing the original array’s information in partitioned order
                return Result;
            }
        }








    //1.4 Create a method (in StringUtilities.java, within the utils package) that counts how many instances of
    //a specified String appear within an array (this should only count EXACT matches (ignoring case), not
    //fuzzy matches). Your method should:
        //(a) Be called count
        //(b) Take in an array of Strings & a single String; the VALUE to count the appearances of

    /**
     * @param text a text array to be searched
     * @param word a word to search for in array
     * @return how many times the word appeared in array
     */
    public static int count (String[]text, String word){
        int count=0;
        for (int i = 0; i < text.length;i++) {
            if (text[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        //(c) Return the number of times the specified String appears within the array.
        return count;
        }
    }



