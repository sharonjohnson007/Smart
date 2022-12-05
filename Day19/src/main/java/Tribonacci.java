package main.java;

/**
 * Print first 20 Tribonacci numbers and their average
 */
public class Tribonacci {
    public static void main(String[] args) {
        int n = 3;
        int tn;
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        double nMax = 20;
        double sum = 0;
        double average;
        System.out.println("The first " + nMax + " Tribonacci numbers are:");
        System.out.print("1" + " " + "1" + " " + "2");
        //To find tribonacci series
        while (n <= nMax) {
            tn = fnMinus1 + fnMinus2 + fnMinus3;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = tn;
            ++n; //5
            System.out.print("\t" + tn);
            sum = sum + tn;
        }
        average = (sum / nMax);
        System.out.println("\nThe Average is: " + average);
    }
}
