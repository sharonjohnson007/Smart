package main.java;

import java.util.Scanner;

/**
 * To verify the given input contains the digit 8.
 */
public class MagicSum {
    public static void main(String[] args) {
        System.out.println("Using method: " + hasEight(98));
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();
        while (number != SENTINEL) {
            if (number % 10 == 8 || number == 8) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is:" + sum);
    }

    public static boolean hasEight(int number) {
        if (number % 10 == 8 || number == 8) {
            return true;
        } else {
            return false;
        }
    }
}
