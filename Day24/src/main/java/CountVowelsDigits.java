package main.java;

import java.util.Scanner;

/**
 * To count the vowels and digit in the given string from the user.
 */
public class CountVowelsDigits {
    public static void main(String[] args) {
        String inStr;
        int v = 0, n = 0;    //To count vowel and digit v and n.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        char a[] = inStr.toCharArray();
        double b = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                v++;
            } else if (a[i] >= '0' && a[i] <= '9') {
                n++;
            }
        }
        double percentage = (v * 100 / b);
        System.out.printf("Number of vowels:%d (%.2f%%) %n", v, percentage);
        percentage = (n * 100 / b);
        System.out.printf("Number of vowels:%d (%.2f%%) %n", n, percentage);
    }
}
