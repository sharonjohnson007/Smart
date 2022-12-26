package main.java;

import java.util.Scanner;

/**
 * To list all the Tribonacci numbers that can be expressed as an int.
 * (i.e., 32-bit signed integer in the range of [-2147483648, 2147483647])
 */

public class TribonacciInt {
    public static void main(String[] args) {
        int n, f = 1, s = 1, s1 = 2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println("f(0) = 1");
        for (int i = 1; i <= n; i++) {
            if (i > 36) {
                System.out.println("F(37) is out of the range of int");
                break;
            }
            temp = f + s + s1;
            f = s;
            s = s1;
            s1 = temp;
            System.out.println("f" + "(" + i + ") = " + f);
        }
    }
}
