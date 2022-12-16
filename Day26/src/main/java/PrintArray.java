package main.java;

import java.util.Scanner;

/**
 * To print array which prompts user for the number of items and elements in an array.
 */
public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        String outputStr = "";
        int item;// Declare array name, to be allocated after NUM_ITEMS is known
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
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                outputStr += items[i];
            } else {
                outputStr += ", " + items[i];
            }
        }
        System.out.println("The values are: " + "[" + outputStr + "]");
    }
}
