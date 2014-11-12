package com.homeTask.task06;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

public class FracNumbOp implements FractionNumberOperation {


    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return fractionNumber + fractionNumber1;
    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        return null;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        return null;
    }
}
