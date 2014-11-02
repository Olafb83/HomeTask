package com.homeTask.task04;

import java.util.Random;

public class MassMax {
    public static void main(String[] args) {

        int[][] a = new int [7][4];
        int[] b = new int [7];
        for (int i = 0; i < a.length; i++) {
            b[i] = 1;
            for (int j = 0; j < a[i].length; j++) {
                Random r = new Random();
                a[i][j] = r.nextInt(11) - 5;
                System.out.print(a[i][j] + "  ");
                b[i] = Math.abs(b[i] * a[i][j]);
            }
            System.out.println();
        }
        int max = b[0];
        int ind = 0;
        System.out.println("модуль  произведения элементов строк:");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
            if (max < b[i]){
                max = b[i];
                ind = i;
            }
        }
        System.out.println();
        System.out.println("максимальное произведение " + max + " в строке с индексом " + ind);

    }
}
