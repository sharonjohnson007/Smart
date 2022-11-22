package Main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome2 {

    private static void checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println(input + " is palindrome = " + result);
    }

    public static void main(String[] args) {

        checkPalindromeString("johnson");
        checkPalindromeString("abcba");
        checkPalindromeString("abc");
    }

}
