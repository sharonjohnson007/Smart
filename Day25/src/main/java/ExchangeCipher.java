package main.java;

import java.util.Scanner;

/**
 * To compute the ciphertext that prompts the user for string.
 */
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar, exchangeCipher = "";
        System.out.print("Enter a plaintext string: ");
        inChar = in.next().toUpperCase();
        char[] a = inChar.toCharArray();
        for (int i = 0; i < inChar.length(); i++) {
            if (inChar.charAt(i) == 'A') {
                exchangeCipher += "Z";
            }
            if (inChar.charAt(i) == 'B') {
                exchangeCipher += "Y";
            }
            if (inChar.charAt(i) == 'C') {
                exchangeCipher += "X";
            }
            if (inChar.charAt(i) == 'D') {
                exchangeCipher += "W";
            }
            if (inChar.charAt(i) == 'E') {
                exchangeCipher += "V";
            }
            if (inChar.charAt(i) == 'F') {
                exchangeCipher += "U";
            }
            if (inChar.charAt(i) == 'G') {
                exchangeCipher += "T";
            }
            if (inChar.charAt(i) == 'H') {
                exchangeCipher += "S";
            }
            if (inChar.charAt(i) == 'I') {
                exchangeCipher += "R";
            }
            if (inChar.charAt(i) == 'J') {
                exchangeCipher += "Q";
            }
            if (inChar.charAt(i) == 'K') {
                exchangeCipher += "P";
            }
            if (inChar.charAt(i) == 'L') {
                exchangeCipher += "O";
            }
            if (inChar.charAt(i) == 'M') {
                exchangeCipher += "N";
            }
            if (inChar.charAt(i) == 'N') {
                exchangeCipher += "N";
            }
            if (inChar.charAt(i) == 'O') {
                exchangeCipher += "L";
            }
            if (inChar.charAt(i) == 'P') {
                exchangeCipher += "K";
            }
            if (inChar.charAt(i) == 'Q') {
                exchangeCipher += "J";
            }
            if (inChar.charAt(i) == 'R') {
                exchangeCipher += "I";
            }
            if (inChar.charAt(i) == 'S') {
                exchangeCipher += "H";
            }
            if (inChar.charAt(i) == 'T') {
                exchangeCipher += "G";
            }
            if (inChar.charAt(i) == 'U') {
                exchangeCipher += "F";
            }
            if (inChar.charAt(i) == 'V') {
                exchangeCipher += "E";
            }
            if (inChar.charAt(i) == 'W') {
                exchangeCipher += "D";
            }
            if (inChar.charAt(i) == 'X') {
                exchangeCipher += "C";
            }
            if (inChar.charAt(i) == 'Y') {
                exchangeCipher += "B";
            }
            if (inChar.charAt(i) == 'Z') {
                exchangeCipher += "A";
            }
        }
        System.out.println("The ciphertext is: " + exchangeCipher);
    }
}
