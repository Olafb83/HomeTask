package com.homeTask.task03.test01.test02;

public class Ticket {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {
                            for (int f = 0; f < 10; f++) {
                                j++;
                                if ((a + b + c) == (d + e + f)) {
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Проверено " + j + " комбинаций");
        System.out.println("Счастливых билетов: " + i);
    }
}
