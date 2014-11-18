package com.homeTask.task07;

/**
 * Created by Olaf on 16.11.2014.
 */
public class TestExcept {
    public static void main(String[] args) {
        StringUtilsWithExceptions ex = new StringUtilsWithExceptions();

        try {
            System.out.println(ex.div("1", "1"));
        } catch (ArithmeticException e){
            System.out.println(" *** ArithmeticException " + e);
        } catch (NullPointerException e){
            System.out.println(" *** NullPointerException " + e);
        } catch (NumberFormatException e) {
            System.out.println(" *** NumberFormatException " + e);
        }
        int[] w = new int[0];
        try {
            w = ex.findWord("im a beautiful man beautiful", "beautiful");
            //w = ex.findWord(null, "beautiful");
        } catch (NullPointerException e) {
            System.out.println(" *** NullPointerException " + e);
            //e.printStackTrace();
        }
        for (int i : w) {
            System.out.println(i);
        }
    }
}
