package com.homeTask.task02.test05;

import java.util.Random;
import java.util.Scanner;

public class rand {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = in.nextInt();
        Random r = new Random();
        int m = r.nextInt(2*n) - n;
        System.out.println(m);
    }

}
