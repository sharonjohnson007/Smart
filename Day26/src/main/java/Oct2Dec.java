package main.java;

import java.util.Scanner;

/**
 * To convert an input Octal string into its equivalent decimal number
 */
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr, hString = "";
        char inChar;
        boolean flag = true;
        System.out.print("Enter a Octal String: ");
        inStr = in.next();
        for (int i = 0; i < inStr.length() - 1; i++) {
            inChar = (inStr.charAt(i));
            //Condition to be an octal string.
            if (!(Character.isDigit(inChar))) {
                System.out.println("error: invalid Octal string " + inStr);
                flag = false;
                break;
            }
        }
        if (flag) {
            hString = String.valueOf(Integer.parseInt(inStr, 8));
        }
        System.out.println("The equivalent decimal number for " + inStr + " is: " + hString);
    }
}
