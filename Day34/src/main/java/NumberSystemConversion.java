package main.java;

import java.util.Scanner;

/**
 * To convert a positive integer from one radix into another.
 */

public class NumberSystemConversion {
    final static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static void main(String[] args) {
        NumberSystemConversion aNumberConversion = new NumberSystemConversion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.printf("\"%1$s\"in radix %2$d is \"%3$s\" in radix %4$d.\n", in, inRadix, aNumberConversion.toRadix(in, inRadix, outRadix), outRadix);
    }

    private int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    private String toRadix(int number, int radix) {
        String result = "";
        if (radix == 0) {
            return result;
        }

        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    private String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }
}



        

