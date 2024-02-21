package org.example;


public class mgtWorker extends Worker{
    //Create a class mgtWorker.
    //A mgtWorker isa  worker.
    public mgtWorker(String name, double hours, double hrRate) {
        super(name, hours, hrRate);
    }
    public mgtWorker(){}
    //A management worker gets paid for 40 hours, regardless of the actual number of hours worked.
    //Write constructors and override the computePay() method.
    @Override
    public double computePay() {
        return 40*this.hrRate;
    }

}
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

