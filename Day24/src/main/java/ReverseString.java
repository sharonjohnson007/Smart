package main.java;

import java.util.Scanner;

/**
 * To reverse the String prompted by user.
 */
public class ReverseString {
    public static void main(String[] args) {
        String inStr, rvstr;
        int inStrLen;
        rvstr = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            rvstr = rvstr + inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String " + inStr + " is " + rvstr);
    }
}
