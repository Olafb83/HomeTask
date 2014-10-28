package com.homeTask.task02.test07;

import java.util.Random;

public class popal {
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(150) + 5;
        System.out.println("Случайное число = " + a);
        if ((a>=25) && (a<=100)) {
            System.out.println("Число вошло в диапазон 25 - 100 ");
        }
        else {
            System.out.println("Число не вошло в диапазон 25 - 100 ");
        }
    }
}
