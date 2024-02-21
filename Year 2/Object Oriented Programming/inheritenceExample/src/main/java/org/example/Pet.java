package org.example;

import java.util.ArrayList;

//Exercise
//A pet kennels currently boards dogs, hamsters, and numerous other types of pets. They require a program to keep account of these pets. You must create an inheritance hierarchy a separate class to store the pet list (an ArrayList), and an application to add pets to the pet list and process the pets in various ways. Costs are calculated as follows:
//days * 2 for pets
//days * 4 for hamsters,
//days * 8 for dogs
//
//Create a class Pet.
public class Pet {
    private String name;
    private int id;
    private String Owner;
    private int noOfDays;

    public Pet(String name, int id, String Owner, int numOfDays) {
        this.name = name;
        this.id = id;
        this.Owner = Owner;
        this.noOfDays = numOfDays;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public String getOwner() {
        return Owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    //Every pet has a name, id, owner and noOfdays. The id is unique and assigned by the system.
    //Write constructors, getters and setters for the Pet class.
    //Override the toString() method.
    @Override
    public String toString() {
        return "Pet(" + "name = " + name + ", id = " + id + ", Owner = " + Owner + ", noOfDays = " + noOfDays + ")";
    }
    public int cal culateCost(){

    }


    //Write calculateCost() that the returns the cost of the pets stay in the kennel.
    //
    //Create another specialised class of your choice that inherits from the Pet class.
    //
    //Create a class workerApp.
    //In main create worker, mgtWorker and skilledWorker objects with references of the same type as the actual type.
    //Test all methods in all classes.
    //Experiment with assigning reference types that are different to the objects actual type, call various methods, can you explain what is happening?
    //Change the access modifier of the Worker name to protected. What is the difference between the 3 access modifiers that you know.
    //
    //Create a class petApp.
    //In main create Pet, Dog, Hamster and YourPet objects with references of the same type as the actual type.
    //Test all methods in all classes.
    //Experiment with assigning reference types that are different to the objects actual type, call various methods, can you explain what is happening?
    //Change the access modifier of the Pet owmer to protected. What is the difference between the 3 access modifiers that you know?
    //
    //
    //Create a Department class.
    //A department has a departmentName and an arrayList of workers.
    //Add appropriate constructors, getters and setters to the class.
    //Add the following methods to the class:
    //a)	public boolean addWorker(Worker w)
    //b)	public boolean removeWorker(Worker w)
    //
    //Create a Kennel class.
    public class Kennel extends Pet{
        class kennel(){
            String kennelName= "";
            ArrayList<pets>Pets = new ArrayList<pets>;
            Kennel kennel = kennelName,Pets;
        }
        class kennel(kennelName, Pets){
            Kennel kennel = kennelName,Pets;
        }
        public String getKennelName(){
            return this.kennelName;
        }
    }
    //A Kennel has a kennelName and an arrayList of Pets.
    //Add appropriate constructors, getters and setters to the class.
    //Add the following methods to the class:
    //c)	public boolean addPet(Pet w)
    //d)	public boolean removePet(Pet w) – two pets are equal if they have the same petName and owner
    //
    //Update the Department class with the following methods:
    //e)	public int getNumberOfWorkers()
    //f)	public double gettotalWageBill()
    //g)	Test the methods in app.
    //
    //Update the Kennel class with the following methods:
    //a)	public int getNumberOfPets()
    //b)	public double gettotalCost()
    //c)	Explain polymorphism
    //
    //Update the Department class with the following methods:
    //d)	public double getAverageOvertimeRate()
    public double getAverageOvertimeRate(){
        double total = 0;
        for(int i = 0; i <staff.size();i++){
            if()
            total = total
        }
    }
    //e)	public int getNumberOfHourlyWorkers()
    //f)	public Worker findWorker(Worker s)
    //g)	public double getavghourlyRate() for all workers that are not management or skilled
    //h)	public int getNumberOfSpecifiedWorkers(Class<?> wType)
    //
    //Update the Kennel class with the following methods:
    //
    //i)	Get the total income due from dogs.
    //j)	Determine whether there is a hamster of a particular colour in the kennels
    //k)	Count all Dogs , Count all hamsters, use a single method that has a pet type parameter
    //l)	Find the number of dogs of a particular breed
    //m)	Find the breed of the heaviest dog.
    //n)	Explain the difference between an objects reference type and actual type.
}
