public class Lab3 {
    

    public static void main(String[] args) {
        int key = 3;
        String plainText = "How Are You";
    }
    public static String EncryptShiftCypher(int key, String plainText)
    {

        String encryptedText;
        int base = 'A'; // starts at a.
        int end = 'Z'; // ends at z because every letter has a value.


        //change case so it matchs the rest
        char[]letter = plainText.toLowerCase().toCharArray();

        //go through each letter
        for(int i = 0; i< letter.length;i++){
            //if the letter is greater than a or less Z do
            if(letter[i]>= base && letter[i] <= end){

                //for sake of arument A = 0, it takes away the base(A), as its our start point and then adds the key, and if it reaches past 26(modulus) the function will handle the rest
                letter[i] = (char)(Math.floorMod(letter[i] - base + key, modulus) +base);
            }
        }
        encryptedText = new String(letter);
        return encryptedText;
    }
    public static String decypher(int key, String plainText)
    {
        return EncryptShiftCypher(-key, plainText);
    }
}

