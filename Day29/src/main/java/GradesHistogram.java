package main.java;

import java.util.Scanner;

/**
 * To display the horizontal and vertical histograms which reads in n grades.
 */
public class GradesHistogram {
    public static int[] grades;
    public static int students;
    public int[] bins = new int[10];

    public static void main(String[] args) {
        GradesHistogram histogram = new GradesHistogram();
        histogram.readGrades();
        histogram.computeHistogram();
        histogram.printHistogramHorizontal();
        histogram.printHistogramVertical();

    }

    public void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        students = in.nextInt();
        grades = new int[students];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student" + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
    }

    private void computeHistogram() {
        for (int i = 0; i < grades.length; i++) {
            int j = (grades[i] == 100) ? 9 : grades[i] / 10;
            bins[j] += 1;
        }
    }

    private void printHistogramHorizontal() {
        System.out.println();
        for (int i = 0; i < bins.length; i++) {
            int delta = (i == bins.length - 1) ? 10 : 9;
            System.out.printf("%2d -%3d:", (i * 10), (i * 10 + delta));
            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printHistogramVertical() {
        int maxBin = bins[0];
        for (int i = 0; i < bins.length; i++) {
            if (bins[i] > maxBin) {
                maxBin = bins[i];
            } else {
                maxBin = maxBin;
            }
        }
        System.out.println();
        for (int i = maxBin; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < bins.length; j++) {
                    int delta = (j == bins.length - 1) ? 10 : 9;
                    System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
                }
            } else {
                for (int j = 0; j < bins.length; j++) {
                    String str = (bins[j] < i) ? " " : "*";
                    System.out.printf("%3s%-2s ", str, " ");
                }
            }
            System.out.println();
        }
    }
}











