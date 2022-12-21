package main.java;

/**
 * To sum up the individual digits of a positive integer, given in the command line.
 */
public class SumDigits {
    public static void main(String[] args) {
        int n, sum = 0, a;
        if (args.length == 0) {
            System.err.println("There are no arguments.");
        }
        n = Integer.parseInt(args[0]);
        while (n != 0) {
            a = n % 10;
            n = n / 10;
            sum = sum + a;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
