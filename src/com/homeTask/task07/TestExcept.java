package com.homeTask.task07;

/**
 * Created by Olaf on 16.11.2014.
 */
public class TestExcept {
    public static void main(String[] args) {
        Except ex = new Except();
        try {
            System.out.println(ex.div("24", "0"));
        }catch (ArithmeticException e){
            System.out.println("  " + e);
        }
    }
}
