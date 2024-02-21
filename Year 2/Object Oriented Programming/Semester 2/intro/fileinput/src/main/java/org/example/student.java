package org.example;

public class student {
    private String sNum, sName;
    private double gpa;

    public student(String sNum, String sName, double gpa){
        this.sName = sName;
        this.gpa = gpa;
        this.sNum = sNum;
    }
    public double getGpa() {
        return gpa;
    }

    public String getsName() {
        return sName;
    }

    public String getsNum() {
        return sNum;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }


}
