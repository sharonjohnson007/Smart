package main.java;

import java.util.Scanner;

/**
 * To compute the exponential value of given number.
 */
public class Exponent {
    public static void main(String[] args) {
        Exponent test = new Exponent();
        System.out.println("Using method: " + exponent(3, 4));
        int exp;
        int base;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
