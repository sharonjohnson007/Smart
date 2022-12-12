package main.java;

import java.util.Scanner;

/**
 * To print different type of pattern that prompts size from the user
 */
public class HillPatternX {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size (a non-negative integer): ");
        size = in.nextInt();
        //For printing hill pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        //For printing reverse hill pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
        //For printing diamond pattern
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //To print hallow diamond pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


