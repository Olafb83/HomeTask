package com.homeTask.task04;
import java.util.Random;

public class Mass {

    public static void main(String[] args) {
        int[][] a = new int[8][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Random r = new Random();
                a[i][j] = r.nextInt(90) + 10;
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

