package main.java;

import java.util.Scanner;

/**
 * To compute sum of digits by prompting the user's input.
 */

public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = sc.nextInt();
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            sum +=inDigit;
            inNumber = inNumber / 10;
        }
        System.out.println("Integer after reverse: "+sum);
    }
}
