/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork;

/**
 *
 * @author shaun
 */
  public class Dog {
    private static int dogCount = 0;
    private String name;
    private int age ;
    private String breed;
    
    public Dog(){
        name = "unknown";
        this.breed = "Mongrel";
        dogCount++;
    }
    
    public Dog(String n, int age,String breed){
        name = n;
        this.age = age;
        this.breed = breed;
         dogCount++;
    }
    public Dog(int age){
        this.age = age;
        this.breed = "XXX";
         dogCount++;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getAge(){
        return age;
    }
    public static int getDogCount(){
        return dogCount;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public boolean setAge(int age){
        boolean done = false;
        if(age>0){
            this.age = age;
            done = true;
        }
        return done;
    }
    public void setBreed(String b){
        breed = b;
    }
    
    public void incAge1(int a){
        this.age = this.age + a;
    }
    public boolean incAge(int a){
       return setAge(this.age + a);
    }
  
    @Override
//    public String toString(){
//        return "3";
//    }
    public String toString(){
        return "Name:" +this.name + " Breed: "+this.breed + "Age: "+this.age;
    }
  }