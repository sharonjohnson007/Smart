package main.java;

import java.util.Scanner;

/**
 * To check the String prompted by user is palindrome or not.
 */
public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        String str2 = "";
        System.out.print("Enter a String: ");
        str = in.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if (str.equals(str2)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}

