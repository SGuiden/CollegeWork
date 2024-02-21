package heaterExercise;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public class Heater() {
    //Create a class, Heater, with instance variables temp, of type int and change of type int and 2
    // static constants MAX and MIN with values 40 and 5, respectively.
    private int max = 40;
    private int min = 5;
    int temp;
    int change;


    //Q1. Define a no argument constructor, the temperature field should be set to 15 in the constructor and change to 5
    class heater(int t, int c) {
         t = 15;
         c = 5;


        //Q2. Add accessors to return the values of the fields.
        public int getMin() {
            return min;
        }

        public int getChange() {
            return change;
        }
        public static int getIdCount() {
            return IdCount;
        }
        //Q3. Add a method, setChange(), that takes a single integer parameter and uses it to set the value of change.
        //Add a check to this method to prevent a negative value being assigned to change
        public boolean setChange(int c) {
            boolean done = false;
            if (c > 0) {
                this.change;
            }
        }

        //Q4. Create mutators warmer() and cooler() to increase and decrease the temperature of the heater by the value
        //in the change field. Warmer() should not allow the temperature to be set to a value greater than MAX.
        //Cooler() should not allow the temperature to be set to a value less than MIN.

        //Q5. Modify the class as appropriate to include a new field heaterId which should be unique for each heater and set by the system.
        //Heater ids should start at 1.


    }
}