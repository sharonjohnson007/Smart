package main.java;

/**
 * Computing the sum of harmonics series from left-to-right and right-to-left.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        //For computing the sum from left-to-right
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R += (1 / denominator);
        }
        System.out.println(sumL2R);
        System.out.println("The sum from left-to-right is: " + sumL2R);
        //For computing the sum from right-to-left
        for (double denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
            sumR2L += (1 / denominator);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);
        //To find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute difference is" + absDiff);
    }
}
