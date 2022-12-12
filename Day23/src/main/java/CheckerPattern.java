package main.java;

import java.util.Scanner;

/**
 * To print checker pattern using loop that prompts size from the user.
 */
public class CheckerPattern {
    public static void main(String[] args) {
        int size;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size (a non-negative integer): ");
        size=in.nextInt();
        for (int row = 1; row <= size; row++) {
            if ((row % 2) == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}