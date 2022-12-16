package main.java;

import java.util.Scanner;

/**
 * To convert decimal number to its equivalent hexadecimal string.
 */
public class Dec2Hex {
    public static void main(String[] args) {
        int inInt = 0, index;
        String inStr = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.print("Enter a decimal number: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            inInt = in.nextInt();
            while (inInt > 0) {
                index = inInt % 16;
                inStr = hex[index] + inStr;
                inInt = inInt / 16;
            }
            System.out.print("The equivalent hexadecimal number is " + inStr + "\n");
        } else {
            System.out.println("error: invalid decimal number ");
        }
    }
}

