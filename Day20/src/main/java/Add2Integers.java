package main.java;

import java.util.Scanner;

/**
 * To add two Integers which prompts user to enter two integers.
 */
public class Add2Integers {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter Second integer: ");
        number2 = in.nextInt();
        in.close();
        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
