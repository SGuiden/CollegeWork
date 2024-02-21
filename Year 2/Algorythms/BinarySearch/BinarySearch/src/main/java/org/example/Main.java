package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    String [] array = {"Apple","Banana","Coconut","Cherry","Grape","Kiwi","Orange","Peach","Pear","Strawberry","Watermelon"};

    int wanted = 48;


    }
    public int BinarySearch(int [] array,int wanted){
        int start=0;
        int end = array.length;
        if((array[start] >= wanted) && (wanted <= array[end])){
            if(start!=wanted){
                start= startPointCalc(array,start,end,wanted);
            }

        }
    }
    public int startPointCalc(int[] array, int startPoint, int endPoint, int wanted){
        startPoint = startPoint+(endPoint-startPoint)/2;
        if(array[startPoint] <= wanted) {
            return startPoint;**
        }
    }

}