package main.java;

/**
 * To reverse the digits given in the class
 */
public class ExtractDigits {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        int rev;
        while (n > 0) {
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        String result = String.valueOf(sum);      //To print with a space separating the digits.
        System.out.println(result.replace("", " "));
    }
}
