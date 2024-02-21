package org.example;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

public class Group {
    private ArrayList <student> sClass;

    public Group(){
        sClass = new ArrayList(3);
    }
    public void addStudent(student s){
        sClass.add(s);
    }

    public PrintStream createOver40GPA(){
        PrintStream out = new PrintStream(new File("data.txt"))
        for(int i = 0; i < sClass.size(); i++){
                if(sClass.get(i).getGpa() >= 40){
                    out = addStudent(sClass.get(i));
                }
        }
    }
}
