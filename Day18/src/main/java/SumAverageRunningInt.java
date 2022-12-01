package main.java;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        double average;
        double count = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
         for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum = sum + number;
            count++;
        }
        System.out.println("Sum using for loop  "+sum);
        average = (sum / count);
        System.out.println("Average using for loop  "+average);
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
            count++;
        }
        System.out.println("Sum using for while loop  "+sum);
        average=(sum/count);
        System.out.println("Average using for while loop  "+average);
       do {
            sum += number;
            ++number;
            count++;
        } while (number <= UPPERBOUND);
        System.out.println("Sum using for dowhile loop  "+sum);
        average=(sum/count);
        System.out.println("Average using for dowhile loop  "+average);
    }
}

