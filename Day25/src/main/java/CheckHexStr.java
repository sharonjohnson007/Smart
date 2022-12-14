package main.java;

import java.util.Scanner;

/**
 * To verify whether the prompted string hexString or not.
 */
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar;
        boolean hexStr = false;
        System.out.print("Enter a hex string: ");
        inChar = in.next();
        for (int i = 0; i < inChar.length(); i++) {
            if (!((inChar.charAt(i) >= '0' && inChar.charAt(i) <= '9') || (inChar.charAt(i) >= 'A' && inChar.charAt(i) <= 'F')
                    || (inChar.charAt(i) >= 'a' && inChar.charAt(i) <= 'f'))) {
                hexStr = false;
            } else {
                hexStr = true;
            }
        }
        if (hexStr) {
            System.out.println(inChar + " " + "is a hex string");
        } else {
            System.out.println(inChar + " " + "is not a hex string");
        }
    }
}
