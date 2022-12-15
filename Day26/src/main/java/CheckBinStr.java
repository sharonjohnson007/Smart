package main.java;

import java.util.Scanner;

/**
 * To check whether the input prompted by the user is a Binary string.
 */
public class CheckBinStr {
    public static void main(String[] args) {
        String inStr;
        char inChar;
        boolean isValid;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        inStr = in.next();
        isValid = true;
        for (int i = 0; i < inStr.length(); i++) {
            inChar = (inStr.charAt(i));
            //Condition to be a binary string 0 and 1 only
            if (!(inChar == '0' || inChar == '1')) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println(inStr + " is a binary string");
        } else {
            System.out.println(inStr + " is NOT a binary string");
        }
    }
}
