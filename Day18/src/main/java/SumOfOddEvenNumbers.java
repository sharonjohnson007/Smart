package main.java;

public class SumOfOddEvenNumbers {
    public static void main(String[] args) {
        int sumOdd  = 0;
        int count=0;// Accumulating sum of odd numbers
        int sumEven = 0;   // Accumulating sum of even numbers
        int absDiff;
        for(int number=1;number<=100;number++){
            if(number%2!=0){
                sumOdd=sumOdd+number;
            }
            else {
                sumEven=sumEven+number;
            }
        }
        System.out.println("sum of oddnum"+sumOdd);
        System.out.println("Sum of Evennum"+sumEven);
        if (sumOdd > sumEven) {
            absDiff =sumOdd-sumEven;
        } else {
            absDiff =sumEven-sumOdd;
        }
        System.out.println(absDiff);
    }
}
