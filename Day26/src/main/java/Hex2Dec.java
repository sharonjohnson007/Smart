package main.java;

import java.util.Scanner;

/**
 * To convert an input Hexadecimal string into its equivalent decimal number
 */
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr, hString = "";
        char inChar;
        boolean flag = true;
        System.out.print("Enter a Hexadecimal String: ");
        inStr = in.next();
        for (int i = 0; i < inStr.length() - 1; i++) {
            inChar = (inStr.charAt(i));
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                System.out.println("error: invalid hexa string " + inStr);
                flag = false;
                break;
            }
        }
        if (flag) {
            hString = String.valueOf(Integer.parseInt(inStr, 16));
            System.out.println("The equivalent decimal number for  " + inStr + " is: " + hString);
        }
    }
}
