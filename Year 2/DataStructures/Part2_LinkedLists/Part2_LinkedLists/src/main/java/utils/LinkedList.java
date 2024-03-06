package utils;

public class LinkedList {
    private Song [] LinkedList = new Song[0];
    private Node tail;
    private Node head;
    private int numElements;
    public LinkedList{
        head = null;
        numElements = 0;
    }
    //Implement a list to store Songs. This list should be implemented as a link-based list class named LinkedList. This list
    //should maintain a tail reference, as well as a reference to the first element. The following functionality should be
    //provided:

    /**
     * returns the size of the LinkedList
     * @return numElements, a varaible counting how many elements are in the list
     */
    public int size(){
        return numElements;
    }
    //1. A method called size() that takes no parameters & returns the number of Songs currently stored in your list.
    public String get(int pos){
        if(pos >=0 && pos <= tail) {
            return LinkedList[pos].toString();
        }
        else return "invalid Position";
    }
    //2. A method called get() that takes one parameter, an int representing the position from which data should be
    //retrieved. The position should be validated and invalid positions handled accordingly.
    //If the position is valid, the method should return the data (a Song) in the position specified.
    public static int indexOf(Song song){
        for(int i = 0; i <= tail; i++){
            if(song == LinkedList[i]){
                return i;
            }
        }
        return -1;
    }
    //3. A method called indexOf() that takes one parameter, a Song to be found in the list. The method should
    //return an int indicating the position at which the Song could be found. If the Song could not be found, an
    //appropriate value should be returned to indicate this.
    public static void add(Song song){
        if(indexOf(song) == -1){
            grow();
            LinkedList[numElements];
            tail= tail + 1;
        }
        else{
            System.out.println("Song Already Esists");
        }
    }
    //4. A method called add() that takes a single parameter, a Song to be added to the end of the list.
    public static void add(Song song){
        if(indexOf(song) == -1){
            grow();
            LinkedList[numElements];
        }
    }

    //5. A method called isEmpty() that takes no parameters. This should return a boolean indicating if there is data
    //currently stored in the list.

    public static boolean isEmpty(){
        if(numElements == 0 || utils.LinkedList == null){
            return true;
        }
        else
        {
            return false;
        }
    }
    //6. A method called tail() that takes no parameters. This should return the last element in the list
    public static Song Tail(){
        return LinkedList[tail];
}

    //All Songs in your LinkedList must be by the same artist (case-insensitive). The artist to be accepted by the list is the artist of whatever is the first Song added to the list. You should include any appropriate method or methods to facilitate this, and the logic of your class should uphold this requirement throughout.


    //Your list should contain a method called removeAll() that takes one parameter:
    //The Song to be removed (this should not be null).
    //All instances of this Song should be removed from the list. The method should return a boolean indicating if the Song was removed (if at least one instance is removed, the method should return true, otherwise it should return false).

public static void grow(){
        Song [] grownList = new Song[numElements+1];
        this.numElements++;
        LinkedList = grownList;
}

}
