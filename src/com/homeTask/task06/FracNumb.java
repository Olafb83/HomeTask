package com.homeTask.task06;

import com.sourceit.hometask.basic.FractionNumber;

public class FracNumb implements FractionNumber {
    int dividend;
    int divisor;

    public FracNumb() {}

    public FracNumb(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return (double) dividend / divisor;
    }

    @Override
    public int compareTo(FractionNumber o) {
        return Double.valueOf(this.doubleValue()).compareTo(Double.valueOf(o.doubleValue()));
    }

    @Override
    public String toString() {
        return getDividend() + "/" + getDivisor();
    }
}
