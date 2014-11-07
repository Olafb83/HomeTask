package com.homeTask.task05;

public class CollegeStudent extends Student {
    int year;
    String major;
    CollegeStudent(String n, int a, String g, String id, double gp, int y, String m){
        super (n, a, g, id, gp);
    }
    void setYear(int y){
        year = y;
    }
    void setMajor(String m){
        major = m;
    }
    int getYear(){
        return year;
    }
    String getMajor(){
        return major;
    }
    public String toString() {
        return super.toString() + "year " + year + "major " + major;
    }
}
