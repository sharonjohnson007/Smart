package main.java;

import java.util.Scanner;

/**
 * To check the phrase prompted by user is palindrome or not.
 */
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        boolean isPalindrome = false;
        System.out.print("Enter a String: ");
        str = in.nextLine().toLowerCase();
        str = str.replaceAll("\\p{Punct}", "");
        int strLen = str.length();
        for (int fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            isPalindrome = str.charAt(fIdx) == str.charAt(bIdx);
        }
        if (isPalindrome) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}

