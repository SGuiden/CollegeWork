package org.example;

import java.util.Scanner;
public class Main {
    public static final int modulus = 26;
    public static void main(String[] args) {

        int key = 0;
        String Password = "frgh";
        int choice = -1;
        String Result = "";
        String[] Options = {"0. Encrypt Shift Cypher", "1. Encrypt Caesar Cypher","2. Decrypt Shift Cypher", "3. Decrypt Caesar Cypher", "4. HashPassword"};

        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < Options.length; i++){
            System.out.println(Options[i] + ", ");
        }
        choice = kb.nextInt();
        kb.nextLine();
        //System.out.println("Please enter your Code");
        //Password = kb.nextLine();
        if ((choice >= 0) && (choice <= Options.length)) {
            if(choice == 0){
                System.out.println("enter your key");
                key = kb.nextInt();
                Result = encryptShiftCypher(key, Password);
            }
            if(choice == 1){
                key = 3;
                Result = encryptShiftCypher(key, Password);
            }
            if(choice == 3){
                System.out.println("enter your key");
                key = kb.nextInt();
                Result = decryptShiftCypher(key, Password);
            }
            if(choice == 4){
                key = 3;
                Result = decryptShiftCypher(key, Password);
            }
            System.out.println(Result);
        }

    }
    public static String encryptShiftCypher(int key, String plainText)
    {

        String encryptedText;
//        int base = 'A'; // starts at a.
//        int end = 'Z'; // ends at z because every letter has a value.


        //change case so it matchs the rest
        char[]letter = plainText.toLowerCase().toCharArray();

        //go through each letter
        for(int i = 0; i< letter.length;i++){
            //if the letter is greater than a or less Z do
            if(letter[i]>= 'a' && letter[i] <= 'z'){

                //for sake of arument A = 0, it takes away the base(A), as its our start point and then adds the key, and if it reaches past 26(modulus) the function will handle the rest
                letter[i] = (char)(Math.floorMod(letter[i] - 'a' + key, modulus) +'a');
            }
        }
        encryptedText = new String(letter);
        return encryptedText;
    }
    public static String decryptShiftCypher(int key, String plainText)
    {
        String DecryptedText = encryptShiftCypher(-key,plainText);

        return DecryptedText;
    }
}

