package main.java;

import java.util.Scanner;

/**
 * To revere the digit given by user.
 */

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = sc.nextInt();
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            sum = sum * 10 + inDigit;
            inNumber = inNumber / 10;
        }
        System.out.println("Integer after reverse: " + sum);
    }
}
