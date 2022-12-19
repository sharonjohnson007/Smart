package main.java;

import java.util.Scanner;

/**
 * To convert hexadecimal string to its equivalent binary string.
 */
public class Hex2Bin {
    public static void main(String[] args) {
        boolean flag = true;
        char inChar;
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.next().toLowerCase();
        for (int i = 0; i < hexStr.length(); i++) {
            inChar = (hexStr.charAt(i));
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                System.out.println("error: invalid hexa string " + hexStr);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("The equivalent binary for hexadecimal %1$s is ", hexStr);
            for (int i = 0; i < hexStr.length(); i++) {
                int j = Character.digit(hexStr.charAt(i), 16);
                System.out.printf("%1$s ", HEX_BITS[j]);
            }
        }
    }
}

