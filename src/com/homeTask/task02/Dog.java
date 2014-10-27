package com.homeTask.task02;

public class Dog{
    String name;
    String says;
    public Dog(String n, String s){
        name = n;
        says = s;
    }

    public static void main(String[] args){
        Dog a = new Dog("spot", "Ruff!");
        Dog b = new Dog("scruffy", "Wurf!");
        System.out.println(a.name +" says "+ a.says);
        System.out.println(b.name +" says "+ b.says);
    }
}
