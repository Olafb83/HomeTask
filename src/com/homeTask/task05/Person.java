package com.homeTask.task05;

public class Person {
    String name;
    int age;
    String gender;

    Person (String n, int a, String g){
       // name = n;
       // age = a;
       // gender = g;
    }
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getGender() {
        return gender;
    }

    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    void setGender(String g) {
        gender = g;
    }
}
