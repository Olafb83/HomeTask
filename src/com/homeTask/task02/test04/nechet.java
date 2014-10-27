package com.homeTask.task02.test04;


import java.util.Scanner;

public class nechet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        if (a%2 == 0) {
            System.out.println("вы ввели четное число");
        }
        else{
            System.out.println("вы ввели нечетное число");
        }
        }
}
