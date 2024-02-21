package week3_exercises;

import java.util.Scanner;
import utils.ExerciseUtilities;
import utils.FileHandlingUtilities;

/**
 *
 * @author michelle
 */
public class Week3 {
    public static void main(String[] args){
        
        // This is ONLY present as  a sample for how to use the readNumericFile method. It is not necessary for your exercise!
        int [] fileBased = FileHandlingUtilities.readNumericFile("SampleInput/Part2SampleInput1.txt");
        
        for (int i : fileBased){
            System.out.println(i);
        }
    }
}
