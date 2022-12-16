package main.java;

import java.util.Scanner;

/**
 * To compute average,minimum,maximum for grades stored in an array.
 */
public class GradesStatistics {
    public static void main(String[] args) {
        final int NUM_STUDENTS;
        int[] grades;
        int average, sum = 0, i, min, max;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        NUM_STUDENTS = in.nextInt();
        grades = new int[NUM_STUDENTS];
        for (i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student" + (i + 1) + ": ");// Read all items
            grades[i] = in.nextInt();
            sum = sum + grades[i];
        }
        min = grades[0];
        max = grades[0];
        for (i = 1; i < grades.length - 1; i++) {
            if (grades[i] <= min) {
                min = grades[i];
            }
            if (grades[i] >= max) {
                max = grades[i];
            }
        }
        average = sum / NUM_STUDENTS;
        System.out.println("The average is: " + average);
        System.out.println("The minimum is:" + min);
        System.out.println("The maximum is:" + max);
    }
}
