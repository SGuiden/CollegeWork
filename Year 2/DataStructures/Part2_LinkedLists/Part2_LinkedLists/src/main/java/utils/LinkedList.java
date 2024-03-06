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

    //1. A method called size() that takes no parameters & returns the number of Songs currently stored in your list.
    /**
     * returns the size of the LinkedList
     * @return numElements, a varaible counting how many elements are in the list
     */
    public int size(){
        return numElements;
    }

    //2. A method called get() that takes one parameter, an int representing the position from which data should be
    //retrieved. The position should be validated and invalid positions handled accordingly.
    //If the position is valid, the method should return the data (a Song) in the position specified.

    /**
     * returns the Song in the given position
     * @param pos the position of the object you want
     * @return the object in that position
     */
    public String get(int pos){
        if(pos >=0 && pos <= tail) {
            return LinkedList[pos].toString();
        }
        else {return "invalid Position";}
    }

    /**
     * retuns the index of the song
     * @param song the song you want to search for
     * @return either the postition of the song or a -1 for indexout of bounds
     */
    public static int indexOf(Song song){
        for(int i = 0; i <= tail; i++){
            if(song == LinkedList[i]){
                return i;
            }
        }
        return -1;
    }


    //4. A method called add() that takes a single parameter, a Song to be added to the end of the list.

    /**
     * adding the song to the array
     * @param song - the song you want to add
     */

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
    //All instances of this Song should be removed from the list.
    //The method should return a boolean indicating if the Song was removed
    //(if at least one instance is removed, the method should return true, otherwise it should return false).
    public static boolean removeAll(Song song){
        //if the song is null return false
        if(song == null){return false}
        //count to the tail, if the song is found
        for(int i = 0; i<tail; i++){
            if((LinkedList[i].equals(song)){
               counter++;
            }
        }

        //if counter is greater than 0 it will create a new list, add every instanstance that doesnt match and will return true, if it is 0 or less it will return false
        if(counter > 0){
        LinkedList newList = new LinkedList(numElements - counter);
        this.numElements = 0;
        for(int i = 0; i<tail; i++){
            if(!(LinkedList[i].equals(song)){
                newList[numElements] = LinkedList[i];
                this.numElements++;
            }
        }
        return true;
        }
        else{return false;}
    }

    /**
     * growing an array by 1
     */
    public static void grow(){
        Song [] grownList = new Song[numElements+1];
        this.numElements++;
        LinkedList = grownList;
}

}
