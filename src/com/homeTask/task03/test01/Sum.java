package com.homeTask.task03.test01;

import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        System.out.println("ведите натуральное число ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sum(n));
    }


    public static int sum(int x){
        int s = 0;
        while (x != 0) {
            s = s + x%10;
            x = x/10;
        }
        return s;
    }
}
