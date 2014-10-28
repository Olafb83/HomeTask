package com.homeTask.task02.test08;

import java.util.Scanner;

public class treug {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение 1-го катета ");
        int a = in.nextInt();
        System.out.println("Введите значение 2-го катета ");
        int b = in.nextInt();
        double hyp = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Гипотенуза = " + hyp);
        double per = a + b + hyp;
        System.out.println("Периметр = " + per);
        double sq = a * b / 2;
        System.out.println("Площадь треугольника = " + sq);
    }
}
