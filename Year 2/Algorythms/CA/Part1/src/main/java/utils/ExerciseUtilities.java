package utils;


public class ExerciseUtilities {
    /**
     * @param nums
     * checkes the inputted interger  and outputs a true boolean if the number is odd
     */
    public static boolean isOdd(int nums){
        boolean result = false;
            if (nums % 2 == 1) {
                result = true;
            }

        return result;
    }
    // This class should contain your isOdd method. For utility methods 
    // such as this one, i.e. one where there's no stored data, it's just 
    // calculating a result and returning it without saving anything, or using any
    // saved information, it's better practice to make the method static
    //
    // e.g. public static void sayHello(String name)
    // This would print out "Hello, $name", i.e. the name contained in the name
    // variable. 
    // There's no information saved, there's no information used that isn't
    // supplied as a method parameter, so there's no point in making it an 
    // instance method, i.e. a method tied to a specific instance of a class

    /**
     * @param nums
     *  takes input array in and loops through it to find the odd numbers and uses the evenOut method to take it in and multiply it by two.
     */
    
    public static int evenOut(int nums) {
        int result = nums;

        if (isOdd(result)) {
            result = result * 2;
        }
        return result;
    }

}


