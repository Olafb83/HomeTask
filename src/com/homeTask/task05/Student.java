package com.homeTask.task05;

public class Student extends Person {
    double gpa;
    String idNumber;
    Student(){}
    Student (String n, int a, String g, String id, double gp){
        super (n, a, g);
    }
    void setIdNumber(String id){
        idNumber = id;
    }
    void setGpa(double gp){
        gpa = gp;
    }
    String getIdNumber(){
        return idNumber;
    }
    double getGpa(){
        return gpa;
    }
    public String toString() {
        return super.toString() + " idNumber: " + idNumber + " gpa: " + gpa;

    }
}