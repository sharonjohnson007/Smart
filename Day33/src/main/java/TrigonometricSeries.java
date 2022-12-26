package main.java;

/**
 * To compute sin(x) and cos(x) using the following series expansion
 */

public class TrigonometricSeries {
    public static void main(String[] args) {
        System.out.println(sin(Math.PI / 3, 10));
        System.out.println(Math.sin(Math.PI / 3));

    }

    public static double calculateTerm(double x, int numTerms) {
        double term = 1D;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    public static double sin(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                result += 1 * calculateTerm(x, (2 * i + 1));
            } else {
                result += -1 * calculateTerm(x, (2 * i + 1));
            }
        }
        return result;
    }

    private double cos(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                result += 1 * calculateTerm(x, 2 * i);
            } else {
                result += -1 * calculateTerm(x, 2 * i);
            }
        }
        return result;
    }
}