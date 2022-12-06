package main.java;

/**
 * To compute the value of π, using the series expansion.
 */
public class ComputePI {
    public static void main(String[] args) {
        double result1 = findPi(1000);
        double result2 = findPi(10000);
        double result3 = findPi(100000);
        double result4 = findPi(1000000);
        System.out.println("--------------------------");
        double result5 = computePiUsingMAX_TERM(1000);
        double result6 = computePiUsingMAX_TERM(10000);
        double result7 = computePiUsingMAX_TERM(100000);
        double result8 = computePiUsingMAX_TERM(1000000);
        System.out.println("--------------------------");
        mathPi();
        System.out.println("--------------------------");
        System.out.println("Percents of MathPi with MAX_DENOMINATOR: " + calculatedPercent(result1));
        System.out.println("Percents of MathPi with MAX_DENOMINATOR: " + calculatedPercent(result2));
        System.out.println("Percents of MathPi with MAX_DENOMINATOR: " + calculatedPercent(result3));
        System.out.println("Percents of MathPi with MAX_DENOMINATOR: " + calculatedPercent(result4));
        System.out.println("--------------------------");
        System.out.println("Percents of MathPi with MAX_TERM: " + calculatedPercent(result5));
        System.out.println("Percents of MathPi with MAX_TERM: " + calculatedPercent(result6));
        System.out.println("Percents of MathPi with MAX_TERM: " + calculatedPercent(result7));
        System.out.println("Percents of MathPi with MAX_TERM: " + calculatedPercent(result8));

    }

    //To calculate using MAX_DENOMINATOR
    public static double findPi(double MAX_DENOMINATOR) {
        double sum = 0.0;
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (1 / denominator);
            } else if (denominator % 4 == 3) {
                sum -= (1 / denominator);
            } else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("Pi values using different MAX_DENOMINATOR: " + sum * 4);
        return sum * 4;
    }

    //To calculate using MAX_TERM
    public static double computePiUsingMAX_TERM(double MAX_TERM) {
        double sum = 0.0;
        for (double term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum1 += 1.0 / (term * 2 - 1);
            } else {
                sum1 -= 1.0 / (term * 2 - 1);
            }
        }
        System.out.println("Pi values using different MAX_TERM: " + sum * 4);
        return sum * 4;
    }

    //Pi values of built-in double constant Math.PI
    public static void mathPi() {
        System.out.println("Pi value in built-in double constant Math.PI: " + Math.PI);
    }

    //To calculate percents of Math.PI with values obtained
    public static double calculatedPercent(double result) {
        return (result / Math.PI) * 100;
    }
}









