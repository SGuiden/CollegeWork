package part1_exercises;

import utils.FileHandlingUtilities;

import static utils.ExerciseUtilities.isOdd;
import static utils.ExerciseUtilities.evenOut;
/**
 *
 * @author michelle
 */
public class Part1_1 {

    public static void main(String[] args) {

        // Reading in a file of numbers
        // This will read in the file specified and return an array containing all the numbers from that file
        int[] fileNumbers = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2.txt");
        for (int i : fileNumbers) {
            System.out.println(i);


        //1.2. The program should:
        // (a) Take in 50 ints from a file
        int [] nums = fileNumbers;
        int[] updatedNums = new int[nums.length];
        int even = 0;
        int odd = 0;

        for(int o =0; o < fileNumbers.length-1; o++){
            nums[o] = fileNumbers[o];
            if(isOdd(fileNumbers[o]))
            {
                odd++;
            }
            else {
                even++;
            }
        }

        //(b) Print out the breakdown of odd and even numbers. (Output should read “You entered x even
        //and y odd numbers”)
            System.out.println("you have "+ even+ " amount of numbers and " + odd + "amount od odd numbers");
        //(c) Print out the array in its original state
            for(int a = 0; a <= 49; a++)
            {
                System.out.print(nums[a]);
            }


        //(d) Multiply all odd numbers in the array by 2
            for(int b = 0; b <= 49; b++)
            {
                updatedNums[b] = evenOut(nums[b]);
            }
        //(e) Print out the array in its updated state
            for (int t = 0; t <nums.length-1; t++)
            {
                System.out.print(updatedNums[t]);
            }
        }
    }

}
