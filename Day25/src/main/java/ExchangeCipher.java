package main.java;

import java.util.Scanner;

/**
 *To compute the ciphertext that prompts the user for string.
 */
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar;
        System.out.print("Enter a plaintext string: ");
        inChar = in.next().toUpperCase();
        for (int i = 0; i < inChar.length(); i++) {
            if (inChar.charAt(i) == 'A') {
                System.out.print("Z");
            }
            if (inChar.charAt(i) == 'B') {
                System.out.print("Y");
            }
            if (inChar.charAt(i) == 'C') {
                System.out.print("X");
            }
            if (inChar.charAt(i) == 'D') {
                System.out.print("W");
            }
            if (inChar.charAt(i) == 'E') {
                System.out.print("V");
            }
            if (inChar.charAt(i) == 'F') {
                System.out.print("U");
            }
            if (inChar.charAt(i) == 'G') {
                System.out.print("T");
            }
            if (inChar.charAt(i) == 'H') {
                System.out.print("S");
            }
            if (inChar.charAt(i) == 'I') {
                System.out.print("R");
            }
            if (inChar.charAt(i) == 'J') {
                System.out.print("Q");
            }
            if (inChar.charAt(i) == 'K') {
                System.out.print("P");
            }
            if (inChar.charAt(i) == 'L') {
                System.out.print("O");
            }
            if (inChar.charAt(i) == 'M') {
                System.out.print("N");
            }
            if (inChar.charAt(i) == 'N') {
                System.out.print("M");
            }
            if (inChar.charAt(i) == 'O') {
                System.out.print("L");
            }
            if (inChar.charAt(i) == 'P') {
                System.out.print("K");
            }
            if (inChar.charAt(i) == 'Q') {
                System.out.print("J");
            }
            if (inChar.charAt(i) == 'R') {
                System.out.print("I");
            }
            if (inChar.charAt(i) == 'S') {
                System.out.print("H");
            }
            if (inChar.charAt(i) == 'T') {
                System.out.print("G");
            }
            if (inChar.charAt(i) == 'U') {
                System.out.print("F");
            }
            if (inChar.charAt(i) == 'V') {
                System.out.print("E");
            }
            if (inChar.charAt(i) == 'W') {
                System.out.print("D");
            }
            if (inChar.charAt(i) == 'X') {
                System.out.print("C");
            }
            if (inChar.charAt(i) == 'Y') {
                System.out.print("B");
            }
            if (inChar.charAt(i) == 'Z') {
                System.out.print("A");
            }
        }
    }
}
