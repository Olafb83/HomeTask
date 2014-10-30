package com.homeTask.task03.test01.test03;

public class Fib {
    public static void main (String[] args){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < 11; i++){
            System.out.print(c + "  ");
            //System.out.print(b);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
