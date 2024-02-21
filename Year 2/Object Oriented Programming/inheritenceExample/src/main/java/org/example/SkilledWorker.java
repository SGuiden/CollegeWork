package org.example;
//Create a class skilledWorker.
//A skilled worker isa  worker who also has an overtime rate.
//A skilled worker gets paid an hourly wage for the number of hours worked,
// up to 40 hours. If the skilled worker works more than 40 hours, the excess is paid at a different rate,
// the overtime rate. Write constructors, getters and setters,  and override the computePay and toString methods.
//

public class SkilledWorker extends Worker{
    private double otRate;
    public SkilledWorker(double otRate, String name, double hours, double hrRate){
        super(name,hours,hrRate);
        this.otRate = otRate;
    }
    public SkilledWorker(){
    }

    public double getOtRate() {
        return otRate;
    }

    public void setOtRate(double otRate) {
        this.otRate = otRate;
    }

    @Override
public String toString() {
    return super.toString()+" SkilledWorker(" + "otRate = " + otRate + ")";
}
    public double computePay(double hr, double hrRate, double otRate) {
    double pay;
        if(this.getHrRate()<=40){
            pay = super.computePay();
    }
    else{
      pay = (40*this.getHrRate())+((getHours()-40*otRate));
    }
    return pay;

    }
}
