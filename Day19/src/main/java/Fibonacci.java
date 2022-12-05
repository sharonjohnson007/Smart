package main.java;

/**
 * Print first 20 Fibonacci numbers and their average
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        double nMax = 20;
        double sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print("1" + " " + "1");
        //To find fibonacci series
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            n++;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            System.out.print("\t" + fn);
            sum = sum + fn;
        }
        average = sum / nMax;
        System.out.println("\nThe average is: " + average);
    }
}
