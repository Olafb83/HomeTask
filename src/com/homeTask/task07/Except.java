package com.homeTask.task07;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Olaf on 16.11.2014.
 */
public class Except implements StringUtils {
    @Override
    public double div(String s, String s1) throws NullPointerException, NumberFormatException, ArithmeticException {
        int dividend = Integer.parseInt(s);
        int divisor = Integer.parseInt(s1);
        if ((s == null) && (s1 == null)) {
            throw new NullPointerException();
        }else if ((dividend == 0) || (divisor == 0)) {
            throw new ArithmeticException("/ by zero ");
        } else // осталась проверка ввода

        return (double) dividend / divisor;

    }

    @Override
    public int[] findWord(String s, String s1) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        return new double[0];
    }
}
