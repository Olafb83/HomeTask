package com.homeTask.task02.test06;


import java.util.Scanner;

public class blig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        double n = in.nextDouble();
        System.out.println("Введите число ");
        double m = in.nextDouble();
        double a = Math.abs(n - 10);
        double b = Math.abs(m - 10);
        if (a<b) {
            System.out.println("Ближайшее к 10 число " + n);
        }
        else{
            System.out.println("Ближайшее к 10 число " + m);
        }

    }
}
