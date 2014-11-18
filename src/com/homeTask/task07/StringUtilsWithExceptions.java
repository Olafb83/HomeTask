package com.homeTask.task07;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Olaf on 16.11.2014.
 */
public class StringUtilsWithExceptions implements StringUtils {
    @Override
    public double div(String s, String word) throws NullPointerException, NumberFormatException, ArithmeticException {
        if ((s == null) || (word == null)) {
            throw new NullPointerException("null in s or word ");
        }
        int dividend = Integer.parseInt(s);
        int divisor = Integer.parseInt(word);

        if (divisor == 0) {
            throw new ArithmeticException("/ by zero ");
        }
        return (double) dividend / divisor;
    }

    @Override
    public int[] findWord(String s, String s1) throws NullPointerException {
        /*if ((s == null) || (s1 == null)) {
            throw new NullPointerException("null in s or s1 ");
        }*/
        int ibegin = s.indexOf(s1);
        int c = 0;
        while (ibegin != -1) {
            ibegin = s.indexOf(s1, ibegin + s1.length());
            c++;
        }
        int[] result = new int[c];
        ibegin = s.indexOf(s1);
        c = 0;
        while (ibegin != -1) {
            result[c++] = ibegin;
            ibegin = s.indexOf(s1, ibegin + s1.length());
        }
        return result;
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        return new double[0];
    }
}
