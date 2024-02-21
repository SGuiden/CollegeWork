package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void Reader(String[] args) throws FileNotFoundException {
    String num, fName, sName;
    double n1, n2, n3;
    double avg;
    Group g = new Group();

    File f = new File("student.txt");
    Scanner sc = new Scanner(f);
while(sc.next()) {
    num = sc.next();
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    fName = sc.next();
    sName = sc.next();
}
    avg = (n1+n2+n3)/3;
        System.out.println("Student " + fName + " " + sName + " GPA: " + avg);
    }
}

