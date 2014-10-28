package com.homeTask.task02.test09;


import java.util.Random;

public class maxzn {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(900) + 100;
        System.out.println(a);
        int x = a%10;
        int y = (a/10)%10;
        int z = a/100;
        if (x>y && x>z) {
            System.out.println("Максимальная цифра " + x);
        }
        else if (y>x && y>z){
            System.out.println("Максимальная цифра " + y);
        }
        else {
            System.out.println("Максимальная цифра " + z);
        }
    }
}
