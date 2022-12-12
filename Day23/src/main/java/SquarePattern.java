package main.java;

import java.util.Scanner;

/**
 * To print square pattern using loops that prompts size from the user
 */
public class SquarePattern {
    public static void main(String[] args) {
        int size = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size(a non-negative integer): ");
        //Using for loop
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        //Using do-while loop
        System.out.println("Using do-while loop:");
        int row = 1;
        int col;
        do {
            col = 1;
            do {
                System.out.print("# ");
                col++;
            } while (col <= size);
            row++;
            System.out.println();
        } while (row <= size);
    }
}



