package main.java;

import java.util.Scanner;

/**
 * To compute the ciphertext that prompts the user for string.
 */
public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar;
        String caesar="";
        System.out.print("Enter a plaintext string: ");
        inChar = in.next().toUpperCase();
        char[] a = inChar.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'X') {
                System.out.print("A");
            } else if (a[i] == 'Y') {
                System.out.print("B");
            } else if (a[i] == 'Z') {
                System.out.print("C");
            } else {
                caesar+=(char) (a[i] + 3); // Based on unicode value.
            }
        }
        System.out.println("The ciphertext string is: "+caesar);
    }
}














