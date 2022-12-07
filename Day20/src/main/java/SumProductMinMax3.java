package main.java;

import java.util.Scanner;

/**
 * To add three Integers which prompts user to enter three integers.
 */
public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        int sum, product, min, max;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter Second integer: ");
        number2 = in.nextInt();//
        System.out.print("Enter Third integer: ");
        number3 = in.nextInt();
        in.close();
        sum = number1 + number2 + number3;
        System.out.println("The sum is: " + sum);
        product = number1 * number2 * number3;
        System.out.println("The product is: " + product);
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        System.out.println("The min is: " + min);
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("The max is: " + max);
    }
}
