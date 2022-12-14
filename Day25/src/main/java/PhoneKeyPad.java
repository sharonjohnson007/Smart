package main.java;

import java.util.Scanner;

/**
 * The alphabets which is prompted by user are mapped to digits
 */
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inChar;
        System.out.print("Enter a String: ");
        inChar = in.next().toLowerCase();
        for (int i = 0; i < inChar.length(); i++) {
            switch (inChar.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.println(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.println(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.println(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.println(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.println(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.println(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.println(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.println(9);
                    break;
                default:
                    System.out.println("Enter a valid String !!");
                    break;
            }
        }
        System.out.println("Keypad value using nested-if:");
        for (int i = 0; i < inChar.length(); i++) {
            if (inChar.charAt(i) == 'a' || inChar.charAt(i) == 'b' || inChar.charAt(i) == 'c') {
                System.out.println(2);
            }
            if (inChar.charAt(i) == 'd' || inChar.charAt(i) == 'e' || inChar.charAt(i) == 'f') {
                System.out.println(3);
            }
            if (inChar.charAt(i) == 'g' || inChar.charAt(i) == 'h' || inChar.charAt(i) == 'i') {
                System.out.println(4);
            }
            if (inChar.charAt(i) == 'j' || inChar.charAt(i) == 'k' || inChar.charAt(i) == 'l') {
                System.out.println(5);
            }
            if (inChar.charAt(i) == 'm' || inChar.charAt(i) == 'n' || inChar.charAt(i) == 'o') {
                System.out.println(6);
            }
            if (inChar.charAt(i) == 'p' || inChar.charAt(i) == 'q' || inChar.charAt(i) == 'r' || inChar.charAt(i) == 's') {
                System.out.println(7);
            }
            if (inChar.charAt(i) == 't' || inChar.charAt(i) == 'u' || inChar.charAt(i) == 'v') {
                System.out.println(8);
            }
            if (inChar.charAt(i) == 'w' || inChar.charAt(i) == 'x' || inChar.charAt(i) == 'y' || inChar.charAt(i) == 'z') {
                System.out.println(9);
            }
        }
    }
}


