package word;

public class bWords {
    private static String beeWords [] = new String[1];
    private String message = "illegal word";
    private static int counter = 0;
    public bWords(String word) throws IllegalWordException{
        if(word.endsWith("b")){
            add(word);
        }else if (word.startsWith("B")){
            add(word);
        }
        else{
            throw new IllegalWordException(message);
        }
    }

    public static void add(String word){
        boolean valid = false;
        beeWords[counter] = word;
        valid = true;
    }

}
