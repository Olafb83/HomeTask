package com.homeTask.task05;

public class Teacher extends Person {
    double salary;
    String subject;
    Teacher (String n, int a, String g, double s, String sub){
        super (n, a, g);
    }
    void setSalary(double s){
        salary = s;
    }
    void setSubject(String sub){
        subject = sub;
    }
    double getSalary(){
        return salary;
    }
    String getSubject(){
        return subject;


    }
}