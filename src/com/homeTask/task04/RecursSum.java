package com.homeTask.task04;

import java.util.Scanner;

public class RecursSum {
    static int sum (int s){
        int res;
        if (s == 1) return 1;
        res = sum (s - 1) + s;
        return res;
    }
    public static void main (String[] args){
        System.out.println("ведите число ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Сумма чисел от 1 до " + n);
        System.out.println(sum(n) + " ");
    }
}
