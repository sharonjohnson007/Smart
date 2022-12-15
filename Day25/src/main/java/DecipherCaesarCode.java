package main.java;

import java.util.Scanner;

/**
 * To compute the Decipher text that prompts the user for string.
 */
public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar, decipher;
        decipher = "";
        System.out.print("The ciphertext string is: ");
        inChar = in.next().toUpperCase();
        char[] a = inChar.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'A') {
                System.out.print("X");
            } else if (a[i] == 'B') {
                System.out.print("Y");
            } else if (a[i] == 'C') {
                System.out.print("Z");
            } else {
                decipher += (char) (a[i] - 3);
            }
        }
        System.out.println("The plaintext is : "+decipher);
    }
}
