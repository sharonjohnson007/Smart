package main.java;

import java.util.Scanner;

/**
 * To convert an input Binary string into its equivalent decimal number
 */
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr, bString = "";
        char inChar;
        boolean flag = true;
        System.out.print("Enter a Binary String: ");
        inStr = in.next();
        for (int i = 0; i < inStr.length() - 1; i++) {
            inChar = (inStr.charAt(i));
            if (!(inChar == '0' || inChar == '1')) {
                System.out.println("error: invalid binary string " + inStr);
                flag = false;
                break;
            }
        }
        if (flag) {
            bString = String.valueOf(Integer.parseInt(inStr, 2));
            System.out.println("The equivalent decimal number for binary " + inStr + " is: " + bString);
        }
    }
}

