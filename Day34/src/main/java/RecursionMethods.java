package main.java;

/**
 * To get the desired output using recursive function.
 */

public class RecursionMethods {
    public static void main(String[] args) {
        System.out.println("The factorial of given number is " + factorial(5));
        System.out.println("The fibonacci value of given number is " + fibonacci(20));
        System.out.println("The Gcd of given number is " + gcd(12, 8));
        System.out.print("S(n)=");
        len(10);
    }

    public static int factorial(int n) {        //Exercise 13.1
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {        //Exercise 13.2
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void len(int n) {             //Exercise 13.3
        if (n <= 0) {
            return;
        } else {
            len(n - 1);
            System.out.print(" " + n);
        }
    }
    public static int gcd(int a, int b) {       //Exercise 13.4
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }
}


