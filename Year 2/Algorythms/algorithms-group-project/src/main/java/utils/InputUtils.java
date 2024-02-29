package utils;

import java.util.Scanner;

public class InputUtils {
    static Scanner sc = new Scanner(System.in);

    /**
     * Get basic input from the user.
     * @param prompt Prompt to display to the user.
     * @return The input from the user.
     */
    public static String getInput(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }
}
