package carsclass;
import java.util.ArrayList;

public class Car
    {
        //instance variables
        //access modifiers - private, public
        private String model;
        private double kmDriven;
        private double litresUsed;

        //Constructors
        //Assign values to the instance vars
        //new Car("Toyota",45,2));
        public addCar(String m,double kmDriven,double litres){
            model = m;
            this.kmDriven = kmDriven;//have to use "this"
                                        //keyword this, refers to the current object
            this.litresUsed = litres;
        }
        public Car(String m){
            model = m;

        }
        public Car(){
            //if values are not assigned then the instance variables will be given default values
        }
        //Accessors
        public String getModel(){
            return this.model;
        }
        public double getKM(){
            return this.kmDriven;
        }
        public double getLitres(){
            return this.litresUsed;
        }
        //mutators
        public void setModel(String m){
            this.model = m;
        }
        public boolean setKM(double k){
            boolean done = false;
            if(k>=0){
             this.kmDriven = k;
             done = true;
            }
            return done;`
        }
        public void setLitres(double l){
            this.litresUsed = l;
        }
        //c. Write a method to calculate and return 
        //the number of kilometers driven per litre.
        public double getKmPerLit(){
            return this.kmDriven/litresUsed;
        }
        //d. Write a method to calculate the amount spent on petrol.
        //This method should accept the cost of a litre of petrol 
        //as a parameter. 
        public double calcAmtSpent(double cost){
            return this.litresUsed * cost;
        }
        //e.Write a method to increase the litres used by a 
        //value passed to the method.
        
        public void incLitres(double l){
            //could use setter
            this.litresUsed  = litresUsed + l;
        }
        public void incLitresV2(double l){
            //could use setter
            this.setLitres(litresUsed + l);
        }
        
        //f.Write a method to increase the km 
        //driven by a value passed to the method.
    public void inckm(double l)
        {
            //could use setter
            this.kmDriven  = this.kmDriven + l;
        }
        @Override
        public String toString()
        {
           return "Model: "+this.model+" km:"+this.kmDriven + " litres used "+this.litresUsed;
        }

public class Garage {
    //    (a)	Create a new class called Garage that uses
    //the Car class created earlier.
//
//In this class declare a private field, fleet,
    //of type ArrayList, to hold a collection of Car objects
    private ArrayList<Car> fleet;
    //private List<Car> fleet;
    //and a private field name to hold the name of the garage created.
    private String name;
//

    //The constructor should make this arrayList
    //and initialise name to the value passed to it.
    public Garage(String name){
        fleet = new ArrayList();
        this.name = name;
    }
    public Garage(){

    }
    //addCar() – adds the car that is passed as a parameter to the fleet
    public boolean addCar(Car c){
        return fleet.add(c);

    }
    //showNumberOfCars() – returns the number of cars in the garage
    public int showNumberOfCars(){
        return fleet.size();
    }
    //getAverageKmDriven() – returns the average number of KM driven by
//cars in the garage.
    public double getAverageKmDriven(){
        double totKm = 0;

        for(int i = 0;i<fleet.size();i++){
            totKm = totKm + fleet.get(i).getkmDriven();
        }
        return totKm/fleet.size();
    }
    //getMostKmDriven() – returns the highest number of KM driven by
//any car in the garage.
//getHighMilage() – returns all cars that have driven more than a
//certain amount, the amount is passed as a parameter.
    public ArrayList<Car> getHighMilage(double t){
        ArrayList<Car> chosen = new ArrayList();
        for(int i = 0;i<fleet.size();i++){
            if(fleet.get(i).getkmDriven()>t){
                chosen.add(fleet.get(i));
            }
        }
        return chosen;
    }
//getNumberofModel() – returns the number of
//cars of a particular model in the garage,
//the model is passed as a parameter.


//findallModelCars() – returns all cars of a
//particular model, the model is passed as a parameter.
        
        
    public class module
    {
        private String CourseName;
        private int totalStudent;
        private boolean tenCredit;
        
        
        public module(String cn,int tStudent,boolean tenCred)
        {
            this.CourseName = cn;
            this.totalStudent = tStudent;
            this.tenCredit = tenCred;
        }
        public module(String cn)
        {
            CourseName = cn;
        }
        public module()
        {
            //if values are not assigned then the instance variables will be given default values
        }
        public String getCourseName()
        {
            return this.CourseName;
        }
        public int getTotalStudent()
        {
            return this.totalStudent;
        }
        public boolean getTenCredit()
        {
            return this.tenCredit;
        }
         public void setCourseName(String cn)
        {
            this.CourseName = cn;
        }
         public void setTotalStudent(int tStudent)
        {
            this.totalStudent = tStudent;
        }
    
    
    }
}


