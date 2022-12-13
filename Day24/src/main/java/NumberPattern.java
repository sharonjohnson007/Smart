package main.java;

import java.util.Scanner;

/**
 * To print different number pattern using loop that prompts user for size
 */
public class NumberPattern {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size (a non-negative integer): ");
        size = in.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int row = 1; row <= size; row++) {
            int count = 1;
            for (int k = 1; k <= row - 1; k++) {
                System.out.print("  ");
            }
            for (int col = row; col <= size; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
        for (int row = 1; row <= size; row++) {
            for (int space = size - 1; space >= row; space--) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
