package main.java;

/**
 * To compute e and exp(x) and  sum of the series using the series expansion.
 */

public class Series {
    public static void main(String[] args) {
        System.out.println(exp(1, 3));
        System.out.println(specialSeries(1, 3));
    }

    public static double factorial(double fac) {
        double sum = 1;
        for (int i = 1; i <= fac; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static double exp(double x, int numTerms) {
        double expo = 1;
        for (double j = 1; j <= numTerms; j++) {
            expo += (Math.pow(x, j) / factorial(j));
        }
        return expo;
    }

    //To compute sum of the series
    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        for (int k = 1; k < numTerms; k++) {
            double xpow = Math.pow(x, 2 * k + 1) / (double) (2 * k + 1);
            for (int i = 2 * k - 1; i > 0; i -= 2) {
                xpow *= i / (double) (i + 1);
            }
            sum += xpow;
        }
        return sum;
    }
}

