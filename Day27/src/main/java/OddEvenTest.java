package main.java;

import java.util.Scanner;

/**
 * To test given output is odd or not
 */
public class OddEvenTest {
    public static void main(String[] args) {
        System.out.println("Using isOdd method " + isOdd(5));
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = in.nextInt();
        if (number % 2 != 0) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + "is an even number");
        }
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
