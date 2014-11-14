package com.homeTask.task06;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.Random;

/**
 * Created by Olaf on 14.11.2014.
 */
public class FractionTest {

    public static int ARRAY_SIZE = 10;

    FractionNumber d1 = new FracNumb(8, 5);
    FractionNumber d2 = new FracNumb(9, 8);
    FractionNumber[] a = new FractionNumber[ARRAY_SIZE];

    FracNumbOp op = new FracNumbOp();

    public void run() {
        System.out.println(d1.doubleValue());
        System.out.println(d1.getDividend());
        System.out.println(d1.getDivisor());

        FractionNumber c = op.add(d1, d2);
        System.out.println(c.doubleValue());

        Random m = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            a[i] = new FracNumb(m.nextInt(10), m.nextInt(10) + 1);
        }

        FractionNumber c2 = FracNumbOp.add2(d1, d2);
        System.out.println(c2.doubleValue());
    }

    public static void main(String[] args) {
        FractionTest app = new FractionTest();
        app.run();
    }
}
