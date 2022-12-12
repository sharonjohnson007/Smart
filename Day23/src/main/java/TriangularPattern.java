package main.java;

import java.util.Scanner;

/**
 * To print different triangle using loops that prompts size from the user
 */

public class TriangularPattern {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size (a non-negative integer): ");
        size = in.nextInt();
        //To print left triangle increasing triangle
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        //To print left triangle decreasing triangle
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        //To print right triangle decreasing triangle
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        //To print right triangle increasing triangle
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
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

