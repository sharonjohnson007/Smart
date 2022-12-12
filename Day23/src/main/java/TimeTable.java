package main.java;

import java.util.Scanner;

/**
 * To print multiplication table that prompts size from the user.
 */

public class TimeTable {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the table (a non-negative integer): ");
        size = in.nextInt();
        for (int i = -1; i <= size; i++) {
            if (i == -1) {
                System.out.print(" *|");
            } else if (i == 0) {
                System.out.print("----");
            } else if (i > 0) {
                System.out.printf("%2d|", i);
            }
            for (int j = 1; j <= size; j++) {
                if (i == -1) {
                    System.out.printf("%4d", j);
                    continue;
                } else if (i == 0) {
                    System.out.print("----");
                    continue;
                }
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
