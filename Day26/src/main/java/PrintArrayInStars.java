package main.java;

import java.util.Scanner;

/**
 * To print the contents of the array in a graphical form represented by number of stars.
 */
public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        int item;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        item = in.nextInt();
        NUM_ITEMS = item;
        items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {  // Read all items
                items[i] = in.nextInt();
            }
        }
        for (int idx = 0; idx < items.length; ++idx) {  // row
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
        System.out.println();
    }
}
