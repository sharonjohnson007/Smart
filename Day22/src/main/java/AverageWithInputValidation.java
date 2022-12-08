package main.java;

import java.util.Scanner;

/**
 * To compute the average that prompts user for the mark (between 0-100) of 3 students.
 */
public class AverageWithInputValidation {

    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;
        Scanner sc = new Scanner(System.in);
        //To verify whether the input is valid
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ":");
            numberIn = sc.nextInt();
            isValid = false;
            do {
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        average = (sum / 3);
        System.out.println("The average is: " + average);
    }
}
