package org.example;

public class Worker {
    //Create a class Worker.
    private String name;
    private int id;
    private double hours;
    protected double hrRate;

    private static int idCount = 1;

    public Worker(String wname, double hours, double hrRate) {
        this.name = wname;
        this.hours = hours;
        this.hrRate = hrRate;
        this.id = idCount;
        idCount++;
    }

    public Worker() {
        id = idCount;
        idCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHrRate() {
        return hrRate;
    }

    public void sethRate(double hrRate) {
        this.hrRate = hrRate;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Worker.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Every worker has a name, id, weekly hours and rate per hour. The id is unique and assigned by the system.
    //Write constructors, getters and setters for the worker class.
    //Override the toString method.
    @Override
    public String toString() {
        return "Worker(" + "name = " + name + ", id = " + id + ", hours = " + hours + ",hrRate = " + hrRate + ")";
    }

    //Write computePay() that the returns the worker’s pay which is calculated by multiplying the hours worked by the hourly rate.
    public double computePay() {
        return this.hours * this.hrRate;
    }
}
