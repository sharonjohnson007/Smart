package main.java;

import java.util.Scanner;

/**
 * To compute the average, minimum, maximum, median and standard deviation of given grades.
 */
public class GradesStatistics {
    public static int[] grades;
    public int students;

    public static void main(String[] args) {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.printf("The average is %.2f%n ", average(grades));
        System.out.printf("The median is %.2f%n", gradesStatistics.median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f ", stdDev(grades));
    }

    public void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        students = in.nextInt();
        grades = new int[students];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student" + (i + 1) + ": ");
            grades[i] = in.nextInt();
            int sum = 0;
            sum = sum + grades[i];
        }
    }

    public static void print(int[] array) {
        String outputStr = "";
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                outputStr += array[i];
            } else {
                outputStr += ", " + array[i];
            }
        }
        System.out.println("[" + outputStr + "]");
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {

            sum = sum + grades[i];
        }
        return sum / grades.length;
    }

    public double median(int[] array) {
        double m = 0;
        if (students % 2 == 1) {
            m = array[((students + 1) / 2) - 1];
        } else {
            m = (array[students / 2 - 1] + array[students / 2]) / 2;
        }
        return m;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < grades.length - 1; i++) {
            if (grades[i] >= max) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < grades.length - 1; i++) {
            if (grades[i] <= min) {
                min = grades[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0.0;
        for (double i : array) {
            sum += i;
        }
        int length = array.length;
        double mean = sum / length;
        double standardDeviation = 0.0;
        for (double num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / length);
    }
}


