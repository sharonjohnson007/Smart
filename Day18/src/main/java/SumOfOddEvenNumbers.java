package main.java;

/**
 * To produce two sums: sum of odd numbers and sum of even numbers
 */
public class SumOfOddEvenNumbers {
    public static void main(String[] args) {
        int sumOdd = 0;
        int count = 0;
        int sumEven = 0;
        int absDiff;
        //To find the sumOdd and sumEven
        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                sumOdd = sumOdd + number;
            } else {
                sumEven = sumEven + number;
            }
        }
        System.out.println("sum of oddnum" + sumOdd);
        System.out.println("Sum of Evennum" + sumEven);
        //To Compute their absolute difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        System.out.println(absDiff);
    }
}
