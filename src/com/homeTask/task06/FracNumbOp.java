package com.homeTask.task06;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

public class FracNumbOp implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) {
        //FractionNumber res = new FracNumb((a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend()), (a.getDivisor() * b.getDivisor()));
        FractionNumber res = new FracNumb();
        if ((a.getDivisor() == 0) || (b.getDivisor() == 0)){
            return null;
        }else {
            res.setDividend(a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend());
            res.setDivisor(a.getDivisor() * b.getDivisor());
            return res;
        }
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) {
        FractionNumber res = new FracNumb();
        if ((a.getDivisor() == 0) || (b.getDivisor() == 0)){
            return null;
        }else {
            res.setDividend(a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend());
            res.setDivisor(a.getDivisor() * b.getDivisor());
            return res;
        }
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) {
        FractionNumber res = new FracNumb();
        if ((a.getDivisor() == 0) || (b.getDivisor() == 0)){
            return null;
        }else {
            res.setDividend(a.getDividend() * b.getDividend());
            res.setDivisor(a.getDivisor() * b.getDivisor());
            return res;
        }
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) {
        FractionNumber res = new FracNumb();
        if ((a.getDivisor() == 0) || (b.getDivisor() == 0)){
            return null;
        }else {
            res.setDividend(a.getDividend() * b.getDivisor());
            res.setDivisor(a.getDivisor() * b.getDividend());
            return res;
        }
    }

    @Override

    public FractionNumber parseFractionNumber(String s) {
        String[] a = s.split("//");
        return new FracNumb(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
    }


   // public static FractionNumber add2(FractionNumber a, FractionNumber b) {
   //     return new FracNumb((a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend()), (a.getDivisor() * b.getDivisor()));
}


