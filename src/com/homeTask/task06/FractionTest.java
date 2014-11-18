package com.homeTask.task06;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Olaf on 14.11.2014.
 */
public class FractionTest {

    public static int ARRAY_SIZE = 10;

    FractionNumber d1 = new FracNumb(1, 2);
    FractionNumber d2 = new FracNumb(1, 2);
    FractionNumber[] a = new FractionNumber[ARRAY_SIZE];

    FracNumbOp op = new FracNumbOp();

    public void run() {
        System.out.println(d1.doubleValue());
        System.out.println(d1.getDividend());
        System.out.println(d1.getDivisor());

        FractionNumber add = op.add(d1, d2);
        System.out.println("add " + add.doubleValue());
        FractionNumber div = op.div(d1, d2);
        System.out.println("div " + div.doubleValue());
        FractionNumber sub = op.sub(d1, d2);
        System.out.println("sub " + sub.doubleValue());
        FractionNumber mul = op.mul(d1, d2);
        System.out.println("mul " + mul.doubleValue());

        Random m = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            a[i] = new FracNumb(m.nextInt(10), m.nextInt(10) + 1);
        }
        Arrays.sort(a);
        for (FractionNumber i : a) {
            System.out.println(i);
        }
        //FractionNumber c2 = FracNumbOp.add2(d1, d2);
        //System.out.println(c2.doubleValue());
    }

    public static void main(String[] args) {
        FractionTest app = new FractionTest();
        app.run();
    }
}
