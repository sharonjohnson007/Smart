package main.java;

import java.util.Scanner;

/**
 *To convert an input string into its equivalent decimal number for N radix.
 */
public class RadixN2Dec {
    public static void main(String[] args) {
        String inStr1, bString = "";
        int radix;
        boolean flag = true;
        char inChar;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix, it should be 2/8/10/16: ");
        radix = in.nextInt();
        System.out.print("Enter the String: ");
        inStr1 = in.next();
        for (int i = 0; i <= inStr1.length() - 1; i++) {
            inChar = (inStr1.charAt(i));
            if (!(Character.isLetter(inChar))) {
                if (radix == 2) {
                    if (!(inChar == '0' || inChar == '1')) {
                        System.out.println("error: invalid binary string " + inStr1);
                        flag = false;
                        break;
                    }
                } else if (radix == 8) {
                    if (!((inChar >= '0' && inChar <= '7'))) {
                        System.out.println("error: invalid octal string " + inStr1);
                        flag = false;
                        break;
                    }
                } else if (radix == 10) {
                    if (!((inChar >= '0' && inChar <= '9'))) {
                        System.out.println("error: invalid decimal string " + inStr1);
                        flag = false;
                        break;
                    }
                }
            }
            if (radix == 16) {
                if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                        || (inChar >= 'a' && inChar <= 'f'))) {
                    System.out.println("error: invalid hexadecimal string " + inStr1);
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            bString = String.valueOf(Integer.parseInt(inStr1, radix));
            System.out.println("The equivalent decimal number for  " + inStr1 + " is: " + bString);
        }
    }
}
