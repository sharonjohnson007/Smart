package main.java;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        double average;
        double count = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        //Using a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum = sum + number;
            count++;
        }
        System.out.println("Sum using for loop  " + sum);
        average = (sum / count);
        System.out.println("Average using for loop  " + average);
        int number = LOWERBOUND;
        count = 0;
        sum = 0;
        //Using a while-loop to sum from lowerbound to upperbound
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
            count++;
        }
        System.out.println("Sum using  while loop  " + sum);
        average = (sum / count);
        System.out.println("Average using  while loop  " + average);
        count = 0;
        sum = 0;
        number = LOWERBOUND;
        //Using a dowhile-loop to sum from lowerbound to upperbound
        do {
            sum += number;
            ++number;
            count++;
        } while (number <= UPPERBOUND);
        System.out.println("Sum using  dowhile loop  " + sum);
        average = (sum / count);
        System.out.println("Average using  dowhile loop  " + average);
    }
}

