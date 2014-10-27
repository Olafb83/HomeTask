package com.homeTask.task02.test03;
import java.util.*;

public class chet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите двухзначное число ");
        int a = in.nextInt();
        int b = a % 10;
        int c = a / 10;
        System.out.println("сумма цифр равна "+ (b + c));
        }
}
