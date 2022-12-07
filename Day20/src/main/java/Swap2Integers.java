package main.java;

import java.util.Scanner;

/**
 * To swap the content of two integers which prompts the user for two integers
 */
public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        number1 = in.nextInt();
        System.out.print("Enter number2: ");
        number2 = in.nextInt();
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swaping number1= " + number1);
        System.out.println("After swaping number2= " + number2);
    }
}
