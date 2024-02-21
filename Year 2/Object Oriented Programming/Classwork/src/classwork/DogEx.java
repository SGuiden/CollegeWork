package classwork;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shaun
 */

public class DogEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Fido",3,"Terrier");
        Dog d3 = new Dog(4);
        
        System.out.println("dog1 " + d1.getName());
        System.out.println("dog2" +d2.getName());
        System.out.println("dog3 "+ d3.getName());
        
        d1.setName("jake");
        d3.setName("tino");
        
        System.out.println("dog1 " + d1.getName());
        System.out.println("dog2" +d2.getName());
        System.out.println("dog3 "+ d3.getName());
        
        System.out.println("dog 3 age " + d3.getAge());
        d3.incAge(2);
         System.out.println("dog 3 age " + d3.getAge());
         
        boolean done =  d3.incAge(-10);
        if(done == true){
          System.out.println("dog 3 age " + d3.getAge());
        }
        else{
            System.out.println("age was not changed - invalid value");
        }
        ArrayList k1 = new ArrayList();
        ArrayList<Dog> k2 = new ArrayList();
        k2.add(d3);
        k2.add(d1);
        k2.add(d2);
        
        k2.add(new Dog("Spot",3,"Spaniel"));
        System.out.println(k2);
        System.out.println(getTerriers(k2));
        System.out.println(getSelectedBreed(k2,"rtgsodrjgsdioj"));
        System.out.println("Number of dogs created " + Dog.getDogCount());
        
    }
    public static ArrayList<Dog> getTerriers(ArrayList<Dog> k){
       ArrayList<Dog> terriers = new ArrayList<>();
        for(int i = 0;i<k.size();i++){
            if(k.get(i).getBreed().equalsIgnoreCase("Terrier")){
                terriers.add(k.get(i));
            }
        }
        return terriers;
            }
           public static ArrayList<Dog> getSelectedBreed(ArrayList<Dog> k, String b){
       ArrayList<Dog> terriers = new ArrayList<>();
        for(int i = 0;i<k.size();i++){
            if(k.get(i).getBreed().equalsIgnoreCase(b)){
                terriers.add(k.get(i));
            }
        }
        return terriers;
            }
              
        }